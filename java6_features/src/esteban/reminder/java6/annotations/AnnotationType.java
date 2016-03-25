package esteban.reminder.java6.annotations;

/**
 * Annotation Types are special interfaces in the Java language that define custom annotations.
 * An annotation type is defined using @interface instead of interface.
 * 
 * Annotation Types have some differences compared to regular interfaces:
 * 
 * - Only primitives, strings, enums, class literals and arrays of them are allowed. Note that as Objects in general
 * are not allowed, arrays of arrays are not allowed in Annotation Types (every array is an object).
 * 
 * - The annotation elements are defined with a syntax very similar to that of methods, but keep in mind that modifiers
 * and parameters are not allowed.
 * 
 * - Default values are defined using the default keyword followed by the value that will be a literal, an array
 * initializer or an enum value.
 *
 * @author estebangm
 */
public @interface AnnotationType {

	/**
	 * Complexity levels.
	 * 
	 * As in any other class or interface, an Enum Type can be nested in an Annotation Type definition.
	 *
	 * @author estebangm
	 */
	 public enum ComplexityLevel {
		 VERY_SIMPLE,
		 SIMPLE,
		 MEDIUM,
		 COMPLEX,
		 VERY_COMPLEX;
	 }

	 /*
	  * Field 'value' defaulted to MEDIUM level of complexity.
	  */
	 ComplexityLevel value() default ComplexityLevel.MEDIUM;
}
