package com.dbgs.uninstallfeedbacklibrary;

/**
 * Created by Administrator on 2017/9/6.
 */

public class UninstallFeedbackUtil {
    static {
        System.loadLibrary("native-lib");
    }
    public native void load(int sdk,String path);
}
