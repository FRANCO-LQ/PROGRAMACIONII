/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ExaMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h,m;
        System.out.println("Introducir la hora :");
        h=sc.nextInt();
        System.out.println("Introducir el minuto:");
        m=sc.nextInt();
        int m1=m+1;
        int h1;
    if(m1 > 59){
        m1=00;
    
        h1=h+1;
    } 
    else{
        h1=h;
    }
     if(h1>23){
     h1=00;
     }
        System.out.println(h1+":"+m1);
    }
    }
