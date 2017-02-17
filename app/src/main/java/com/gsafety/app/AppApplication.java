package com.gsafety.app;

import android.app.Service;
import android.os.Vibrator;

import com.baidu.mapapi.SDKInitializer;
import com.gsafety.BuildConfig;
import com.gsafety.server.LocationService;
import com.ysr.common.baseapp.BaseApplication;
import com.ysr.common.commonutils.LogUtils;

/**
 * Created by ysr on 2017/2/17 下午9:57.
 * 邮箱 ysr200808@163.com
 */

public class AppApplication extends BaseApplication {
    public LocationService locationService;
    public Vibrator mVibrator;
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化logger
        locationService = new LocationService(getApplicationContext());
        mVibrator =(Vibrator)getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
        SDKInitializer.initialize(getApplicationContext());
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
    }
}
