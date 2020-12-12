package com.example.freshfood.API;

//import com.squareup.okhttp.Call;

import com.example.freshfood.model.Posts;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceholder {

    @GET("posts")
    Call getPosts();
    @POST("posts")
    Call<Posts> createPost(@Body Posts post);
}
