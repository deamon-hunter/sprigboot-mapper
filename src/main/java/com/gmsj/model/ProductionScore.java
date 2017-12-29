package com.gmsj.model;

import javax.persistence.*;

@Table(name = "production_score")
public class ProductionScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 评分类型
     */
    private String type;

    /**
     * 评分类型得分
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
     * 获取评分类型
     *
     * @return type - 评分类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置评分类型
     *
     * @param type 评分类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取评分类型得分
     *
     * @return value - 评分类型得分
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置评分类型得分
     *
     * @param value 评分类型得分
     */
    public void setValue(Integer value) {
        this.value = value;
    }
}