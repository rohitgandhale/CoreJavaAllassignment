package ClassAndobjects;

public class Area {
    int length,breadth;

    public void setDim(int rectanglelength, int rectangleBreadth) {
        length=rectanglelength;
        breadth=rectangleBreadth;
    }
    public int getArea(){
        int results=length*breadth;
        return results;
    }

    public static void main(String[] args) {
        Area area=new Area();
        area.setDim(5,6);
        System.out.println("Area="+area.getArea());
    }

}
