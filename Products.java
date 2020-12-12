package com.example.freshfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.freshfood.API.JsonPlaceholder;
import com.example.freshfood.model.Posts;
//import com.squareup.okhttp.Call;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Products extends AppCompatActivity {


    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        text1 = findViewById(R.id.t1);
       // Posts p=new Posts();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        JsonPlaceholder jsonPlaceholder = retrofit.create(JsonPlaceholder.class);
        Call<List<Posts>> call = jsonPlaceholder.getPosts();
        call.enqueue(new Callback<List<Posts>>() {


            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                if(!response.isSuccessful()){
                text1.setText("Code:" + response.code());
                return;
            }
                List<Posts> Posts = response.body();
                for (Posts post : Posts)
                {
                    String content = "";
                    content += "ProductID:" + post.getProductID() + "\n";
                    content += "ProductName:" + post.getProductName() + "\n";
                    content += "ProductDesc:" + post.getProductDesc() + "\n";
                    text1.append(content);

                }}





            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                text1.setText(t.getMessage());

            }  });


        }

    private JsonPlaceholder create(Class<JsonPlaceholder> jsonPlaceholderClass) {

        return null;
    }

    public class Builder {


    }
}

