package com.ysr.jcvideoplayer;

 /**
  *  Created by ysr on 2017/2/3 上午11:25.
  *  邮箱 ysr200808@163.com
  */
public interface JCMediaPlayerListener {
    void onPrepared();

    void onCompletion();

    void onAutoCompletion();

    void onBufferingUpdate(int percent);

    void onSeekComplete();

    void onError(int what, int extra);

    void onInfo(int what, int extra);

    void onVideoSizeChanged();

    void goBackThisListener();

    boolean goToOtherListener();

    void autoFullscreenLeft();

    void autoFullscreenRight();

    void autoQuitFullscreen();
}
