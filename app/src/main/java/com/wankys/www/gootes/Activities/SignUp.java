package com.wankys.www.gootes.Activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.wankys.www.gootes.Fragments.FragmentHome;
import com.wankys.www.gootes.Fragments.FragmentProfile;
import com.wankys.www.gootes.R;

public class SignUp extends Activity {

    TextView tv_already_user;
    Button sign_up;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tv_already_user = findViewById(R.id.login_page);
        sign_up = findViewById(R.id.sign_up);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Signed in successfully",Toast.LENGTH_LONG).show();

            }
        });

        tv_already_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



    }
}
