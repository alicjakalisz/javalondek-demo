package pl.sda.javalondek4.java_demo.lambda.excercises.fromLeszek;

@FunctionalInterface
public interface Playable<T, S> {
    T play(T value, T score, S comment);
}
