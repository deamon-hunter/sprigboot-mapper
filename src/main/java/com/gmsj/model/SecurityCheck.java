package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "security_check")
public class SecurityCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 隐患类型
     */
    private String type;

    /**
     * 隐患详情
     */
    @Column(name = "detail_info")
    private String detailInfo;

    @Column(name = "check_date")
    private Date checkDate;

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
     * 获取隐患类型
     *
     * @return type - 隐患类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置隐患类型
     *
     * @param type 隐患类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取隐患详情
     *
     * @return detail_info - 隐患详情
     */
    public String getDetailInfo() {
        return detailInfo;
    }

    /**
     * 设置隐患详情
     *
     * @param detailInfo 隐患详情
     */
    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    /**
     * @return check_date
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * @param checkDate
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }
}