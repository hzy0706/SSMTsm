package com.trkj.trainingprojects.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "企业档案表")
public class EnterpriseVo {
    /**
     * 企业档案编号
     */
    private Integer enterpriseId;

    /**
     * 企业全称
     */
    private String enterpriseName;

    /**
     * 企业品牌
     */
    private String enclosureBrand;

    /**
     * 企业简称
     */
    private String enterpriseShortname;

    /**
     * 英文全称
     */
    private String enterpriseEnglishname;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 公司类型
     */
    private String companytype;

    /**
     * 邮政编码
     */
    private String postalcode;

    /**
     * 公司地址
     */
    private String companyaddress;

    /**
     * 公司电话
     */
    private String companyphone;

    /**
     * 传真电话
     */
    private String faxphone;

    /**
     * 公司网址
     */
    private String comanyweb;

    /**
     * 电子邮箱
     */
    private String eMail;

    /**
     * 法人代表
     */
    private String representative;

    /**
     * 注册时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registertime;

    /**
     * 注册资金
     */
    private BigDecimal registermoney;

    /**
     * 开户银行
     */
    private String depositBank;

    /**
     * 银行账号
     */
    private String bankNumber;

    /**
     * 企业简介
     */
    private String enterpriseBrief;

    /**
     * 最后修改人
     */
    public String updatename;

    /**
     * 最后修改时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;

    private static final long serialVersionUID = 1L;
}
