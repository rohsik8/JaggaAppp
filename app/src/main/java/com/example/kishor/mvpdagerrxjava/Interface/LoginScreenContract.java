package com.example.kishor.mvpdagerrxjava.Interface;

import com.example.kishor.mvpdagerrxjava.DTO.Post;

/**
 * Created by kishor on 30/03/17.
 */

public interface LoginScreenContract {

    interface View{
        void showPosts(Post posts);
        void showError(String message);
        void showComplete();
    }

    interface  Presenter{
        void loadPost();
    }

}
