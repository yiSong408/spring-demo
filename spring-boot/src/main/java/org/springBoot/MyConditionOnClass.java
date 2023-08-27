package org.springBoot;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(MyCondition.class)
public @interface MyConditionOnClass {
    String value();
}
