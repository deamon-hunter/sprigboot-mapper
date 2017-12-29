package com.gmsj.model;

import javax.persistence.*;

@Table(name = "capacity_monitor")
public class CapacityMonitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 检测类型
     */
    private String type;

    /**
     * 检测类型值
     */
    private Integer value;

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
     * 获取检测类型
     *
     * @return type - 检测类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置检测类型
     *
     * @param type 检测类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取检测类型值
     *
     * @return value - 检测类型值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置检测类型值
     *
     * @param value 检测类型值
     */
    public void setValue(Integer value) {
        this.value = value;
    }
}