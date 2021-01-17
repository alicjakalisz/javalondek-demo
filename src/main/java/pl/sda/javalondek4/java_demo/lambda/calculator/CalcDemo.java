package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");
        //lewa strona okresle co implementujemy
        Adder adder = (a,b) -> a + b;

        Adder adder2 = (first, second)-> {
            return first + second;
        };
        StrangeOne strangeOne = (a,b) -> a + b;

    }
}
