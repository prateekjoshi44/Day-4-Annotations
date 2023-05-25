import java.lang.annotation.*;
import java.lang.reflect.*;

// Custom annotation to mark cars
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Car {
    String make();
    String model();
    int year();
}

// Annotated class
@Car(make = "Ford", model = "Mustang", year = 2022)
class Mustang {
    // Class implementation
}

// Main class to process annotations
public class Cars {
    public static void main(String[] args) {
        // Accessing annotations
        Class<?> clazz = Mustang.class;
        Car carAnnotation = clazz.getAnnotation(Car.class);
        
        if (carAnnotation != null) {
            System.out.println("Make: " + carAnnotation.make());
            System.out.println("Model: " + carAnnotation.model());
            System.out.println("Year: " + carAnnotation.year());
        }
    }
}
