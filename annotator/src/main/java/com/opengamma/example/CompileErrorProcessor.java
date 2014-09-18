package com.opengamma.example;

import java.util.Set;
import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.lang.model.SourceVersion;
import javax.tools.Diagnostic;

@SupportedAnnotationTypes("com.opengamma.example.CompileError")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class CompileErrorProcessor extends AbstractProcessor {
  public CompileErrorProcessor() {
    super();
  }

  public void error(String message) {
    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, message);
  }

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    error("Intentional error");
    return false;
  }
}
