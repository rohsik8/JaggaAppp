package com.example.kishor.mvpdagerrxjava;

import android.app.Application;

import com.example.kishor.mvpdagerrxjava.Dagger.component.DaggerNetComponent;
import com.example.kishor.mvpdagerrxjava.Dagger.component.NetComponent;
import com.example.kishor.mvpdagerrxjava.Dagger.module.AppModule;
import com.example.kishor.mvpdagerrxjava.Dagger.module.NetModule;

/**
 * Created by kishor on 27/02/17.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://arushaapp.jwarearusha.com/api/v1/content/"))
                .build();

    }

    public NetComponent getNetComponent(){
        return mNetComponent;
    }
}
