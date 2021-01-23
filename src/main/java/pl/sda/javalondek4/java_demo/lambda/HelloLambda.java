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

        //using lambda - super happy :)

        handleRunner(() -> System.out.println("inside lambda call"));

        //we're implementing method go() here!!
        Runner myFirstLambda = () -> {};

        //expression has a value and statement not
        //expresion - return value, statement void
        Runner mySecondLambda = () -> {
            System.out.println("Inside my second lambda");

        };

        Runner myThirdLambda = () -> System.out.println("my third lambda");

        Runner myFourthLambda = () -> {
            System.out.println("first text");
            System.out.println("second text");
        };

        myFourthLambda.go();
        myFourthLambda.go(4);
        Runner.walk();
    }
    public static void handleRunner (Runner anyRunner){
        System.out.println("handleRunner()");
        anyRunner.go();
    }



}
