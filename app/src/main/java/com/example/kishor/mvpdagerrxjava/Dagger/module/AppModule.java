package com.example.kishor.mvpdagerrxjava.Dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kishor on 27/02/17.
 */

@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return  mApplication;
    }
}
