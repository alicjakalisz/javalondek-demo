package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        AlicjaRunner alicjaRunner = new AlicjaRunner();
   //     alicjaRunner.walk();

        Runner runner = new AlicjaRunner();
    //    runner.go();
        handleRunner(runner);
        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner");
            }
        };
        anonymousRunner.go();
        handleRunner(anonymousRunner);

        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }
        });


    }
    public static void handleRunner (Runner anyRunner){
        System.out.println("handleRunner()");
        anyRunner.go();
    }

}
