package org.ayan.bs.annotations.database;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Object representation of domain/model objects. You can call it as
 * Entity(similar to JPA Entity annotation).
 * 
 * @author Ayan Chakraborty
 *
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Model {
	String table();
}
