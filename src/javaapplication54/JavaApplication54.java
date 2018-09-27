/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 *
 * @author rkaune
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "maple";
        String str2 = "leaf";
        String str3 = str1 + str2;
        System.out.println(str3);
        str1 = "maple";
        str1 += "leaf"; 
        System.out.println(str1);
        str1 = "Toronto";
        str2 = "Ontario";
        str3 = "Canada";
        String str4 = str1+", "+str2+", "+str3;
        System.out.println(str4);
        str1 = "Area = ";
        double area = Math.PI * Math.pow(3, 2);
        str1 += area;
        System.out.println(str1);
    }
    
}
