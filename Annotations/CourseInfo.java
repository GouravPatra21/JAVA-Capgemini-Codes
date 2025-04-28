package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) //available at runtime
@Target(ElementType.TYPE)
public @interface CourseInfo {
	String courseName() default "SpringBoot";
	int duration() default 120;

}
