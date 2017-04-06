package com.example.kishor.mvpdagerrxjava.Dagger.component;

import com.example.kishor.mvpdagerrxjava.Activity.LoginActivity;
import com.example.kishor.mvpdagerrxjava.Activity.MainActivity;
import com.example.kishor.mvpdagerrxjava.Dagger.module.LoginScreenModule;
import com.example.kishor.mvpdagerrxjava.Dagger.module.MainScreenModule;
import com.example.kishor.mvpdagerrxjava.util.CustomScope;

import dagger.Component;

/**
 * Created by kishor on 27/02/17.
 */

@CustomScope
@Component(dependencies = NetComponent.class,modules= LoginScreenModule.class)
public interface LoginScreenComponent {

    void inject(LoginActivity activity);
}
