public class Cube extends Object3D{
    int side;
    public Cube(int side){
        this.side = side;
    }
    public double getVolume(int s){
        return s*s*s;
    }
    public double getSurfaceArea(int side){
        return 6*(side*side);
    }

    @Override
    public String printData(){
        String print = "Name: " + shapeName.CUBE + ", Volume: " + getVolume() + ", Surface Area: " + getSurfaceArea();
        return print;
    }
}
