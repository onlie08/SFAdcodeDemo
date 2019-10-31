package com.sfmap.adcode;


public class AppManager {
    private static AppManager instance;
    private static volatile AdCode adCode;

    public static AppManager getInstance() {
        if (instance == null) {
            synchronized (AppManager.class) {
                if (instance == null) {
                    instance = new AppManager();
                }
            }
        }
        return instance;
    }

    public AdCode getAdCodeInst() {
        synchronized (AppManager.class) {
            if (adCode == null) {
                adCode = AdCodeMonitor.getAdCodeInst();
            }
        }
        return adCode;
    }

}
