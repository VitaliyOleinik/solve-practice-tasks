package com.tasks.objects_immutable.entity;

public class Point implements Cloneable {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point clonePoint() {
        Point point = new Point();
        point.setX(this.x);
        point.setY(this.y);
        return point;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //example of cloning with GSON
//    private static <T> T cloneThroughJson(T t) {
//        Gson gson = new Gson();
//        String json = gson.toJson(t);
//
//        return (T) gson.fromJson(json, t.getClass());
//    }
}
