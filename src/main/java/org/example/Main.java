package org.example;

import geometry2d.Circle;
import geometry3d.Cylinder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle a= new Circle(1);
        Cylinder b= new Cylinder(10,a);
        System.out.printf("Hello and welcome!");
        System.out.println(b.volume());
    }
}