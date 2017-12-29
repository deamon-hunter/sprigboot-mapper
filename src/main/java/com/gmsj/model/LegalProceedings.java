package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "legal_proceedings")
public class LegalProceedings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 煤矿ID
     */
    @Column(name = "colliery_id")
    private Long collieryId;

    /**
     * 诉讼分类
     */
    private String type;

    /**
     * 诉讼时间
     */
    private Date date;

    /**
     * 诉讼标题
     */
    private String title;

    /**
     * 诉讼内容
     */
    private String contents;

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
     * 获取诉讼分类
     *
     * @return type - 诉讼分类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置诉讼分类
     *
     * @param type 诉讼分类
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取诉讼时间
     *
     * @return date - 诉讼时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置诉讼时间
     *
     * @param date 诉讼时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取诉讼标题
     *
     * @return title - 诉讼标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置诉讼标题
     *
     * @param title 诉讼标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取诉讼内容
     *
     * @return contents - 诉讼内容
     */
    public String getContents() {
        return contents;
    }

    /**
     * 设置诉讼内容
     *
     * @param contents 诉讼内容
     */
    public void setContents(String contents) {
        this.contents = contents;
    }
}