package com.csqf.provider.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author jerry
 * @since 2019-11-16
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ad_id", type = IdType.AUTO)
    private Integer adId;

    private String adPwd;

    private String adAccount;

    private String adName;

    public String getAdAccount() {
        return adAccount;
    }

    public void setAdAccount(String adAccount) {
        this.adAccount = adAccount;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }
    public String getAdPwd() {
        return adPwd;
    }

    public void setAdPwd(String adPwd) {
        this.adPwd = adPwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
            "adId=" + adId +
            ", adPwd=" + adPwd +
        "}";
    }
}
