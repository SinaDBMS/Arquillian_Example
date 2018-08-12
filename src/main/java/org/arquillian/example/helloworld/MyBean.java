/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arquillian.example.helloworld;

import javax.ejb.Stateless;

/**
 *
 * @author Sina
 */
@Stateless
public class MyBean implements MyBeanLocal {

    @Override
    public String doSomething() {
        return "Doing something...";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
