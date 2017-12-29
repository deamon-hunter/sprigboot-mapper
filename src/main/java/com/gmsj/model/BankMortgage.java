package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_mortgage")
public class BankMortgage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 是否抵押(1:抵押， 0：解除抵押)
     */
    @Column(name = "is_mortgage")
    private Boolean isMortgage;

    /**
     * 抵押煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 抵押文号
     */
    @Column(name = "approval_file_number")
    private String approvalFileNumber;

    /**
     * 抵押人
     */
    private String mortgagor;

    /**
     * 抵押权人
     */
    private String mortgagee;

    /**
     * 抵押物
     */
    private String guaranty;

    /**
     * 抵押有效期开始日
     */
    @Column(name = "mortgage_start")
    private Date mortgageStart;

    /**
     * 抵押有效期结束日
     */
    @Column(name = "mortgage_end")
    private Date mortgageEnd;

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
     * 获取是否抵押(1:抵押， 0：解除抵押)
     *
     * @return is_mortgage - 是否抵押(1:抵押， 0：解除抵押)
     */
    public Boolean getIsMortgage() {
        return isMortgage;
    }

    /**
     * 设置是否抵押(1:抵押， 0：解除抵押)
     *
     * @param isMortgage 是否抵押(1:抵押， 0：解除抵押)
     */
    public void setIsMortgage(Boolean isMortgage) {
        this.isMortgage = isMortgage;
    }

    /**
     * 获取抵押煤矿ID
     *
     * @return colliery_id - 抵押煤矿ID
     */
    public Long getCollieryId() {
        return collieryId;
    }

    /**
     * 设置抵押煤矿ID
     *
     * @param collieryId 抵押煤矿ID
     */
    public void setCollieryId(Long collieryId) {
        this.collieryId = collieryId;
    }

    /**
     * 获取抵押文号
     *
     * @return approval_file_number - 抵押文号
     */
    public String getApprovalFileNumber() {
        return approvalFileNumber;
    }

    /**
     * 设置抵押文号
     *
     * @param approvalFileNumber 抵押文号
     */
    public void setApprovalFileNumber(String approvalFileNumber) {
        this.approvalFileNumber = approvalFileNumber;
    }

    /**
     * 获取抵押人
     *
     * @return mortgagor - 抵押人
     */
    public String getMortgagor() {
        return mortgagor;
    }

    /**
     * 设置抵押人
     *
     * @param mortgagor 抵押人
     */
    public void setMortgagor(String mortgagor) {
        this.mortgagor = mortgagor;
    }

    /**
     * 获取抵押权人
     *
     * @return mortgagee - 抵押权人
     */
    public String getMortgagee() {
        return mortgagee;
    }

    /**
     * 设置抵押权人
     *
     * @param mortgagee 抵押权人
     */
    public void setMortgagee(String mortgagee) {
        this.mortgagee = mortgagee;
    }

    /**
     * 获取抵押物
     *
     * @return guaranty - 抵押物
     */
    public String getGuaranty() {
        return guaranty;
    }

    /**
     * 设置抵押物
     *
     * @param guaranty 抵押物
     */
    public void setGuaranty(String guaranty) {
        this.guaranty = guaranty;
    }

    /**
     * 获取抵押有效期开始日
     *
     * @return mortgage_start - 抵押有效期开始日
     */
    public Date getMortgageStart() {
        return mortgageStart;
    }

    /**
     * 设置抵押有效期开始日
     *
     * @param mortgageStart 抵押有效期开始日
     */
    public void setMortgageStart(Date mortgageStart) {
        this.mortgageStart = mortgageStart;
    }

    /**
     * 获取抵押有效期结束日
     *
     * @return mortgage_end - 抵押有效期结束日
     */
    public Date getMortgageEnd() {
        return mortgageEnd;
    }

    /**
     * 设置抵押有效期结束日
     *
     * @param mortgageEnd 抵押有效期结束日
     */
    public void setMortgageEnd(Date mortgageEnd) {
        this.mortgageEnd = mortgageEnd;
    }
}