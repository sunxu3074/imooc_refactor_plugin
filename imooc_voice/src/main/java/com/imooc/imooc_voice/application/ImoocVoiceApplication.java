package com.imooc.imooc_voice.application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.imooc.lib_audio.app.AudioHelper;
import com.imooc.lib_share.share.ShareManager;
import com.imooc.lib_update.app.UpdateHelper;
import com.imooc.lib_video.app.VideoHelper;
import com.qihoo360.replugin.RePluginApplication;

public class ImoocVoiceApplication extends RePluginApplication {

  private static ImoocVoiceApplication mApplication = null;

  @Override public void onCreate() {
    super.onCreate();
    mApplication = this;
    //视频SDK初始化
    VideoHelper.init(this);
    //音频SDK初始化
    AudioHelper.init(this);
    //分享SDK初始化
    ShareManager.initSDK(this);
    //更新组件下载
    UpdateHelper.init(this);
    //ARouter初始化
    ARouter.init(this);
  }

  public static ImoocVoiceApplication getInstance() {
    return mApplication;
  }
}
