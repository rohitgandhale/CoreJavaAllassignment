package ClassAndobjects;

public class AddDistance {
    float number1;
    float number2;
    float getDistance(float number1,float number2){
        return number1+number2;
    }

    public static void main(String[] args) {
        AddDistance distance=new AddDistance();
        System.out.println(distance.getDistance(5,6));
    }
}
