package com.cognizant.demo.demoapp.utility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Log method entry and exit points
 * 
 * @author sourav.dutta5@cognizant.com
 *
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogMethodPoint {					

}
