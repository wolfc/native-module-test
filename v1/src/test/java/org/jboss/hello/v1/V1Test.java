package org.jboss.hello.v1;

import org.jboss.hello.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 */
public class V1Test {
    @Test
    public void test1() {
        final String result = new Hello().sayHello("test1");
        assertEquals("Hello test1 from v1", result);
    }
}
