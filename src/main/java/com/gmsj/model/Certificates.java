package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

public class Certificates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 采矿许可证号
     */
    @Column(name = "license_number")
    private String licenseNumber;

    /**
     * 采矿许可证有效期开始日
     */
    @Column(name = "license_start")
    private Date licenseStart;

    /**
     * 采矿许可证有效期结束日
     */
    @Column(name = "license_end")
    private Date licenseEnd;

    /**
     * 采矿许可证生产规模
     */
    @Column(name = "license_scale")
    private String licenseScale;

    /**
     * 矿区面积
     */
    @Column(name = "mining_area")
    private String miningArea;

    /**
     * 拐点坐标
     */
    @Column(name = "inflection_coordinate")
    private String inflectionCoordinate;

    /**
     * 开采标高
     */
    @Column(name = "mining_depth")
    private String miningDepth;

    /**
     * 采矿证发证日期
     */
    @Column(name = "license_issue_date")
    private Date licenseIssueDate;

    /**
     * 安全生产许可证号
     */
    @Column(name = "safe_license_number")
    private String safeLicenseNumber;

    /**
     * 安全生产许可证有效期开始日
     */
    @Column(name = "safe_license_start")
    private Date safeLicenseStart;

    /**
     * 安全生产许可证有效期结束日日
     */
    @Column(name = "safe_license_end")
    private Date safeLicenseEnd;

    /**
     * 安全生产许可证生产规模
     */
    @Column(name = "safe_license_scale")
    private String safeLicenseScale;

    /**
     * 营业执照证号
     */
    @Column(name = "business_license_number")
    private String businessLicenseNumber;

    /**
     * 经济类型
     */
    @Column(name = "economic_type")
    private String economicType;

    /**
     * 营业执照有效期开始日
     */
    @Column(name = "business_license_start")
    private Date businessLicenseStart;

    /**
     * 营业执照有效期结束日
     */
    @Column(name = "business_license_end")
    private Date businessLicenseEnd;

    /**
     * 设计批准文号
     */
    @Column(name = "approval_number")
    private String approvalNumber;

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
     * 获取采矿许可证号
     *
     * @return license_number - 采矿许可证号
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置采矿许可证号
     *
     * @param licenseNumber 采矿许可证号
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * 获取采矿许可证有效期开始日
     *
     * @return license_start - 采矿许可证有效期开始日
     */
    public Date getLicenseStart() {
        return licenseStart;
    }

    /**
     * 设置采矿许可证有效期开始日
     *
     * @param licenseStart 采矿许可证有效期开始日
     */
    public void setLicenseStart(Date licenseStart) {
        this.licenseStart = licenseStart;
    }

    /**
     * 获取采矿许可证有效期结束日
     *
     * @return license_end - 采矿许可证有效期结束日
     */
    public Date getLicenseEnd() {
        return licenseEnd;
    }

    /**
     * 设置采矿许可证有效期结束日
     *
     * @param licenseEnd 采矿许可证有效期结束日
     */
    public void setLicenseEnd(Date licenseEnd) {
        this.licenseEnd = licenseEnd;
    }

    /**
     * 获取采矿许可证生产规模
     *
     * @return license_scale - 采矿许可证生产规模
     */
    public String getLicenseScale() {
        return licenseScale;
    }

    /**
     * 设置采矿许可证生产规模
     *
     * @param licenseScale 采矿许可证生产规模
     */
    public void setLicenseScale(String licenseScale) {
        this.licenseScale = licenseScale;
    }

    /**
     * 获取矿区面积
     *
     * @return mining_area - 矿区面积
     */
    public String getMiningArea() {
        return miningArea;
    }

    /**
     * 设置矿区面积
     *
     * @param miningArea 矿区面积
     */
    public void setMiningArea(String miningArea) {
        this.miningArea = miningArea;
    }

    /**
     * 获取拐点坐标
     *
     * @return inflection_coordinate - 拐点坐标
     */
    public String getInflectionCoordinate() {
        return inflectionCoordinate;
    }

    /**
     * 设置拐点坐标
     *
     * @param inflectionCoordinate 拐点坐标
     */
    public void setInflectionCoordinate(String inflectionCoordinate) {
        this.inflectionCoordinate = inflectionCoordinate;
    }

    /**
     * 获取开采标高
     *
     * @return mining_depth - 开采标高
     */
    public String getMiningDepth() {
        return miningDepth;
    }

    /**
     * 设置开采标高
     *
     * @param miningDepth 开采标高
     */
    public void setMiningDepth(String miningDepth) {
        this.miningDepth = miningDepth;
    }

    /**
     * 获取采矿证发证日期
     *
     * @return license_issue_date - 采矿证发证日期
     */
    public Date getLicenseIssueDate() {
        return licenseIssueDate;
    }

    /**
     * 设置采矿证发证日期
     *
     * @param licenseIssueDate 采矿证发证日期
     */
    public void setLicenseIssueDate(Date licenseIssueDate) {
        this.licenseIssueDate = licenseIssueDate;
    }

    /**
     * 获取安全生产许可证号
     *
     * @return safe_license_number - 安全生产许可证号
     */
    public String getSafeLicenseNumber() {
        return safeLicenseNumber;
    }

    /**
     * 设置安全生产许可证号
     *
     * @param safeLicenseNumber 安全生产许可证号
     */
    public void setSafeLicenseNumber(String safeLicenseNumber) {
        this.safeLicenseNumber = safeLicenseNumber;
    }

    /**
     * 获取安全生产许可证有效期开始日
     *
     * @return safe_license_start - 安全生产许可证有效期开始日
     */
    public Date getSafeLicenseStart() {
        return safeLicenseStart;
    }

    /**
     * 设置安全生产许可证有效期开始日
     *
     * @param safeLicenseStart 安全生产许可证有效期开始日
     */
    public void setSafeLicenseStart(Date safeLicenseStart) {
        this.safeLicenseStart = safeLicenseStart;
    }

    /**
     * 获取安全生产许可证有效期结束日日
     *
     * @return safe_license_end - 安全生产许可证有效期结束日日
     */
    public Date getSafeLicenseEnd() {
        return safeLicenseEnd;
    }

    /**
     * 设置安全生产许可证有效期结束日日
     *
     * @param safeLicenseEnd 安全生产许可证有效期结束日日
     */
    public void setSafeLicenseEnd(Date safeLicenseEnd) {
        this.safeLicenseEnd = safeLicenseEnd;
    }

    /**
     * 获取安全生产许可证生产规模
     *
     * @return safe_license_scale - 安全生产许可证生产规模
     */
    public String getSafeLicenseScale() {
        return safeLicenseScale;
    }

    /**
     * 设置安全生产许可证生产规模
     *
     * @param safeLicenseScale 安全生产许可证生产规模
     */
    public void setSafeLicenseScale(String safeLicenseScale) {
        this.safeLicenseScale = safeLicenseScale;
    }

    /**
     * 获取营业执照证号
     *
     * @return business_license_number - 营业执照证号
     */
    public String getBusinessLicenseNumber() {
        return businessLicenseNumber;
    }

    /**
     * 设置营业执照证号
     *
     * @param businessLicenseNumber 营业执照证号
     */
    public void setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber;
    }

    /**
     * 获取经济类型
     *
     * @return economic_type - 经济类型
     */
    public String getEconomicType() {
        return economicType;
    }

    /**
     * 设置经济类型
     *
     * @param economicType 经济类型
     */
    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }

    /**
     * 获取营业执照有效期开始日
     *
     * @return business_license_start - 营业执照有效期开始日
     */
    public Date getBusinessLicenseStart() {
        return businessLicenseStart;
    }

    /**
     * 设置营业执照有效期开始日
     *
     * @param businessLicenseStart 营业执照有效期开始日
     */
    public void setBusinessLicenseStart(Date businessLicenseStart) {
        this.businessLicenseStart = businessLicenseStart;
    }

    /**
     * 获取营业执照有效期结束日
     *
     * @return business_license_end - 营业执照有效期结束日
     */
    public Date getBusinessLicenseEnd() {
        return businessLicenseEnd;
    }

    /**
     * 设置营业执照有效期结束日
     *
     * @param businessLicenseEnd 营业执照有效期结束日
     */
    public void setBusinessLicenseEnd(Date businessLicenseEnd) {
        this.businessLicenseEnd = businessLicenseEnd;
    }

    /**
     * 获取设计批准文号
     *
     * @return approval_number - 设计批准文号
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * 设置设计批准文号
     *
     * @param approvalNumber 设计批准文号
     */
    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }
}