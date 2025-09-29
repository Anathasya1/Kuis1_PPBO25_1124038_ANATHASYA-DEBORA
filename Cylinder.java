public class Cylinder extends Object3D{
    double radius;
    double height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double getVolume(double radius, double height){
        double hitung = Math.PI * radius *radius * height;
        return hitung;
    }

    public double getSurfaceArea(double radius, double height){
        double luas= (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
        return luas;
    }
    @Override
    public String printData(){
        String print = "Name: " + shapeName.CYLINDER+ ", Volume: " + getVolume() + ", Surface Area: " + getSurfaceArea();
        return print;
    }
}
