package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "safety_accident")
public class SafetyAccident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private String collieryId;

    /**
     * 事故分类
     */
    private String type;

    /**
     * 事故时间
     */
    private Date date;

    /**
     * 死亡人数
     */
    @Column(name = "death_number")
    private Integer deathNumber;

    /**
     * 受伤人数
     */
    @Column(name = "injured_number")
    private Integer injuredNumber;

    /**
     * 事故原因
     */
    private String reason;

    /**
     * 事故详情
     */
    @Column(name = "detail_info")
    private String detailInfo;

    /**
     * 其它影响
     */
    @Column(name = "other_effects")
    private String otherEffects;

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
    public String getCollieryId() {
        return collieryId;
    }

    /**
     * 设置煤矿ID
     *
     * @param collieryId 煤矿ID
     */
    public void setCollieryId(String collieryId) {
        this.collieryId = collieryId;
    }

    /**
     * 获取事故分类
     *
     * @return type - 事故分类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置事故分类
     *
     * @param type 事故分类
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取事故时间
     *
     * @return date - 事故时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置事故时间
     *
     * @param date 事故时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取死亡人数
     *
     * @return death_number - 死亡人数
     */
    public Integer getDeathNumber() {
        return deathNumber;
    }

    /**
     * 设置死亡人数
     *
     * @param deathNumber 死亡人数
     */
    public void setDeathNumber(Integer deathNumber) {
        this.deathNumber = deathNumber;
    }

    /**
     * 获取受伤人数
     *
     * @return injured_number - 受伤人数
     */
    public Integer getInjuredNumber() {
        return injuredNumber;
    }

    /**
     * 设置受伤人数
     *
     * @param injuredNumber 受伤人数
     */
    public void setInjuredNumber(Integer injuredNumber) {
        this.injuredNumber = injuredNumber;
    }

    /**
     * 获取事故原因
     *
     * @return reason - 事故原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置事故原因
     *
     * @param reason 事故原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取事故详情
     *
     * @return detail_info - 事故详情
     */
    public String getDetailInfo() {
        return detailInfo;
    }

    /**
     * 设置事故详情
     *
     * @param detailInfo 事故详情
     */
    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    /**
     * 获取其它影响
     *
     * @return other_effects - 其它影响
     */
    public String getOtherEffects() {
        return otherEffects;
    }

    /**
     * 设置其它影响
     *
     * @param otherEffects 其它影响
     */
    public void setOtherEffects(String otherEffects) {
        this.otherEffects = otherEffects;
    }
}