package com.gabit.autoreply;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;

public class AutoReplyHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {

        if (!lpparam.packageName.equals("com.whatsapp"))
            return;

        XposedBridge.log("AutoReply Loaded");
    }
}
