package com.example.kishor.mvpdagerrxjava.Dagger.module;

import com.example.kishor.mvpdagerrxjava.Interface.MainScreenContract;
import com.example.kishor.mvpdagerrxjava.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kishor on 27/02/17.
 */
@Module
public class MainScreenModule {

    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View mView){
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView(){
        return  mView;
    }


}
