package com.boot.demo.jpa.repository;

import com.boot.demo.jpa.entity.BannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2018/5/16.
 * @author Janita
 * Desc:官网banner
 */
@Repository
public interface BannerRepository extends JpaRepository<BannerEntity, Long>, JpaSpecificationExecutor<BannerEntity> {
}