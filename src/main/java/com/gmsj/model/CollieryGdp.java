package com.gmsj.model;

import javax.persistence.*;

@Table(name = "colliery_gdp")
public class CollieryGdp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 煤炭开采行业生产总值
     */
    @Column(name = "coal_total_gross")
    private String coalTotalGross;

    /**
     * 煤炭下游行业生产总值
     */
    @Column(name = "downstreamtotal_gross")
    private String downstreamtotalGross;

    /**
     * 贵州省工业生产总值
     */
    @Column(name = "gz_total_gross")
    private String gzTotalGross;

    /**
     * 年份
     */
    private String year;

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
     * 获取煤炭开采行业生产总值
     *
     * @return coal_total_gross - 煤炭开采行业生产总值
     */
    public String getCoalTotalGross() {
        return coalTotalGross;
    }

    /**
     * 设置煤炭开采行业生产总值
     *
     * @param coalTotalGross 煤炭开采行业生产总值
     */
    public void setCoalTotalGross(String coalTotalGross) {
        this.coalTotalGross = coalTotalGross;
    }

    /**
     * 获取煤炭下游行业生产总值
     *
     * @return downstreamtotal_gross - 煤炭下游行业生产总值
     */
    public String getDownstreamtotalGross() {
        return downstreamtotalGross;
    }

    /**
     * 设置煤炭下游行业生产总值
     *
     * @param downstreamtotalGross 煤炭下游行业生产总值
     */
    public void setDownstreamtotalGross(String downstreamtotalGross) {
        this.downstreamtotalGross = downstreamtotalGross;
    }

    /**
     * 获取贵州省工业生产总值
     *
     * @return gz_total_gross - 贵州省工业生产总值
     */
    public String getGzTotalGross() {
        return gzTotalGross;
    }

    /**
     * 设置贵州省工业生产总值
     *
     * @param gzTotalGross 贵州省工业生产总值
     */
    public void setGzTotalGross(String gzTotalGross) {
        this.gzTotalGross = gzTotalGross;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }
}