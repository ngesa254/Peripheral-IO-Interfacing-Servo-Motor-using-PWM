package com.droidmarvin.peripheraliointerfacingservomotorusingpwm;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.things.contrib.driver.pwmservo.Servo;
import com.google.android.things.pio.PeripheralManagerService;

import java.io.IOException;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private static final String PWM_BUS = "PWM1";

    private Servo mServo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PeripheralManagerService service = new PeripheralManagerService();
//        Log.d(TAG,"Available PWM:" +service.getPwmList());
    }

    private void setupServo(){
try {
    mServo = new Servo(PWM_BUS);
    mServo.setAngleRange(0f, 180f);
    mServo.setEnabled(true);
}catch (IOException e){
    Log.e(TAG,"Error creating Servo", e);
}
    }
}
