package esteban.reminder.java6.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The JDK comes with some annotations that are used to modify the behavior of the Annotation Types that are defined by
 * the developer:
 * 
 * - @Documented: Indicates that the marked Annotation Type should be documented by Javadoc each time it is found in
 * an annotated element.
 * 
 * - @Inherited: Indicates that the marked Annotation Type is inherited by subclasses. This way, if the marked
 * annotation is not present in a subclass it inherits the annotation in the superclass, if present.
 * Only applies to class inheritance and not to interface implementations.
 * 
 * - @Retention: Indicates how long the marked Annotation Type will be retained. Possible values are those of enum
 * RetentionPolicy: CLASS (default – included in class files but not accessible at run-time), SOURCE (discarded by
 * the compiler when the class file is created) and RUNTIME (available at run-time).
 * 
 * - @Target: Indicates the element types to which the marked Annotation Type is applicable. Possible values are those
 * of enum ElementType: ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER and TYPE.
 *
 * @author estebangm
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AnnotatedAnnotation {

	public String fooMethod();
}
