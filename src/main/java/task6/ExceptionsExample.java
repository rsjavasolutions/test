package task6;

public class ExceptionsExample {

    public String doSomething(int i){
        if (i > 5){
            throw new IllegalArgumentException("Parametr jest większy od 5");
        }
        return String.valueOf(i);
    }

}
