package com.boot.demo.jpa.entity;

import javax.persistence.*;

/**
 * Created by Janita on 2018/5/16.
 * @author Janita
 * Desc:官网banner
 */
@Entity
@Table(name = "banner")
public class BannerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT COMMENT '主键id，自增'")
    private Long bannerId;

    @Column(columnDefinition = "VARCHAR(500) COMMENT 'banner标题'")
    private String bannerTitle;

    @Column(columnDefinition = "VARCHAR(500) COMMENT 'banner图片'")
    private String imageUrl;


    public Long getBannerId() {
        return bannerId;
    }

    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
