package com.ysr.common.alipay;

import android.app.Activity;

import com.alipay.sdk.app.PayTask;

 /** 发起支付宝支付请求
  *  Created by ysr on 2017/2/3 上午10:00.
  *  邮箱 ysr200808@163.com
  */
public class AlipayRequest {

    public static void StartAlipay(final Activity activity, final String payInfo, final PayCallback payCallback){
        // 必须异步调用
       new Thread(new Runnable() {
            @Override
            public void run() {
                // 构造PayTask 对象
                final PayTask alipay = new PayTask(activity);
                // 调用支付接口，获取支付结果
                 payCallback.payResult(alipay.pay(payInfo,true));
            }
        }).start();
    }
}
