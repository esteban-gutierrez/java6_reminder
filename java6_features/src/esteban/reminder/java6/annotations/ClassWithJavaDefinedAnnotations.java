package esteban.reminder.java6.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains an example of each of the three annotations defined in the Java Language Specification:
 * 
 * - @Deprecated: Indicates that the marked element should not be used. The compiler will generate a warning whenever
 *   the marked element is used. It should be used alongside the Javadoc @deprecated, reserving the Javadoc to explain
 *   the motive for deprecating the element.
 *                
 * - @Override: Indicates that the element is meant to override an element declared in a superclass. The compiler will
 *   generate a warning if it finds a marked element that it is not really overriding anything. Although it is not
 *   required it is useful to detect errors – for example if after creating the subclass someone else modifies the
 *   superclass method signature, we will be warned as soon as we rebuild the source code.
 * 
 * - @SuppressWarnings: Indicates to the compiler that it should suppress some specific warning that the marked element
 *   would otherwise produce – for example to reduce compiler “noise” because of the use of deprecated API’s or
 *   unchecked generics operations when interacting with legacy, pre Java 5, code.
 *   
 * Since their introduction, many libraries and frameworks have incorporated annotations into their newer releases. With
 * annotations used in place with source code, these libraries and frameworks have reduced, even removed, the needs for
 * configuration files.
 *
 * @see https://deors.wordpress.com/2011/09/26/annotation-types/
 * @author estebangm
 * @version 1.0
 */
public class ClassWithJavaDefinedAnnotations {

	/**
	 * Method that prints a message on the console pointing out that is deprecated.
	 * 
	 * @deprecated this is an useless method, just created to highlight the annotation '@Deprecated'
	 */
	@Deprecated
	public void deprecatedMethod() {
		System.out.println("This method is annotated as deprecated");
	}

	/**
	 * Overrides the method 'toString()' defined in class Object to illustrate the use of the annotation @Override.
	 * 
	 * @return a literal message followed by the string representation of the current object
	 */
	@Override
	public String toString() {
		return "Overriden method 'toString()': " + this.toString();
	}

	/**
	 * Defines a list without indicating the class type of its elements just to illustrate the use of the annotation
	 * '@SuppressWarnings'.
	 * 
	 * The @SuppressWarnings annotation at method level suppress the warning that indicates that the variable 'tmp'
	 * in the method body is never used (value = "unused").
	 */
	@SuppressWarnings("unused")
	public void listInitialisation() {
		// The annotation below suppress the warning that appears when not specifying class type for the list elements
		// (value = "rawtypes"):
		@SuppressWarnings("rawtypes")
		List tmp = new ArrayList();
	}
}
