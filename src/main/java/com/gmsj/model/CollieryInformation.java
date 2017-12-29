package com.gmsj.model;

import javax.persistence.*;

@Table(name = "colliery_information")
public class CollieryInformation {
    /**
     * 煤矿ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿名称
     */
    private String name;

    /**
     * 法人名称
     */
    @Column(name = "artificial_name")
    private String artificialName;

    /**
     * 集团ID
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 煤矿所在地
     */
    private String address;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系人号码
     */
    @Column(name = "contacts_phone")
    private String contactsPhone;

    /**
     * 联系人邮箱
     */
    @Column(name = "contacts_email")
    private String contactsEmail;

    /**
     * 煤矿状态
     */
    private String status;

    /**
     * 经度
     */
    private Float longitude;

    /**
     * 纬度
     */
    private Float latitude;

    private String type;

    /**
     * 经纬度
     */
    @Column(name = "latitude_longitude")
    private String latitudeLongitude;

    /**
     * 获取煤矿ID
     *
     * @return id - 煤矿ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置煤矿ID
     *
     * @param id 煤矿ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取煤矿名称
     *
     * @return name - 煤矿名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置煤矿名称
     *
     * @param name 煤矿名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取法人名称
     *
     * @return artificial_name - 法人名称
     */
    public String getArtificialName() {
        return artificialName;
    }

    /**
     * 设置法人名称
     *
     * @param artificialName 法人名称
     */
    public void setArtificialName(String artificialName) {
        this.artificialName = artificialName;
    }

    /**
     * 获取集团ID
     *
     * @return group_id - 集团ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置集团ID
     *
     * @param groupId 集团ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取煤矿所在地
     *
     * @return address - 煤矿所在地
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置煤矿所在地
     *
     * @param address 煤矿所在地
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取联系人号码
     *
     * @return contacts_phone - 联系人号码
     */
    public String getContactsPhone() {
        return contactsPhone;
    }

    /**
     * 设置联系人号码
     *
     * @param contactsPhone 联系人号码
     */
    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    /**
     * 获取联系人邮箱
     *
     * @return contacts_email - 联系人邮箱
     */
    public String getContactsEmail() {
        return contactsEmail;
    }

    /**
     * 设置联系人邮箱
     *
     * @param contactsEmail 联系人邮箱
     */
    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail;
    }

    /**
     * 获取煤矿状态
     *
     * @return status - 煤矿状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置煤矿状态
     *
     * @param status 煤矿状态
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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