package pl.sda.javalondek4.java_demo.lambda;

public class WorkLifeImplementation implements WorkLifeBalance {
    @Override
    public void hardWork() {
        System.out.println("working hard - class");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping - class");
    }
}
