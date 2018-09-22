package com.boot.demo.auto.entity;

import java.util.*;

/**
 * Created by com.boot.demo.auto.MybatisCodeGenerate on 2018-09-13
 */
public class BasicAppInstaller implements java.io.Serializable {

    // Fields

    private Integer id;
    private Integer appId;
    // D：从属关系
    private String version;
    // 安装包名称
    private String installerName;
    // D：从属关系
    private String installerUrl;
    private String osVersion;
    // D：从属关系
    private Double installerSize;
    // 应用安装文件md5加密代码
    private String extension;
    // 应用安装文件md5加密代码
    private String md5Code;
    // 0：普通http下载
    private Integer downloadTypeCode;
    // 0：下载后不执行安装，1：下载后执行安装
    private Integer installerHandle;
    private String updateInstructions;
    private String creatorId;
    private String creatorName;
    private Date createDate;
    private String publisherId;
    private String publisherName;
    private Date publishDate;
    // 0：未发布，1：已发布
    private Integer status;
    private String dependentVersion;
    // 该安装包（版本）对的地区代码，如：120000，310000等，该安装包发布的时候就只能在该地区下指定小地区或者所有地区
    private String locationCode;

    // Constructors

    /**
     * default constructor
     */
    public BasicAppInstaller() {
    }

    /**
     * full constructor
     */
    public BasicAppInstaller(Integer appId, String version, String installerName, String installerUrl, String osVersion, Double installerSize, String extension, String md5Code, Integer downloadTypeCode, Integer installerHandle, String updateInstructions, String creatorId, String creatorName, Date createDate, String publisherId, String publisherName, Date publishDate, Integer status, String dependentVersion, String locationCode) {
        this.appId = appId;
        this.version = version;
        this.installerName = installerName;
        this.installerUrl = installerUrl;
        this.osVersion = osVersion;
        this.installerSize = installerSize;
        this.extension = extension;
        this.md5Code = md5Code;
        this.downloadTypeCode = downloadTypeCode;
        this.installerHandle = installerHandle;
        this.updateInstructions = updateInstructions;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.createDate = createDate;
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publishDate = publishDate;
        this.status = status;
        this.dependentVersion = dependentVersion;
        this.locationCode = locationCode;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return this.appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * D：从属关系
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * D：从属关系
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 安装包名称
     */
    public String getInstallerName() {
        return this.installerName;
    }

    /**
     * 安装包名称
     */
    public void setInstallerName(String installerName) {
        this.installerName = installerName;
    }

    /**
     * D：从属关系
     */
    public String getInstallerUrl() {
        return this.installerUrl;
    }

    /**
     * D：从属关系
     */
    public void setInstallerUrl(String installerUrl) {
        this.installerUrl = installerUrl;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * D：从属关系
     */
    public Double getInstallerSize() {
        return this.installerSize;
    }

    /**
     * D：从属关系
     */
    public void setInstallerSize(Double installerSize) {
        this.installerSize = installerSize;
    }

    /**
     * 应用安装文件md5加密代码
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * 应用安装文件md5加密代码
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * 应用安装文件md5加密代码
     */
    public String getMd5Code() {
        return this.md5Code;
    }

    /**
     * 应用安装文件md5加密代码
     */
    public void setMd5Code(String md5Code) {
        this.md5Code = md5Code;
    }

    /**
     * 0：普通http下载
     */
    public Integer getDownloadTypeCode() {
        return this.downloadTypeCode;
    }

    /**
     * 0：普通http下载
     */
    public void setDownloadTypeCode(Integer downloadTypeCode) {
        this.downloadTypeCode = downloadTypeCode;
    }

    /**
     * 0：下载后不执行安装，1：下载后执行安装
     */
    public Integer getInstallerHandle() {
        return this.installerHandle;
    }

    /**
     * 0：下载后不执行安装，1：下载后执行安装
     */
    public void setInstallerHandle(Integer installerHandle) {
        this.installerHandle = installerHandle;
    }

    public String getUpdateInstructions() {
        return this.updateInstructions;
    }

    public void setUpdateInstructions(String updateInstructions) {
        this.updateInstructions = updateInstructions;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return this.publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 0：未发布，1：已发布
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 0：未发布，1：已发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDependentVersion() {
        return this.dependentVersion;
    }

    public void setDependentVersion(String dependentVersion) {
        this.dependentVersion = dependentVersion;
    }

    /**
     * 该安装包（版本）对的地区代码，如：120000，310000等，该安装包发布的时候就只能在该地区下指定小地区或者所有地区
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * 该安装包（版本）对的地区代码，如：120000，310000等，该安装包发布的时候就只能在该地区下指定小地区或者所有地区
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

}