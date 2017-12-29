package com.gmsj.model;

import javax.persistence.*;

@Table(name = "downstream_enterprises_map")
public class DownstreamEnterprisesMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 经度
     */
    private Float longitude;

    /**
     * 纬度
     */
    private Float latitude;

    /**
     * 经纬度
     */
    @Column(name = "latitude_longitude")
    private String latitudeLongitude;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取经纬度
     *
     * @return latitude_longitude - 经纬度
     */
    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    /**
     * 设置经纬度
     *
     * @param latitudeLongitude 经纬度
     */
    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }
}