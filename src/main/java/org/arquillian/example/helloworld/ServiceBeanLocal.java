/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arquillian.example.helloworld;

import javax.ejb.Local;

/**
 *
 * @author Sina
 */
@Local
public interface ServiceBeanLocal {

    String doSomeBusiness();
    
}
