package com.save.mycity.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.save.mycity.R;

/**
 * Created by harshikesh.kumar on 13/02/16.
 */
public class SplashActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_splash);
    Intent intent = new Intent(this,MainActivity.class);
    startActivity(intent);

  }
}