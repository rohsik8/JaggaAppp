package com.example.kishor.mvpdagerrxjava.Activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kishor.mvpdagerrxjava.DTO.Post;
import com.example.kishor.mvpdagerrxjava.Interface.MainScreenContract;
import com.example.kishor.mvpdagerrxjava.Presenter.MainScreenPresenter;
import com.example.kishor.mvpdagerrxjava.R;
import com.example.kishor.mvpdagerrxjava.Dagger.component.DaggerMainScreenComponent;
import com.example.kishor.mvpdagerrxjava.Dagger.module.MainScreenModule;
import com.example.kishor.mvpdagerrxjava.App;

import java.util.ArrayList;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View{

    ProgressDialog progressDoalog;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Inject
    MainScreenPresenter mainScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView) findViewById(R.id.my_list);
        list = new ArrayList<>();
        DaggerMainScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);

        //Call the method in MainPresenter to make Network Request
        mainScreenPresenter.loadPost();
        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("Its loading....");
        progressDoalog.show();
    }

    @Override
    public void showPosts(Post posts) {

        //Loop through the posts and get the title of the post and add it to our list object
        for (int i = 0; i < posts.getData().size(); i++) {
            list.add(posts.getData().get(i).getTitle());
        }
        //Create the array adapter and set it to list view
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
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
