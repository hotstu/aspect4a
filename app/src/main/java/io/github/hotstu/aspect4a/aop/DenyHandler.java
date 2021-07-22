package io.github.hotstu.aspect4a.aop;

/**
 * @author hglf
 * @since 2018/6/4
 */
public interface DenyHandler  {
    void onDenied(Object ac, Object permisson, String Tag);
}
