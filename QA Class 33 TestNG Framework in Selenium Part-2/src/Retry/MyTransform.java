package Retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class MyTransform implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation annotation, Class testclass,
			Constructor testconstructor, Method testMethod) {
		
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
