/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quiz;

import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class Quiz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sl , cl , cr, sr;
        Square a1 = new Square();
        Circle a2 = new Circle();
        Cubic a3 = new Cubic();
        Sphere a4 = new Sphere();
        System.out.println("Enter Square dimention");
        sl = in.nextInt();
        System.out.println(" "+"Area of square = " + " " +a1.getArea( sl));
        
        System.out.println("Enter Circle raduis");
        cr = in.nextInt();
        System.out.println(" "+"Area of circle = " + " " +a2.getArea(cr));
        
        System.out.println("Enter Cubic dimention");
        cl = in.nextInt();
        System.out.println(" "+"Area of Cube = " + " " +a3.getArea(cl)); 
        
        System.out.println("Enter Sphere raduis");
        sr = in.nextInt();
        System.out.println(" "+"Area of Sphere = " + " " +a4.getArea(sr));
          
    }
}
interface Shape {
    public double getArea(float x);
    
}
interface TwoDimentionalShape extends Shape {
    
    
}
interface ThreeDimentionalShape extends Shape {
    
    
}
class Circle implements TwoDimentionalShape{  
    @Override
    public double getArea(float x) {
       return Math.PI * x * x;
    }
    
}
class Square implements TwoDimentionalShape{
    @Override
    public double getArea(float x) {
       return x * x;
    }
    
}
class Sphere implements ThreeDimentionalShape{
    
    @Override
    public double getArea(float x) {
       return  Math.PI *4 * x * x;
    }
    
}
class Cubic implements ThreeDimentionalShape {
        
    @Override
    public double getArea(float x) {
       return 6.0 * x * x;
    }

    
}
