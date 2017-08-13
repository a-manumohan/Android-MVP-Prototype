package in.co.mn.mvpproto.network;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope
public @interface NetworkScope {
}
