import entities.Triangle;
import services.TriangleService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

		
        Scanner scanner = new Scanner(System.in);
        TriangleService service = new TriangleService();
        System.out.println("Enter the square: ");
        double square1 = scanner.nextDouble();
        Triangle triangle1 = service.findClosestSquare(square1);
        System.out.println("The triangle whose area is closest to the square " + square1 + ": " + triangle1);
        System.out.println();

        System.out.println("Enter the square: ");
        double square2 = scanner.nextDouble();
        List<Triangle> triangles2 = service.findClosestSquareTrians(square2);
        System.out.println("Triangles, the sum of the areas of which is closest to the area " + square2 + ":");
        for (Triangle triangle : triangles2){
            System.out.println(triangle);
        }
        System.out.println();

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        List<Triangle> triangles3 = service.findTriansWithLessRadius(radius);
        System.out.println("Triangles that fit in a circle of radius" + radius + ":");
        for (Triangle triangle : triangles3){
            System.out.println(triangle);
        }
    }
}
