package com.imooc.lib_base.ft_home;

public class HomePluginConfig {

    public static final String PLUGIN_NAME = "ft_home";//插件名

    public static final String PACKAGE_NAME = "com.imooc.ft_home";//插件包名

    public static final String KEY_INTERFACE = PACKAGE_NAME + ".interface";//interface名

    //插件对外暴露的所有页面
    public static class PAGE {
        public static final String PAGE_HOME = PACKAGE_NAME + ".view.HomeActivity";
    }

    //插件对外暴露的所有action
    public static class ACTION {
        public static final String KEY_DATA = PACKAGE_NAME + ".key.data";

    }

}
