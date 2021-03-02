package com.pril_xo.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * <p>
 * 
 *</p>
 *
 * @author czh
 * @date 2020-12-24
 */
@ApiModel(description = "")
public class PUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一uid")
    private String uid;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String passWord;

    @ApiModelProperty("性别(1:男2:女)")
    private String gender;

    @ApiModelProperty("个人头像")
    private String avatar;

    @ApiModelProperty("头像")
    private String email;

    @ApiModelProperty("出生年月日")
    private Date birthday;

    @ApiModelProperty("邮箱")
    private String mobile;

    @ApiModelProperty("邮箱验证码")
    private String validCode;


    public void setUid (String  uid){
        this.uid=uid;
    }
    public String getUid(){
        return this.uid;
    }

    public void setUserName (String  userName){
        this.userName=userName;
    }
    public String getUserName(){
        return this.userName;
    }

    public void setPassWord (String  passWord){
        this.passWord=passWord;
    }
    public String getPassWord(){
        return this.passWord;
    }

    public void setGender (String  gender){
        this.gender=gender;
    }
    public String getGender(){
        return this.gender;
    }

    public void setAvatar (String  avatar){
        this.avatar=avatar;
    }
    public String getAvatar(){
        return this.avatar;
    }

    public void setEmail (String  email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setBirthday (Date  birthday){
        this.birthday=birthday;
    }
    public Date getBirthday(){
        return this.birthday;
    }

    public void setMobile (String  mobile){
        this.mobile=mobile;
    }
    public String getMobile(){
        return this.mobile;
    }

    public void setValidCode (String  validCode){
        this.validCode=validCode;
    }
    public String getValidCode(){
        return this.validCode;
    }
}