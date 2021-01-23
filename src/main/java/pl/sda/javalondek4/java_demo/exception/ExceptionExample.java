package pl.sda.javalondek4.java_demo.exception;

public class ExceptionExample {
    // checked exceptions - all inherited from Exception (then from Throwable) but RunTimeExpcetion , trzeba zlapac
    //unchecked exceptions - all inherited from RunTimeException
    //errors - inherited directly from Throwable (mozna zlapac, ale nie pownnismy je lapac)

    public static void main(String[] args) {
        //method of Exception Generator throw exception, you can handle or declare.
        //you should not throw exception to main because they will never be handled
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        String myNick;
        try { //first step
            myNick = exceptionGenerator.nick();
        }
        catch(NoNickException e){ // second step
          //to jest glupie  e.printStackTrace();
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        }
        finally { // third // always
            //myNick ="from finally:)"; //it always overrides nick :(
        }
        System.out.println("My nick is: "+ myNick);

        System.out.println("Now with runtime exceptions...");

        myNick = exceptionGenerator.nickWithRunTimeException();
        System.out.println("My nick now is: " + myNick);
        String nullString = null;
        nullString.concat(" ma kota");

        System.out.println("here???");
    }
}
