package com.net.gmall.user.bean;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * ///////////////////////////////////////
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 * _____       _______   __     _______ _   _
 * |  __ \   /\|__   __|/\\ \   / /_   _| \ | |
 * | |  | | /  \  | |  /  \\ \_/ /  | | |  \| |
 * | |  | |/ /\ \ | | / /\ \\   /   | | | . ` |
 * | |__| / ____ \| |/ ____ \| |   _| |_| |\  |
 * |_____/_/    \_\_/_/    \_\_|  |_____|_| \_|
 *
 * @author :wangyuhong
 * @date : 2020/11/7 - 1:03
 */
@Data
public class UmsMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String memberLevelId;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private int status;

    private Date createTime;

    private String icon;

    private int gender;

    private Date birthday;

    private String city;

    private String job;

    private String personalizedSignature;

    private int sourceType;

    private int integration;

    private int growth;

    private int luckeyCount;

    private int historyIntegration;



}
