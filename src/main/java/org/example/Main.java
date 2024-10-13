package org.example;

import exceptions.ExceptionsLesThanZero;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Circle a= new Circle(-2);
            Cylinder b= new Cylinder(10,a);
        } catch (ExceptionsLesThanZero e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Hello and welcome!");
        //System.out.println(b.volume());
    }
}