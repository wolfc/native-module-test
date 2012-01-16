package org.jboss.hello;

/**
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 */
public class Hello {
    static {
        System.loadLibrary("hello");
    }

    public native String sayHello(String name);
}
