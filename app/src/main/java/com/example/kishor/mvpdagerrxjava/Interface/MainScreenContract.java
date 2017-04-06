package com.example.kishor.mvpdagerrxjava.Interface;

import com.example.kishor.mvpdagerrxjava.DTO.Post;

import java.util.List;

/**
 * Created by kishor on 27/02/17.
 */

public interface MainScreenContract {

    interface View{
        void showPosts(Post posts);
        void showError(String message);
        void showComplete();
    }

    interface  Presenter{
        void loadPost();
    }
}
