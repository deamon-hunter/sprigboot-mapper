package com.gmsj.model;

import javax.persistence.*;

@Table(name = "coal_type")
public class CoalType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 煤种名称
     */
    @Column(name = "coal_type")
    private String coalType;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取煤种名称
     *
     * @return coal_type - 煤种名称
     */
    public String getCoalType() {
        return coalType;
    }

    /**
     * 设置煤种名称
     *
     * @param coalType 煤种名称
     */
    public void setCoalType(String coalType) {
        this.coalType = coalType;
    }
}