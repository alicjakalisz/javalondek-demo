package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        AlicjaRunner alicjaRunner = new AlicjaRunner();
        alicjaRunner.walk();

        Runner runner = new AlicjaRunner();
        runner.go();

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner");
            }
        };
        anonymousRunner.go();
    }
}
