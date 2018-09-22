package com.boot.demo.jpa.service;

import com.boot.demo.jpa.entity.BannerEntity;
import com.boot.demo.jpa.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author janita
 * @since 2018/9/9 - 下午11:25
 * 类说明：
 */
@Service
public class BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    public BannerEntity addBanner(BannerEntity entity) {
        entity = bannerRepository.save(entity);
        return entity;
    }

    public BannerEntity find(Long bannerId) {
        return bannerRepository.findOne(bannerId);
    }
}
