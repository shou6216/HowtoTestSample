package com.yoshinoda.howtotestcapture;

import android.content.Context;
import android.content.Intent;

import com.yoshinoda.howtotestdeepcapture.HowtoTestDeepCapture;

/**
 * Created by user on 2018/02/06.
 */

public class HowtoTestCaptureClient {

    private Context context;

    public HowtoTestCaptureClient(Context context) {
        this.context = context;
    }

    public void start() {
        Intent intent = new Intent(context, HowtoTestCaptureService.class);
        context.startService(intent);
    }

    public void stop() {
        Intent intent = new Intent(context, HowtoTestCaptureService.class);
        context.stopService(intent);
    }
}
