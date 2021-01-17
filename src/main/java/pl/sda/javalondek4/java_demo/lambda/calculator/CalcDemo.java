package pl.sda.javalondek4.java_demo.lambda.calculator;



public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");
        //lewa strona okresle co implementujemy (interface funkcyjny i jego metode abstrakcyjna)
        Adder adder = (int a,int b) -> {
            return a + b;};

        Adder adder2 = (first, second)-> {
            return first + second;
        };

        Adder adder3 = (first , second) -> first + second;

        StrangeOne strangeOne = (a,b) -> a + b;

        StringAdder stringAdder = (one , two)-> {return one.concat(two);};

        MyAdder myAdder = (a, b, text)->{
            System.out.println(text);
            return a + b;
        };
        myAdder.addWithComment(5,10,"should be 15");

        Substruction substruction= (a, b)-> a-b;

        Multiplication multiplication = (x, y) -> x * y;

        Division div = (a,b) -> a/b;

    }
}
