package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "influence_factor")
public class InfluenceFactor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 1:产量,2:价格
     */
    @Column(name = "factor_type")
    private Integer factorType;

    /**
     * 名称
     */
    private String type;

    /**
     * 名称对应值
     */
    private Integer value;

    /**
     * 输入日期
     */
    private Date date;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取1:产量,2:价格
     *
     * @return factor_type - 1:产量,2:价格
     */
    public Integer getFactorType() {
        return factorType;
    }

    /**
     * 设置1:产量,2:价格
     *
     * @param factorType 1:产量,2:价格
     */
    public void setFactorType(Integer factorType) {
        this.factorType = factorType;
    }

    /**
     * 获取名称
     *
     * @return type - 名称
     */
    public String getType() {
        return type;
    }

    /**
     * 设置名称
     *
     * @param type 名称
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取名称对应值
     *
     * @return value - 名称对应值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置名称对应值
     *
     * @param value 名称对应值
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取输入日期
     *
     * @return date - 输入日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置输入日期
     *
     * @param date 输入日期
     */
    public void setDate(Date date) {
        this.date = date;
    }
}