package org.example;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

import java.util.logging.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
            Handler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new SimpleFormatter());
            consoleHandler.setLevel(Level.FINE);
            LOGGER.addHandler(consoleHandler);
            LOGGER.setLevel(Level.FINE);
            System.out.println("circle");
            Circle circle = new Circle(5);
            System.out.println(circle.perimeter());
            System.out.println(circle.area());
            System.out.println(circle.toString());
            System.out.println("cylinder");
            Cylinder cylinder = new Cylinder(10, circle);
            System.out.println(cylinder.volume());
            System.out.println("Rectangle");
            Rectangle rectangle = new Rectangle(5,4);
            System.out.println(rectangle.perimeter());
            System.out.println(rectangle.area());
            System.out.println(rectangle.toString());
        } catch (VariablesLesThanZeroException | VariablesNotSetException ex) {
            //System.out.println(ex.getMessage());
            LOGGER.log(Level.FINE,"Exception: {0}",ex.getMessage());
            //throw new RuntimeException(ex);
        }
        //System.out.printf("Hello and welcome!");
        //System.out.println(b.volume());
    }
}