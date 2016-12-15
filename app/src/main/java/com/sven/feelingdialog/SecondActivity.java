package com.sven.feelingdialog;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.sven.mylibrary.FeelingDialog;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final FeelingDialog feelingDialog = new FeelingDialog(this);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                feelingDialog.show();
            }
        }, 500);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                feelingDialog.dismiss();
            }
        }, 1000);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                feelingDialog.show();
            }
        }, 1500);
       /* new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);*/
    }
}
