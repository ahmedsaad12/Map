package com.elkhelj.map.language;

import android.content.Context;

import androidx.multidex.MultiDexApplication;



public class App extends MultiDexApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LanguageHelper.updateResources(base, "ar"));
    }

    @Override
    public void onCreate() {
        super.onCreate();

        TypefaceUtil.overrideFont(this, "SERIF", "fonts/Nasser.otf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
        TypefaceUtil.overrideFont(this, "DEFAULT", "fonts/Nasser.otf");
        TypefaceUtil.overrideFont(this, "MONOSPACE", "fonts/Nasser.otf");
        TypefaceUtil.overrideFont(this, "SANS_SERIF", "fonts/Nasser.otf");



    }

}
