package com.gmsj.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class CommonVO {

	@ApiModelProperty(value = "类型")
	private String type;

	@ApiModelProperty(value = "类型对应的具体的值")
	private String count;

	public CommonVO() {
		super();
	}

}
