package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "coal_price")
public class CoalPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤炭种类ID
     */
    @Column(name = "coal_type_id")
    private Integer coalTypeId;

    /**
     * 发热量
     */
    @Column(name = "calorific_value")
    private String calorificValue;

    /**
     * 日期
     */
    private Date date;

    @Column(name = "current_price_start")
    private String currentPriceStart;

    @Column(name = "current_price_end")
    private String currentPriceEnd;

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
     * 获取煤炭种类ID
     *
     * @return coal_type_id - 煤炭种类ID
     */
    public Integer getCoalTypeId() {
        return coalTypeId;
    }

    /**
     * 设置煤炭种类ID
     *
     * @param coalTypeId 煤炭种类ID
     */
    public void setCoalTypeId(Integer coalTypeId) {
        this.coalTypeId = coalTypeId;
    }

    /**
     * 获取发热量
     *
     * @return calorific_value - 发热量
     */
    public String getCalorificValue() {
        return calorificValue;
    }

    /**
     * 设置发热量
     *
     * @param calorificValue 发热量
     */
    public void setCalorificValue(String calorificValue) {
        this.calorificValue = calorificValue;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return current_price_start
     */
    public String getCurrentPriceStart() {
        return currentPriceStart;
    }

    /**
     * @param currentPriceStart
     */
    public void setCurrentPriceStart(String currentPriceStart) {
        this.currentPriceStart = currentPriceStart;
    }

    /**
     * @return current_price_end
     */
    public String getCurrentPriceEnd() {
        return currentPriceEnd;
    }

    /**
     * @param currentPriceEnd
     */
    public void setCurrentPriceEnd(String currentPriceEnd) {
        this.currentPriceEnd = currentPriceEnd;
    }
}