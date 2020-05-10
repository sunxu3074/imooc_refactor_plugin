package com.imooc.ft_login.service.aidl;

import com.imooc.ft_login.manager.UserManager;
import com.imooc.lib_base.ILoginService;
import com.imooc.lib_base.ft_login.model.user.User;

/**
 * ILoginService的具体实现
 */
public class LoginServiceImpl extends ILoginService.Stub {

    @Override
    public boolean hasLogin() {
        return UserManager.getInstance().hasLogined();
    }

    @Override
    void removeUser(){
        UserManager.getInstance().removeUser();
    }

    @Override
    User getUserInfo(){
        return UserManager.getInstance().getUser();
    }

}
