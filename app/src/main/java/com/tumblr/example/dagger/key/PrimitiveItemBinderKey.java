package com.tumblr.example.dagger.key;

import com.tumblr.example.model.Primitive;
import dagger.MapKey;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A {@link MapKey} annotation for maps with {@code Class<? extends Primitive>} keys.
 *
 * Created by ericleong on 12/6/17.
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
@MapKey
public @interface PrimitiveItemBinderKey {
	Class<? extends Primitive> value();
}
