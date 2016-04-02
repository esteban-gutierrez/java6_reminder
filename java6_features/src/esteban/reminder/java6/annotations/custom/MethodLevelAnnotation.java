package esteban.reminder.java6.annotations.custom;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Custom annotation to be applied on a method.
 *
 * @author estebangm
 */
@Target(value = {ElementType.METHOD})
public @interface MethodLevelAnnotation {
}
