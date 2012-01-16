package org.jboss.hello.module;

import org.jboss.hello.Hello;
import org.jboss.modules.Module;
import org.jboss.modules.ModuleIdentifier;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 */
public class ModuleTest {
    @Test
    public void test1() throws Exception {
        final Module module = Module.getBootModuleLoader().loadModule(ModuleIdentifier.create("org.jboss.hello", "v1"));
        final Class<?> cls = Class.forName(Hello.class.getName(), true, module.getClassLoader());
        final Object obj = cls.newInstance();
        final Method method = cls.getMethod("sayHello", String.class);
        final String result = (String) method.invoke(obj, "test1");
        assertEquals("Hello test1 from v1", result);
    }

    @Test
    public void test2() throws Exception {
        final Module module = Module.getBootModuleLoader().loadModule(ModuleIdentifier.create("org.jboss.hello", "v2"));
        final Class<?> cls = Class.forName(Hello.class.getName(), true, module.getClassLoader());
        final Object obj = cls.newInstance();
        final Method method = cls.getMethod("sayHello", String.class);
        final String result = (String) method.invoke(obj, "test2");
        assertEquals("Hello test2 from v2", result);
    }
}
