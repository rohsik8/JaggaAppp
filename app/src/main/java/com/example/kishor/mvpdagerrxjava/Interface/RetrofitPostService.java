package com.example.kishor.mvpdagerrxjava.Interface;

import com.example.kishor.mvpdagerrxjava.DTO.Post;

import java.util.List;
import java.util.Map;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by kishor on 27/02/17.
 */

public interface RetrofitPostService {

    @Headers("checksum: 3389dae361af79b04c9c8e7057f60cc6")
    @GET("advertisements")
    Observable<Post> getPostList();

    @Headers("checksum: 3389dae361af79b04c9c8e7057f60cc6")
    @GET("advertisements")
    Call<Post> getPostList1();
}
