package pl.sda.javalondek4.java_demo.lambda.calculator;



public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");
        //lewa strona okresle co implementujemy (interface funkcyjny i jego metode abstrakcyjna)
        Adder<Integer> adder = (Integer a,Integer b) -> {
            return a + b;};

        Adder<Integer> adder2 = (first, second)-> {
            return first + second;
        };

        Adder<Integer> adder3 = (first , second) -> first + second;

        StrangeOne strangeOne = (a,b) -> a + b;

        StringAdder stringAdder = (one , two)-> {return one.concat(two);};

        MyAdder myAdder = (a, b, text)->{
            System.out.println(text);
            return a + b;
        };
        myAdder.addWithComment(5,10,"should be 15");

        Substraction<Integer> substruction= (a, b)-> a-b;

        Multiplication<Integer> multiplication = (x, y) -> x * y;

        Division<Integer> div = (a,b) -> a/b;

        Operation<Double> divisionOperation = (first, second) -> first/second;

        Playable<Long> footballPlayer= (speed)-> System.out.println("Football players speed is: " + speed + "km/h");
        Playable<String> gamesPlayer= (name)-> System.out.println("Game Player "+ name + " is playing");
        Playable<Integer> loser=(numerOfLostGames)-> System.out.println("Loser is losing his " + numerOfLostGames+ "th game.");

        footballPlayer.play(10L);
        gamesPlayer.play("Bartek");
        loser.play(5);

    }
}
