/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Tanabat
 */
public class Listener1 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       System.out.println(evt.getNewValue());
    }
    
}
