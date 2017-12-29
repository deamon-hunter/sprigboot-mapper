package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "group")
public class Group {
    /**
     * 集团ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 集团名称
     */
    private String name;

    /**
     * 是否加入主体企业
     */
    @Column(name = "is_main_business")
    private Boolean isMainBusiness;

    @Column(name = "business_license_start")
    private Date businessLicenseStart;

    @Column(name = "business_license_end")
    private Date businessLicenseEnd;

    /**
     * 获取集团ID
     *
     * @return id - 集团ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置集团ID
     *
     * @param id 集团ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取集团名称
     *
     * @return name - 集团名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置集团名称
     *
     * @param name 集团名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否加入主体企业
     *
     * @return is_main_business - 是否加入主体企业
     */
    public Boolean getIsMainBusiness() {
        return isMainBusiness;
    }

    /**
     * 设置是否加入主体企业
     *
     * @param isMainBusiness 是否加入主体企业
     */
    public void setIsMainBusiness(Boolean isMainBusiness) {
        this.isMainBusiness = isMainBusiness;
    }

    /**
     * @return business_license_start
     */
    public Date getBusinessLicenseStart() {
        return businessLicenseStart;
    }

    /**
     * @param businessLicenseStart
     */
    public void setBusinessLicenseStart(Date businessLicenseStart) {
        this.businessLicenseStart = businessLicenseStart;
    }

    /**
     * @return business_license_end
     */
    public Date getBusinessLicenseEnd() {
        return businessLicenseEnd;
    }

    /**
     * @param businessLicenseEnd
     */
    public void setBusinessLicenseEnd(Date businessLicenseEnd) {
        this.businessLicenseEnd = businessLicenseEnd;
    }
}