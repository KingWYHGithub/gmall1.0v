package com.net.gmall.user.service;


import com.net.gmall.user.bean.UmsMember;
import com.net.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

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
 * @date : 2020/11/7 - 0:29
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
