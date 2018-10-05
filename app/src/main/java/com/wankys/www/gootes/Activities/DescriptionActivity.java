package com.wankys.www.gootes.Activities;

import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.wankys.www.gootes.R;

public class DescriptionActivity extends Activity {


    ImageView prod_image;
    TextView prod_name, prod_price, prod_quantity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        prod_image = findViewById(R.id.product_image);
        prod_name = findViewById(R.id.product_name);
        prod_quantity = findViewById(R.id.product_quantity);
        prod_price = findViewById(R.id.product_price);


        Bundle mybundle = getIntent().getExtras();

        if(mybundle != null){

                prod_name.setText(mybundle.getString("name"));
                prod_quantity.setText(mybundle.getString("quantity"));
                prod_price.setText(mybundle.getString("price"));
        }

    }




}
