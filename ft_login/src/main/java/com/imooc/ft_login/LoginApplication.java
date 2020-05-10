package com.imooc.ft_login;

import android.app.Application;

import com.imooc.ft_login.service.aidl.LoginServiceImpl;
import com.imooc.lib_base.ft_login.LoginPluginConfig;
import com.qihoo360.replugin.RePlugin;

/**
 * 登录模块的入口
 */
public class LoginApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //注册aidl的具体实现
        RePlugin.registerPluginBinder(LoginPluginConfig.KEY_INTERFACE, new LoginServiceImpl());
    }

}
