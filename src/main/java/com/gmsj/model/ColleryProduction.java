package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "collery_production")
public class ColleryProduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 产煤类型
     */
    @Column(name = "coal_id")
    private Integer coalId;

    /**
     * 每月产煤量
     */
    @Column(name = "coal_production_month")
    private Float coalProductionMonth;

    /**
     * 产煤年份
     */
    private Date year;

    /**
     * 产煤月份
     */
    private Integer month;

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
     * 获取煤矿ID
     *
     * @return colliery_id - 煤矿ID
     */
    public Long getCollieryId() {
        return collieryId;
    }

    /**
     * 设置煤矿ID
     *
     * @param collieryId 煤矿ID
     */
    public void setCollieryId(Long collieryId) {
        this.collieryId = collieryId;
    }

    /**
     * 获取产煤类型
     *
     * @return coal_id - 产煤类型
     */
    public Integer getCoalId() {
        return coalId;
    }

    /**
     * 设置产煤类型
     *
     * @param coalId 产煤类型
     */
    public void setCoalId(Integer coalId) {
        this.coalId = coalId;
    }

    /**
     * 获取每月产煤量
     *
     * @return coal_production_month - 每月产煤量
     */
    public Float getCoalProductionMonth() {
        return coalProductionMonth;
    }

    /**
     * 设置每月产煤量
     *
     * @param coalProductionMonth 每月产煤量
     */
    public void setCoalProductionMonth(Float coalProductionMonth) {
        this.coalProductionMonth = coalProductionMonth;
    }

    /**
     * 获取产煤年份
     *
     * @return year - 产煤年份
     */
    public Date getYear() {
        return year;
    }

    /**
     * 设置产煤年份
     *
     * @param year 产煤年份
     */
    public void setYear(Date year) {
        this.year = year;
    }

    /**
     * 获取产煤月份
     *
     * @return month - 产煤月份
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 设置产煤月份
     *
     * @param month 产煤月份
     */
    public void setMonth(Integer month) {
        this.month = month;
    }
}