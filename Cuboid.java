public class Cuboid extends Object3D{
    double width;
    double height;
    double length;
    public Cuboid(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public double getVolume(double width, double height, double length){
        double hitung = width * height * length;
        return hitung;
    }

    public double getSurfaceArea(double width, double height, double length){
        double luas= 2*(length*height + width*height + length*height);
        return luas;
    }

    @Override
    public String printData(){
        String print = "Name: " + shapeName.CUBOID + ", Volume: " + getVolume() + ", Surface Area: " + getSurfaceArea();
        return print;
    }
}
