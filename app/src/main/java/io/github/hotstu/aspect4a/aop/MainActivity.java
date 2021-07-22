package io.github.hotstu.aspect4a.aop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



import io.github.hotstu.aspect4a.R;


import static android.Manifest.permission.CAMERA;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @WithinPermission({CAMERA})
    public void send2(View v) {
        Toast.makeText(this, "open camera", Toast.LENGTH_LONG).show();
    }
}
