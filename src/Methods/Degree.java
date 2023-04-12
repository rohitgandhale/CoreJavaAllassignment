package Methods;

public class Degree {
    public void getDegree(){
        System.out.println("I got a degree");
    }
    static class Undergraduate {
        public void getDegree() {
            System.out.println("I am an undergraduate");
        }
    }
    static class Postgraduate{
            public void getDegree(){
                System.out.println("I am an postgraduate");
            }
    }


    public static void main(String[] args) {
        Degree a=new Degree();
        a.getDegree();
        Undergraduate b=new Undergraduate();
        b.getDegree();
        Postgraduate postgraduate=new Postgraduate();
        postgraduate.getDegree();



    }




}
