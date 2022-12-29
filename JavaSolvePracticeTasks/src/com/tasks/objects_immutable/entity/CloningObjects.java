package com.tasks.objects_immutable.entity;

public class CloningObjects {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(1,2);
        Point clone = point.clonePoint();
        Point cloneWithCloneable = (Point) point.clone();
        // deep cloning using class Cloner
        // Cloner.cloner.deepClone(point)
        Point point1 = new Point(3,4);

    }
}
