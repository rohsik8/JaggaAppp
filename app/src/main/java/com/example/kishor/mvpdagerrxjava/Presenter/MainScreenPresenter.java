package com.example.kishor.mvpdagerrxjava.Presenter;

import com.example.kishor.mvpdagerrxjava.DTO.Post;
import com.example.kishor.mvpdagerrxjava.Interface.MainScreenContract;
import com.example.kishor.mvpdagerrxjava.Interface.RetrofitPostService;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by kishor on 27/02/17.
 */

public class MainScreenPresenter implements MainScreenContract.Presenter {


    Retrofit retrofit;
    MainScreenContract.View mView;

    @Inject
    public MainScreenPresenter(Retrofit retrofit, MainScreenContract.View view){

        this.mView= view;
        this.retrofit =retrofit;
    }


    @Override
    public void loadPost() {



        retrofit.create(RetrofitPostService.class).getPostList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<Post>() {
                    @Override
                    public void onCompleted() {
                        mView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(Post posts) {
                        mView.showPosts(posts);
                    }
                });

    }
}
