package models;
import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private double result;
    public ArrayList<Point> points = new ArrayList<>();
    // addPoint(Point) - adds to the container
    public void addPoint(Point newpoint){
        points.add(newpoint);
    }
    // calculatePerimeter()
    public double calculatePerimeter(){
        result = 0;
        for(int i = 0; i < points.size(); i++){
            Point p1 = points.get(i);
            Point p2;
            if (i+1 != points.size()){
                p2 = points.get(i+1);
            }
            else {
                p2 = points.getFirst();
            }
            result += p1.distance(p2);
        }
        return result;
    }
    // getAverageSide()
    public double getAverageSide(){
        return calculatePerimeter()/points.size();
    }
    // getLongestSide()
    public double getLongest(){
        result = 0;
        for(int i = 0; i < points.size(); i++){
            Point p1 = points.get(i);
            Point p2 = points.get(i+1%points.size());
            double out = p1.distance(p2);
            if (out > result) result = out;
        }
        return result;
    }
}