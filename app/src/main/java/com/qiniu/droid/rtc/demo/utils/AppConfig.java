package com.qiniu.droid.rtc.demo.utils;

import android.os.Environment;

import java.io.File;

/**
 * Created by wh on 2017/3/16.
 */

public class AppConfig {

    public static final String SDK_KEY_NEW = "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";

    //滤镜列表 17/05/11
    public static String[] mFilterName = {"深度美白", "清新丽人", "暖暖阳光", "香艳红唇", "艺术黑白",
            "甜美", "温暖", "果冻", "唯美", "淡雅",
            "清新", "Movie", "电影色FM2", "电影色FM7", "Vista(胶片)",
            "Chihiro(日系)", "lzyy(淡雅)", "旧时光OT4(怀旧)", "旧时光OT2(黑调)", "Pinky(少女)", "Zoe(初夏)", "超现实(绘画)" };
    public static String[] mFilterType = {"Deep", "Skinfresh", "Sunshine", "Sexylips", "Skinbw",
            "Sweet", "Lightwarm", "Jelly", "Grace", "Elegant",
            "Fresh", "Movie", "FM2", "FM7", "Vista",
            "Chihiro", "LZYY", "OldTimeFour", "OldTimeTwo", "PinkyFive", "Zoe", "SketchBW" };

    public static final String DEFAULT_PATH = Environment.getExternalStorageDirectory()
            + File.separator + "sdk_demo" + File.separator;

    public static final String STICKER_NAME = "TestSticker";

    public static final String STICKER_LOCAL_PATH = DEFAULT_PATH + "sticker" + File.separator ;

    public static final String STICKER_NOMEDIA_PATH = DEFAULT_PATH + ".nomedia";

    public static final boolean IS_USE_INDEPENDENT_THREAD = true;

}
