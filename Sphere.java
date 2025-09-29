public class Sphere extends Object3D{
    double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    public double getVolume(double radius){
        double hitung = 4/3*Math.PI*(radius*radius*radius);
        return hitung;
    }

    public double getSurfaceArea(double radius){
        double luas= 4*Math.PI*radius*radius;
        return luas;
    }
    @Override
    public String printData(){
        String print = "Name: " + shapeName.SPHERE+ ", Volume: " + getVolume() + ", Surface Area: " + getSurfaceArea();
        return print;
    }
}
