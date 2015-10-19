package com.dynnoil.taggs;

import java.lang.annotation.*;

/**
 * Created by krukov on 19.10.2015.
 */

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OldCustomer {
}
