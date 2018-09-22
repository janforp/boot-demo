package com.boot.demo.jpa.controller;

import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.jpa.entity.BannerEntity;
import com.boot.demo.jpa.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janita
 * @since 2018/9/9 - 下午11:24
 * 类说明：
 */
@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @PostMapping
    public ResultDTO<BannerEntity> addBanner(@RequestBody BannerEntity entity) {
        entity = bannerService.addBanner(entity);
        return ResultDTO.toSuccess(entity);
    }

    @GetMapping("/{bannerId}")
    public ResultDTO<BannerEntity> find(@PathVariable Long bannerId) {
        BannerEntity entity = bannerService.find(bannerId);
        return ResultDTO.toSuccess(entity);
    }
}
