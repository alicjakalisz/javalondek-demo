package pl.sda.javalondek4.java_demo.lambda;



public class AlicjaRunner implements Runner {

    @Override
    public void go() {
        System.out.println("run Alicja, run!");
    }
    public void walk(){
        System.out.println("walk Alicja");
    }

    @Override
    public void go(int speed) {
        System.out.println("Alicja speed is " + speed);
    }
}
