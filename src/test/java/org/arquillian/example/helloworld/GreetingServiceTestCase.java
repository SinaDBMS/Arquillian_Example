package org.arquillian.example.helloworld;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class GreetingServiceTestCase {

    @Deployment
    public static JavaArchive deployService() {
        JavaArchive archive
                = ShrinkWrap.create(JavaArchive.class)
                        .addClass(MyBean.class)
                        .addClass(MyBeanLocal.class)
                        .addClass(ServiceBean.class)
                        .addClass(ServiceBeanLocal.class);
        return archive;
    }

    @EJB
    private ServiceBeanLocal service;

    @Test
    public void shouldGreetTheWorld() throws Exception {
        System.out.println(service.doSomeBusiness());
        Assert.assertEquals("Doing something...", service.doSomeBusiness());
    }
}
