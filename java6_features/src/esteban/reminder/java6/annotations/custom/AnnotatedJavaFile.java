package esteban.reminder.java6.annotations.custom;

/**
 * Sample class that makes use of the Class Level and the Method Level Annotations. Note that @ClassLevelAnnotation is
 * applied at the Class Level and the @MethodLevelAnnotation is applied at the method Level. This is because both the
 * Annotation Types have been defined to be tagged to these respective Elements with the help of @Target Annotation.
 *
 * @author estebangm
 */
@ClassLevelAnnotation()
public class AnnotatedJavaFile {

    @MethodLevelAnnotation
    public void annotatedMethod(){
    }
}