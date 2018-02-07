package com.yoshinoda.howtotestcapture;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

import com.yoshinoda.howtotestdeepcapture.HowtoTestDeepCapture;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class HowtoTestCaptureService extends Service {

    private static final String TAG = HowtoTestCaptureService.class.getSimpleName();

    private HowtoTestDeepCapture deepCapture;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");
        this.deepCapture = new HowtoTestDeepCapture();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStart");
        return Service.START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getCaptureHoge() {
        return "captureHoge" + deepCapture.getDeepCaptureHoge();
    }
}
