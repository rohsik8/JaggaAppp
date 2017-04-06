package com.example.kishor.mvpdagerrxjava.Dagger.module;

import com.example.kishor.mvpdagerrxjava.Interface.LoginScreenContract;
import com.example.kishor.mvpdagerrxjava.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kishor on 27/02/17.
 */
@Module
public class LoginScreenModule {

    private final LoginScreenContract.View mView;

    public LoginScreenModule(LoginScreenContract.View mView){
        this.mView = mView;
    }


    @Provides
    @CustomScope
    LoginScreenContract.View providesMainScreenContractView(){
        return  mView;
    }


}
