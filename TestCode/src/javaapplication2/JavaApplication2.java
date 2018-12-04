/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import arduino.*;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Arduino nafady= new Arduino();
        
        nafady.setPortDescription("COM4");
        nafady.openConnection();
        
        while(true){
         nafady.serialWrite(sc.nextLine());   
         System.out.println(nafady.serialRead());
        }
    }
    
}
