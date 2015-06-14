package db.execute.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.TYPE])
public @interface Procedures {
    int version() default 0;
    String name() default "";
    Mangle mangle() default Mangle.NONE;
    Dialect dialect();
}
