package com.tong.telegramBot.utils;

import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.ReflectUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Create by tong on 2023/1/2
 */
@Component
public class CommonUtils {

    private static ApplicationContext applicationContext;

    public static <T> T invokeBotCommandService(String methodName, Object... args) {
        Class<?> entryClass = ClassUtil.loadClass("com.tong.telegramBot.service.ILetletmeBotCommandService");
        Method method = Arrays.stream(entryClass.getMethods())
                .filter(o -> StringUtils.equals(o.getName(), methodName))
                .findFirst()
                .orElse(null);
        if (method == null) {
            return null;
        }
        Object[] params = null;
        if (entryClass.getDeclaredConstructors().length > 0) {
            Class<?>[] constructorClass = entryClass.getDeclaredConstructors()[0].getParameterTypes();
            params = new Object[constructorClass.length];
            for (int i = 0; i < constructorClass.length; i++) {
                params[i] = ReflectUtil.newInstanceIfPossible(constructorClass[i]);
            }
        }
        try {
            if (args == null || args[0] == null) {
                if (params == null) {
                    return ReflectUtil.invoke(applicationContext.getBean(entryClass), method);
                } else {
                    return ReflectUtil.invoke(applicationContext.getBean(entryClass, params), method);
                }
            } else {
                if (params == null) {
                    return ReflectUtil.invoke(applicationContext.getBean(entryClass), method, args);
                } else {
                    return ReflectUtil.invoke(applicationContext.getBean(entryClass, params), method, args);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Autowired
    private void setApplicationContext(ApplicationContext applicationContext) {
        CommonUtils.applicationContext = applicationContext;
    }

}
