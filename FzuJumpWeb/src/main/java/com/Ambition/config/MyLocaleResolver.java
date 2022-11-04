package com.Ambition.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Description: 国际化
 * @Author: Ambition
 * @Date: 2022/07/31 22:46
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("l");
        if (StringUtils.isEmpty(language)) {
            Locale locale = Locale.getDefault();
            return locale;
        }
        String[] split = language.split("_");
        return new Locale(split[0], split[1]);
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
