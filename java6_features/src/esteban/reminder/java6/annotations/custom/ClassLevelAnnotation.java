package esteban.reminder.java6.annotations.custom;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Custom annotation to be applied on a class.
 *
 * @author estebangm
 */
@Target(value = {ElementType.TYPE})
public @interface ClassLevelAnnotation {
}