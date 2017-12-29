package com.gmsj.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "industry_dynamic")
public class IndustryDynamic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 信息标题
     */
    private String title;

    /**
     * 信息url
     */
    private String url;

    /**
     * 信息日期
     */
    private Date date;

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
     * 获取信息标题
     *
     * @return title - 信息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置信息标题
     *
     * @param title 信息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取信息url
     *
     * @return url - 信息url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置信息url
     *
     * @param url 信息url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取信息日期
     *
     * @return date - 信息日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置信息日期
     *
     * @param date 信息日期
     */
    public void setDate(Date date) {
        this.date = date;
    }
}