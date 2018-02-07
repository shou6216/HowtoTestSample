package com.yoshinoda.howtotestsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.yoshinoda.howtotestcapture.HowtoTestCaptureClient;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private HowtoTestCaptureClient capture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capture = new HowtoTestCaptureClient(getApplicationContext());
    }

    public void start(View view) {
        capture.start();
    }

    public void stop(View view) {
        capture.stop();
    }
}
