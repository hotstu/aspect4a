package io.github.hotstu.aspect4a.aop;

import android.app.Activity;
import android.widget.Toast;


/**
 * @author hglf
 * @since 2018/6/4
 */
public class MyDenyHandler implements DenyHandler {
    @Override
    public void onDenied(Object ac, Object permisson, String Tag) {
        Toast.makeText((Activity) ac, "denied", Toast.LENGTH_LONG).show();
    }
}
