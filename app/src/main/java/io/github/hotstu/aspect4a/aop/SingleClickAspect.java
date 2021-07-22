package io.github.hotstu.aspect4a.aop;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import android.view.View;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@SuppressWarnings("unused")
@Aspect
public class SingleClickAspect {

    @Pointcut(" execution(@io.github.hotstu.aspect4a.aop.WithinPermission * *(..))  && @annotation(permission) && args(..,v)")
//方法切入点
    public void methodAnnotated(WithinPermission permission, View v) {
    }

    @Around("methodAnnotated(permission,v)")//在连接点进行方法替换
    public void aroundJoinPoint(final ProceedingJoinPoint joinPoint, final WithinPermission permission, View v) throws Throwable {
        System.out.println("aroundJoinPoint");

        final Object aThis = joinPoint.getThis();
        final Activity ac;
        if (aThis instanceof Fragment) {
            ac = ((Fragment) aThis).getActivity();
        } else if (aThis instanceof Activity) {
            ac = (Activity) aThis;
        } else {
            throw new IllegalStateException("method must belong to activity or fragment");
        }
        Log.e(aThis.getClass().getCanonicalName(), "before proceed " + permission.value() + v.getId());
        try {
            joinPoint.proceed();//执行原方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.e(aThis.getClass().getCanonicalName(), "after proceed " + permission.value() + v.getId());

//        if (true) {
//
//        } else {
//            if (aThis instanceof DenyHandler) {
//                ((DenyHandler) aThis).onDenied(ac, null, permission.tag());
//            } else {
//                DenyHandler handler = (DenyHandler) permission.handler().newInstance();
//                handler.onDenied(ac, null, permission.tag());
//            }
//
//        }
    }

}
