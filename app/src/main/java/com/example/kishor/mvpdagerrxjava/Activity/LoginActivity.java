package com.example.kishor.mvpdagerrxjava.Activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kishor.mvpdagerrxjava.App;
import com.example.kishor.mvpdagerrxjava.DTO.Post;
import com.example.kishor.mvpdagerrxjava.Dagger.component.DaggerLoginScreenComponent;
import com.example.kishor.mvpdagerrxjava.Dagger.module.LoginScreenModule;
import com.example.kishor.mvpdagerrxjava.Interface.LoginScreenContract;
import com.example.kishor.mvpdagerrxjava.Presenter.LoginScreenPresenter;
import com.example.kishor.mvpdagerrxjava.R;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by kishor on 30/03/17.
 */

public class LoginActivity extends AppCompatActivity implements LoginScreenContract.View {

    ProgressDialog progressDoalog;
    @Inject
    LoginScreenPresenter mainScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        getSupportActionBar().hide();
        DaggerLoginScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .loginScreenModule(new LoginScreenModule(this))
                .build().inject(this);

        //Call the method in MainPresenter to make Network Request
        mainScreenPresenter.loadPost();
        progressDoalog = new ProgressDialog(LoginActivity.this);
        progressDoalog.setMessage("Its loading....");
        progressDoalog.show();
    }

    @Override
    public void showPosts(Post posts) {



    }

    @Override
    public void showError(String message) {

        progressDoalog.dismiss();

    }

    @Override
    public void showComplete() {

        progressDoalog.dismiss();
    }
}
