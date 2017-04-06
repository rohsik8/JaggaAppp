package com.example.kishor.mvpdagerrxjava.Dagger.component;

import com.example.kishor.mvpdagerrxjava.Dagger.module.AppModule;
import com.example.kishor.mvpdagerrxjava.Dagger.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by kishor on 27/02/17.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    Retrofit retrofit();


}
