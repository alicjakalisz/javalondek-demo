package pl.sda.javalondek4.java_demo.optional;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class MySecret<T> {
    private T secret;

    public MySecret(T secret) {
        this.secret = secret;
    }

    public T getSecret() {
        return secret;
    }

    public void setSecret(T secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret<String> realOne = new MySecret<>("I like learning and teaching JVM technoloogies:P");
        MySecret<String> withNullContent = new MySecret<>(null);
        printSecretLenght(realOne);
        printSecretLenght(withNullContent);
        MySecret<Integer> secretNumber = new MySecret<>(42);
        MySecret<Integer> secretNullNumber = new MySecret<>(null);
        secretNumber.getSecret();
        secretNullNumber.getSecret();

        Optional<Integer> number = Optional.of(42); // never ever null inside
        Optional<Integer> nullNumber = Optional.empty();//always null
        Optional<Integer> theNull = Optional.ofNullable(null); // potentically can be null
    }

    public static void printSecretLenght(MySecret<String> mySecret){
      int secretLen =  mySecret.getSecret()!=null? mySecret.getSecret().length() : 0;
      secretLen =  nonNull(mySecret.getSecret())? mySecret.getSecret().length() : 0;

  /*    if(mySecret.getSecret()!= null){
          secretLen = mySecret.getSecret().length();
      }
      else {
          secretLen = 0;
      }*/

        System.out.println("My secret has " + secretLen + "characters");

    }
    public static <T> void processSecret(T optional) {
        //make optional from T
        Optional<T> opt = Optional.ofNullable(optional);
        int number = 4;
        Optional<Integer> numberInsideOptional = Optional.of(number);

        //T unpacked = opt.get(); // dont do it!! wywala exception
        T unpacked;
        if(opt.isPresent()){
            unpacked=opt.get();
        }
        else{
            unpacked= null;
        }

        unpacked = opt.orElse(null);
        unpacked = (T)opt.or(()->null);

        Optional<String> string = Optional.empty();
        Optional<String> fromOptional = string.or(()-> Optional.of("no value"));
    }



}
