package esteban.reminder.java6.annotations.custom;

import java.util.Set;

import javax.lang.model.element.TypeElement;
import javax.lang.model.SourceVersion;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;

/**
 * Test Annotation Processor class extends AbstractProcessor class which encapsulates an Abstract Annotation Processor.
 * We have to inform what Annotation Types our Test Annotation Processor Supports. This is manifested through the
 * Class-Level Annotation called @SupportedAnnotationTypes(). A value of “*” indicates that all types of Annotations
 * will be processed by this Annotation Processor. Which version of Source Files this Annotation Processor supports is
 * mentioned through @SupportedSourceVersion Annotation.
 * 
 * The javac compiler of Mustang (Java 6) has an option called ‘-processor’ where we can specify the Name of the
 * Annotation Processor along with a Set of Java Source Files containing the Annotations. 
 *
 * @author estebangm
 * @see http://www.javabeat.net/java-6-0-features-part-2-pluggable-annotation-processing-api/
 */
@SupportedAnnotationTypes(value= {"*"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TestAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement element : annotations){
            System.out.println(element.getQualifiedName());
        }
        return true;
    }
}