/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1;


/**
 *
 * @author Mostafa
 */
public class Project1 {

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of Circle = "+area.circleArea(5));
        System.out.println("Area of Cube = "+area.cubeArea(5));
        System.out.println("Area of Rectangular = "+area.rectangularArea(5,4));
        
        Matrix m1 = new Matrix();
        
        int ro1 = 4, co1 = 3, ro2 = 3, co2 = 4;
 
        int a[][] = { { 1, 1, 1 },
                      { 2, 2, 2 },
                      { 3, 3, 3 },
                      { 4, 4, 4 } };
 
        int b[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 } };
        m1.multiplyMatrix(ro1, co1, a, ro2, co2, b);
        
        int s = 4;
 
        int r[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        
        int z[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        m1.addition(r, z, s);
        m1.subtraction(r, z, s);
        
    }
}
