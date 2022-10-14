package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsURL;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsURLValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsURL.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isURL(value);
    }
}