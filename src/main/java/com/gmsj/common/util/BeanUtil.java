package com.gmsj.common.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyAccessorFactory;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 实体Bean工具类
 * 
 * @author hongQiang tang
 * @version $Id: BeanUtil.java, v 0.1 2017年6月20日 上午11:48:12 Administrator Exp $
 */
@Slf4j
public class BeanUtil {
	
	public static final Example createExample ( Class<?> type, Object ... fields ) {
		
		Example example = new Example( type );
		Criteria criteria = example.createCriteria();
		
		int size = fields.length % 2 == 0 ? fields.length / 2 : fields.length - 1;
		for ( int i = 0; i <= size; i += 2 ) {
			criteria.andEqualTo( fields[ i ].toString(), fields[ i + 1 ] );
		}
		
		return example;
	}
	
	public static final <T> T copyBeanFromCustom ( T bean, Object ... fields ) {
		
		// 复制的字段为空直接返回实例化后的对象
		if ( fields == null || fields.length == 0 ) return bean;
		
		// 目标类的类模板
		Class<?> beanClazz = bean.getClass();
		
		int size = fields.length % 2 == 0 ? fields.length / 2 : fields.length - 1;
		for ( int i = 0; i <= size; i += 2 ) {
			String fieldName = String.valueOf( fields [ i ] );
			Object fieldValue = fields [ i + 1 ];
			
			try {
				PropertyDescriptor descriptor = new PropertyDescriptor( fieldName, beanClazz );
				Method writeMethod = descriptor.getWriteMethod();
				writeMethod.invoke( bean, fieldValue );
			} catch ( Exception ex ) {
				continue;
			}
		}
		return bean;
	}
	
	public static final <T> T copyBean ( T bean, Object vo ) {

		if ( vo == null || bean == null ) return bean;

		Class<?> beanClazz = bean.getClass();

		Field fields [] = FieldUtils.getAllFields( vo.getClass() );
		for ( Field field : fields ) {

			int modifier = field.getModifiers();
			if ( Modifier.isFinal( modifier ) || Modifier.isNative( modifier ) || Modifier.isStatic( modifier ) ) continue;
			if ( ! Modifier.isPublic( modifier ) ) {
				field.setAccessible( true );
			}

			try {
				Object value = field.get( vo );
				if ( value == null ) continue;

				PropertyDescriptor descriptor = new PropertyDescriptor( field.getName(), beanClazz );
				Method writeMethod = descriptor.getWriteMethod();
				writeMethod.invoke( bean, value );
			} catch ( Exception ex ) {
				continue;
			}
		}

		return bean;
	}

	public static final <T> T copyBeanByTemplate ( Class<T> type, Object vo ) {

		Class<?> voClazz = vo.getClass();

		T instance = null;
		try {
			instance = type.newInstance();
			Field fields [] = FieldUtils.getAllFields( voClazz );
			for ( Field field : fields ) {
				
				int modifier = field.getModifiers();
				if ( Modifier.isFinal( modifier ) || Modifier.isNative( modifier ) || Modifier.isStatic( modifier ) ) continue;
				if ( ! Modifier.isPublic( modifier ) ) {
					field.setAccessible( true );
				}
				
				// 确保目标值不为空
				Object value = field.get( vo );
				if ( value == null ) continue;
				
				try {
					PropertyDescriptor descriptor = new PropertyDescriptor( field.getName(), type );
					Method writeMethod = descriptor.getWriteMethod();
					writeMethod.invoke( instance, value );
				} catch ( IntrospectionException ex ) {
					continue;
				}
			}
			
		} catch ( Exception e ) {
			log.error( "对象实例化失败", e );
		}
		return instance;
	}

	public static final <T> T copyBeanWithClazzByCustomField( Class<T> type, Object vo, String ... fields ) {
		
		if ( type == null || vo == null ) return null;
		
		Class<?> voClazz = vo.getClass();

		T instance = null;
		try {
			instance = type.newInstance();
			for ( String fieldName : fields ) {
				
				Field field = FieldUtils.getField( voClazz, fieldName, true );
				if ( field == null ) continue;
				
				// 确保目标值不为空
				Object value = field.get( vo );
				if ( value == null ) continue;
				
				PropertyDescriptor descriptor = new PropertyDescriptor( fieldName, type );
				Method writeMethod = descriptor.getWriteMethod();
				
				writeMethod.invoke( instance, value );
			}
			
		} catch ( Exception e ) {
			log.error( "对象实例化失败", e );
		}
		return instance;
	}
	
	public static String[] getNullPropertyNames (Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<String>();
		for(PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue == null) emptyNames.add(pd.getName());
		}
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}
	
	/**
	 * 拷贝不为空的值
	 */
	public static void copyPropertiesIgnoreNull(Object src, Object target){
		BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}


	/**
	 * 转换Map为Bean
	 */
 	public static <T> void mapToBean(Map<String, Object> m, Object target) {
		BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(target);
		beanWrapper.setAutoGrowNestedPaths(true);
		beanWrapper.setPropertyValues(m);
	}

	/**
	 * 转换Bean为Map
	 */
	public static <T> void beanToMap(Object obj, Map<String, Object> m) {
		BeanWrapper beanWrapper = new BeanWrapperImpl(obj);
		PropertyDescriptor[] descriptor = beanWrapper.getPropertyDescriptors();
		for (int i = 0; i < descriptor.length; i++) {
			String name = descriptor[i].getName();
			m.put(name,beanWrapper.getPropertyValue(name));
		}
	}
}
