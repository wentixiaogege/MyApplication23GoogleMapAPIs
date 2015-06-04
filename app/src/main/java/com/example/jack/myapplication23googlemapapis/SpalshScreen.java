package com.example.jack.myapplication23googlemapapis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by jack on 6/4/15.
 */
public class SpalshScreen extends Activity {

    private  static int SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SpalshScreen.this,MainActivity.class);

                startActivity(intent);

                finish();
            }
        },SPLASH_SCREEN_DELAY);

    }
}
