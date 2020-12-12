package com.example.freshfood.model;

import com.google.gson.annotations.SerializedName;

public class Posts {

      int  ProductID=1 ;
     String ProductName="Shoes";
     String ProductDesc="Shoes for both men and women are available";
     @SerializedName("body")
    public  int getProductID() {
        return ProductID;
    }

    public  void setProductID(int productID) {
      ProductID=productID;
    }

    public  String getProductName() {
        return ProductName;
    }

    public  void setProductName(String productName) {
        ProductName =productName ;
    }

    public String getProductDesc() {
        return ProductDesc;
    }

    public  void setProductDesc(String productDesc) {
        ProductDesc = productDesc;
    }


}





