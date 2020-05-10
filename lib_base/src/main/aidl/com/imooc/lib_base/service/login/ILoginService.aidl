package com.imooc.lib_base;

//aidl不会自动帮我们导包，需要手动导
import com.imooc.lib_base.ft_login.model.user.User;

interface ILoginService {

    boolean hasLogin();

    void removeUser();

    User getUserInfo();

}
