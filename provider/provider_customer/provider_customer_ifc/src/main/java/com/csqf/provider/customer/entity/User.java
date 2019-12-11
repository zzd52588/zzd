package com.csqf.provider.customer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author jerry
 * @since 2019-11-16
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    private String uAccount;

    private String uPwd;

    private String uName;

    private String uTelnum;

    private String uSex;

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    private LocalDateTime uDate;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }
    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
    public String getuTelnum() {
        return uTelnum;
    }

    public void setuTelnum(String uTelnum) {
        this.uTelnum = uTelnum;
    }
    public LocalDateTime getuDate() {
        return uDate;
    }

    public void setuDate(LocalDateTime uDate) {
        this.uDate = uDate;
    }

    @Override
    public String toString() {
        return "User{" +
            "uId=" + uId +
            ", uAccount=" + uAccount +
            ", uPwd=" + uPwd +
            ", uName=" + uName +
            ", uTelnum=" + uTelnum +
            ", uDate=" + uDate +
        "}";
    }
}
