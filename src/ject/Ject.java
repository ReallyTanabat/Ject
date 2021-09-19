/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ject;
import java.util.Scanner;
/**
 *
 * @author Tanabat
 */
public class Ject {
    public static void main(String[] args){
        BeanBoun S = new BeanBoun();
        Listener1 L1 = new Listener1();
        Listener2 L2 = new Listener2();
        S.addPropertyChangeListener(L1);
        S.addPropertyChangeListener(L2);
        System.out.print("Predic Your Score Thai - UAE : ");
        Scanner in = new Scanner(System.in);
        String got = in.nextLine();
        while(!got.isEmpty()){
            S.setScore(got);
            System.out.print("Predic Your Score That - UAE : ");
            got = in.nextLine();
        }
        
    }
    
}
