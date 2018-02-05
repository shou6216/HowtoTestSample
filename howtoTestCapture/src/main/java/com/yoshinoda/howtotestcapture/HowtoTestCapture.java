package com.yoshinoda.howtotestcapture;

import com.yoshinoda.howtotestdeepcapture.HowtoTestDeepCapture;

/**
 * Created by user on 2018/02/06.
 */

public class HowtoTestCapture {

    private HowtoTestDeepCapture deepCapture;

    public HowtoTestCapture() {
        this.deepCapture = new HowtoTestDeepCapture();
    }

    public String getCaptureHoge() {
        return "captureHoge" + deepCapture.getDeepCaptureHoge();
    }
}
