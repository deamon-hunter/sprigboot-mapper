package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "financial_standing")
public class FinancialStanding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 股本构成
     */
    @Column(name = "equity_ratio")
    private String equityRatio;

    /**
     * 出资方式
     */
    @Column(name = "investment_methods")
    private String investmentMethods;

    /**
     * 上年度营收入
     */
    @Column(name = "lastyear_revenue")
    private String lastyearRevenue;

    /**
     * 上年度运营成本
     */
    @Column(name = "lastyear_operating_costs")
    private String lastyearOperatingCosts;

    /**
     * 上年度所得税额
     */
    @Column(name = "lastyear_income_tax")
    private String lastyearIncomeTax;

    /**
     * 上年度营业税额
     */
    @Column(name = "lastyear_sales_tax")
    private String lastyearSalesTax;

    /**
     * 上年度增值税额
     */
    @Column(name = "lastyear_vat")
    private String lastyearVat;

    /**
     * 上年度缴纳城建税
     */
    @Column(name = "lastyear_construction_tax")
    private String lastyearConstructionTax;

    /**
     * 上年度缴纳教育附加税
     */
    @Column(name = "lastyear_education_additional_tax")
    private String lastyearEducationAdditionalTax;

    /**
     * 上年度缴纳资源税
     */
    @Column(name = "lastyear_resource_tax")
    private String lastyearResourceTax;

    /**
     * 在岗人数
     */
    @Column(name = "onduty_workers")
    private Integer ondutyWorkers;

    /**
     * 是否存在抵押状况
     */
    @Column(name = "is_mortgage")
    private Boolean isMortgage;

    /**
     * 是否融资或借贷
     */
    @Column(name = "is_financing_or_lending")
    private Boolean isFinancingOrLending;

    /**
     * 融资或借贷总金额
     */
    @Column(name = "financing_or_lending_total_amount")
    private String financingOrLendingTotalAmount;

    /**
     * 是否存在经济纠纷
     */
    @Column(name = "is_economic_dissension")
    private Boolean isEconomicDissension;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 财政状况年份
     */
    private Date year;

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
     * 获取股本构成
     *
     * @return equity_ratio - 股本构成
     */
    public String getEquityRatio() {
        return equityRatio;
    }

    /**
     * 设置股本构成
     *
     * @param equityRatio 股本构成
     */
    public void setEquityRatio(String equityRatio) {
        this.equityRatio = equityRatio;
    }

    /**
     * 获取出资方式
     *
     * @return investment_methods - 出资方式
     */
    public String getInvestmentMethods() {
        return investmentMethods;
    }

    /**
     * 设置出资方式
     *
     * @param investmentMethods 出资方式
     */
    public void setInvestmentMethods(String investmentMethods) {
        this.investmentMethods = investmentMethods;
    }

    /**
     * 获取上年度营收入
     *
     * @return lastyear_revenue - 上年度营收入
     */
    public String getLastyearRevenue() {
        return lastyearRevenue;
    }

    /**
     * 设置上年度营收入
     *
     * @param lastyearRevenue 上年度营收入
     */
    public void setLastyearRevenue(String lastyearRevenue) {
        this.lastyearRevenue = lastyearRevenue;
    }

    /**
     * 获取上年度运营成本
     *
     * @return lastyear_operating_costs - 上年度运营成本
     */
    public String getLastyearOperatingCosts() {
        return lastyearOperatingCosts;
    }

    /**
     * 设置上年度运营成本
     *
     * @param lastyearOperatingCosts 上年度运营成本
     */
    public void setLastyearOperatingCosts(String lastyearOperatingCosts) {
        this.lastyearOperatingCosts = lastyearOperatingCosts;
    }

    /**
     * 获取上年度所得税额
     *
     * @return lastyear_income_tax - 上年度所得税额
     */
    public String getLastyearIncomeTax() {
        return lastyearIncomeTax;
    }

    /**
     * 设置上年度所得税额
     *
     * @param lastyearIncomeTax 上年度所得税额
     */
    public void setLastyearIncomeTax(String lastyearIncomeTax) {
        this.lastyearIncomeTax = lastyearIncomeTax;
    }

    /**
     * 获取上年度营业税额
     *
     * @return lastyear_sales_tax - 上年度营业税额
     */
    public String getLastyearSalesTax() {
        return lastyearSalesTax;
    }

    /**
     * 设置上年度营业税额
     *
     * @param lastyearSalesTax 上年度营业税额
     */
    public void setLastyearSalesTax(String lastyearSalesTax) {
        this.lastyearSalesTax = lastyearSalesTax;
    }

    /**
     * 获取上年度增值税额
     *
     * @return lastyear_vat - 上年度增值税额
     */
    public String getLastyearVat() {
        return lastyearVat;
    }

    /**
     * 设置上年度增值税额
     *
     * @param lastyearVat 上年度增值税额
     */
    public void setLastyearVat(String lastyearVat) {
        this.lastyearVat = lastyearVat;
    }

    /**
     * 获取上年度缴纳城建税
     *
     * @return lastyear_construction_tax - 上年度缴纳城建税
     */
    public String getLastyearConstructionTax() {
        return lastyearConstructionTax;
    }

    /**
     * 设置上年度缴纳城建税
     *
     * @param lastyearConstructionTax 上年度缴纳城建税
     */
    public void setLastyearConstructionTax(String lastyearConstructionTax) {
        this.lastyearConstructionTax = lastyearConstructionTax;
    }

    /**
     * 获取上年度缴纳教育附加税
     *
     * @return lastyear_education_additional_tax - 上年度缴纳教育附加税
     */
    public String getLastyearEducationAdditionalTax() {
        return lastyearEducationAdditionalTax;
    }

    /**
     * 设置上年度缴纳教育附加税
     *
     * @param lastyearEducationAdditionalTax 上年度缴纳教育附加税
     */
    public void setLastyearEducationAdditionalTax(String lastyearEducationAdditionalTax) {
        this.lastyearEducationAdditionalTax = lastyearEducationAdditionalTax;
    }

    /**
     * 获取上年度缴纳资源税
     *
     * @return lastyear_resource_tax - 上年度缴纳资源税
     */
    public String getLastyearResourceTax() {
        return lastyearResourceTax;
    }

    /**
     * 设置上年度缴纳资源税
     *
     * @param lastyearResourceTax 上年度缴纳资源税
     */
    public void setLastyearResourceTax(String lastyearResourceTax) {
        this.lastyearResourceTax = lastyearResourceTax;
    }

    /**
     * 获取在岗人数
     *
     * @return onduty_workers - 在岗人数
     */
    public Integer getOndutyWorkers() {
        return ondutyWorkers;
    }

    /**
     * 设置在岗人数
     *
     * @param ondutyWorkers 在岗人数
     */
    public void setOndutyWorkers(Integer ondutyWorkers) {
        this.ondutyWorkers = ondutyWorkers;
    }

    /**
     * 获取是否存在抵押状况
     *
     * @return is_mortgage - 是否存在抵押状况
     */
    public Boolean getIsMortgage() {
        return isMortgage;
    }

    /**
     * 设置是否存在抵押状况
     *
     * @param isMortgage 是否存在抵押状况
     */
    public void setIsMortgage(Boolean isMortgage) {
        this.isMortgage = isMortgage;
    }

    /**
     * 获取是否融资或借贷
     *
     * @return is_financing_or_lending - 是否融资或借贷
     */
    public Boolean getIsFinancingOrLending() {
        return isFinancingOrLending;
    }

    /**
     * 设置是否融资或借贷
     *
     * @param isFinancingOrLending 是否融资或借贷
     */
    public void setIsFinancingOrLending(Boolean isFinancingOrLending) {
        this.isFinancingOrLending = isFinancingOrLending;
    }

    /**
     * 获取融资或借贷总金额
     *
     * @return financing_or_lending_total_amount - 融资或借贷总金额
     */
    public String getFinancingOrLendingTotalAmount() {
        return financingOrLendingTotalAmount;
    }

    /**
     * 设置融资或借贷总金额
     *
     * @param financingOrLendingTotalAmount 融资或借贷总金额
     */
    public void setFinancingOrLendingTotalAmount(String financingOrLendingTotalAmount) {
        this.financingOrLendingTotalAmount = financingOrLendingTotalAmount;
    }

    /**
     * 获取是否存在经济纠纷
     *
     * @return is_economic_dissension - 是否存在经济纠纷
     */
    public Boolean getIsEconomicDissension() {
        return isEconomicDissension;
    }

    /**
     * 设置是否存在经济纠纷
     *
     * @param isEconomicDissension 是否存在经济纠纷
     */
    public void setIsEconomicDissension(Boolean isEconomicDissension) {
        this.isEconomicDissension = isEconomicDissension;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取财政状况年份
     *
     * @return year - 财政状况年份
     */
    public Date getYear() {
        return year;
    }

    /**
     * 设置财政状况年份
     *
     * @param year 财政状况年份
     */
    public void setYear(Date year) {
        this.year = year;
    }
}