package com.trkj.trainingprojects.vo;

import com.trkj.trainingprojects.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ClassMeta(className = "职工表")
public class EmpVo implements UserDetails{
    /**
     * 职工编号
     */
    private Integer empId;

    /**
     * 工号
     */
    private String jobnumber;

    /**
     * 职工名称
     */
    private String empName;

    /**
     * 用户头像
     */
    private String userimg;

    /**
     * 个人信息头像
     */
    private String individualimg;

    /**
     * 职工性别
     */
    private String empSex;

    /**
     * 职工电话
     */
    private String empPhone;

    /**
     * 电子邮件
     */
    private String eMail;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 职工状态
     */
    private Integer workersstate;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 限制登录
     */
    private Integer loginstate;

    /**
     * 教育水平
     */
    private String education;

    /**
     * 毕业学校
     */
    private String graduate;

    /**
     * 增加人
     */
    public String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 最后修改人
     */
    public String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 离职办理人
     */
    private String separationname;

    /**
     * 离职办理时间
     */
    private Date separationtime;

    /**
     * 离职日期
     */
    private Date separationdate;


    /**
     * 部门编号
     */
    private Integer deptId;
    private DeptVo deptVo;

    /**
     * 0无效用户，1是有效用户
     */
    private Boolean enabled;

    /**
     * 账户是否没过期
     */
    private Boolean accountNonExpired;

    /**
     * 是否没被锁定
     */
    private Boolean accountNonLocked;

    /**
     * 密码是否没有过期
     */
    private Boolean credentialsNonExpired;


    private static final long serialVersionUID = 1L;

    Collection<? extends GrantedAuthority> authorities;  //用户的权限集合
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getUsername() {
        return jobnumber;
    }


    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
