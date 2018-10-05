package com.wankys.www.gootes.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wankys.www.gootes.R;

public class SplashScreen extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread thread = new Thread(){

            public void run(){
                try{
                    sleep(5*1000);
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);

                    finish();

                }catch (Exception ex){

                }
            }
        };

        thread.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
