package db.execute.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.PARAMETER])
public @interface Out {
    int jdbc() default 0x7FFF_FFFF;
    String db() default "";
}
