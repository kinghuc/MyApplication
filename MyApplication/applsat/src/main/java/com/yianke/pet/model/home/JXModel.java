package com.yianke.pet.model.home;

import com.yianke.pet.R;
import com.yianke.pet.bean.Posts;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 作者：${赵若位} on 2017/6/6 14:49
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class JXModel
{
    private int headerImg;
    private String userName;
    private String userAir;
    private int userImg;
    private String petName;
    private String petType;
    private int mainImg;
    private String descript;
    private List<Posts> data;



    public JXModel()
    {
        this.headerImg = R.drawable.jx_header;
        this.userName = "永登人";
        this.userAir = "甘肃 兰州";
        this.userImg = R.drawable.jx_user_pet;
        this.petName = "永登";
        this.petType = "";
        this.mainImg = R.drawable.jx_main;
    }

    public List<Posts> getData() {
        return data;
    }

    public void setData(List<Posts> data) {
        this.data = data;
    }

    public int getHeaderImg()
    {
        return headerImg;
    }

    public void setHeaderImg(int headerImg)
    {
        this.headerImg = headerImg;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserAir()
    {
        return userAir;
    }

    public void setUserAir(String userAir)
    {
        this.userAir = userAir;
    }

    public int getUserImg()
    {
        return userImg;
    }

    public void setUserImg(int userImg)
    {
        this.userImg = userImg;
    }

    public String getPetName()
    {
        return petName;
    }

    public void setPetName(String petName)
    {
        this.petName = petName;
    }

    public String getPetType()
    {
        return petType;
    }

    public void setPetType(String petType)
    {
        this.petType = petType;
    }

    public int getMainImg()
    {
        return mainImg;
    }

    public void setMainImg(int mainImg)
    {
        this.mainImg = mainImg;
    }

    public String getDescript()
    {
        return descript;
    }

    public void setDescript(String descript)
    {
        this.descript = descript;
    }

}
