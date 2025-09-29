import java.util.Scanner;
import java.sql.Connection;
import java.util.ArrayList;

public abstract class Object3D{
    private static final Scanner sc;
        static {
            sc = new Scanner(System.in);
        }
    public double getVolume(){
        return 0;
    }
    public double getSurfaceArea(){
        return 0;
    }
    public String printData(){
        return "?";
    }

    public static void main(String[] args) {
        ArrayList<Object3D> data3D = new ArrayList<>();
        int menu = -1;
        while (menu != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Add new 3D object");
            System.out.println("2. Print all");
            System.out.println("0. Exit");
            System.out.print("Input menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                int menuAdd = 0;
                while (menuAdd != -1) {
                    
                    System.out.println("Menu: ");
                    System.out.println("1. Sphere ");
                    System.out.println("2. Cylinder");
                    System.out.println("3. Cuboid ");
                    System.out.println("4. Cube ");
                    System.out.print("Input menu: ");
                    menuAdd = sc.nextInt();

                    switch (menuAdd) {
                        case 1:
                            System.out.println("Masukkan radius: ");
                            double radius = sc.nextInt();
                            Sphere sphere = new Sphere(radius);
                            sphere.getVolume(radius);
                            sphere.getSurfaceArea(radius);
                            sphere.printData();
                            data3D.add(sphere);
                            break;
                        case 2:
                            System.out.println("Masukkan radius: ");
                            double radiusCy = sc.nextInt();
                            System.out.println("Masukkan height: ");
                            double heightCy = sc.nextInt();
                            Cylinder cylinder = new Cylinder(radiusCy,heightCy);
                            cylinder.getVolume(radiusCy, heightCy);
                            cylinder.getSurfaceArea(radiusCy, heightCy);
                            cylinder.printData();
                            data3D.add(cylinder);
                            break;
                        case 3:
                            System.out.println("Masukkan width: ");
                            double width = sc.nextInt();
                            System.out.println("Masukkan height: ");
                            double heightCu = sc.nextInt();
                            System.out.println("Masukan length: ");
                            int lengthCu = sc.nextInt();
                            Cuboid cuboid = new Cuboid(width, heightCu,lengthCu);
                            cuboid.getVolume(width, heightCu, lengthCu);
                            cuboid.getSurfaceArea(width, heightCu, lengthCu);
                            data3D.add(cuboid);
                            break;
                        case 4:
                            System.out.println("Masukan side: ");
                            int side = sc.nextInt();
                            Cube cube = new Cube(side);
                            cube.getVolume(side);
                            cube.getSurfaceArea(side);
                            cube.printData();
                            data3D.add(cube);
                            break;
                        default:
                            break;
                    }
                }

                case 2:
                    for (int i = 0; i < data3D.size(); i++) {
                        System.out.println(i);
                    } 
                    break;
                default:
                    break;
            }
        }
    }
}