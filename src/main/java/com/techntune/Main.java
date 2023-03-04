package com.techntune;

import com.techntune.record.Point;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        //Compiler generated methods
        System.out.println("x coordinate " + point.x());
        System.out.println("y coordinate " + point.y());
        System.out.println(point);

        List<Point> points = new ArrayList<>();
        points.add(new Point(20, 30));
        points.add(new Point(20, 25));
        System.out.println(points);

        Point negativePoint = new Point(-2,3);
        //Compiler generated methods
        System.out.println("x coordinate " + point.x());
        System.out.println("y coordinate " + point.y());
        System.out.println(point);
    }
}