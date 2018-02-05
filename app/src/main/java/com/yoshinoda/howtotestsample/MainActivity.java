package com.yoshinoda.howtotestsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yoshinoda.howtotestcapture.HowtoTestCapture;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private HowtoTestCapture capture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capture = new HowtoTestCapture();
        Log.d(TAG, capture.getCaptureHoge());
    }
}
