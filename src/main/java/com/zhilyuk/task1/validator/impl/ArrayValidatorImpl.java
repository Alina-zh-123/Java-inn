package com.zhilyuk.task1.validator.impl;

import com.zhilyuk.task1.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidatorImpl implements ArrayValidator {
    private static final Logger logger = LogManager.getLogger();
    private static final String VALID_REGEX = "^\\s*(-?\\d+\\s*([,;\\-\\s]\\s*\\d+\\s*)*)?$";

    @Override
    public boolean arrayValidateString(String s) {
        logger.debug("Validating string: '{}'", s);

        if (s.isBlank()) {
            logger.warn("String {} is null or empty", s);
            return false;
        }

        boolean flag = s.matches(VALID_REGEX);
        logger.info("Validity of string: {}", flag);
        return flag;
    }
}
