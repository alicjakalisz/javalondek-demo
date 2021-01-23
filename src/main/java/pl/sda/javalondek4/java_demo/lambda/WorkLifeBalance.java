package pl.sda.javalondek4.java_demo.lambda;



@FunctionalInterface
public interface WorkLifeBalance {
    void hardWork();

    default void sleep() {

    }

    public static void main(String[] args) {
        //1 Implement WorkLifeBalance in a separate class
        //2. use WorkLifeBalance as annonymous class

        WorkLifeBalance workLifeBalance = new WorkLifeBalance() {
            @Override
            public void hardWork() {
                System.out.println("working hard");
            }

            @Override
            public void sleep() {
                System.out.println("sleeping");
            }
        };
        WorkLifeBalance workLifeclass = new WorkLifeImplementation();
    }
    WorkLifeBalance workLifeBalanceAfterCovid = () -> System.out.println("Normal job");
}
