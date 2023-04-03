package com.corejava.java5.annotation.custom;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Here is an example to demonstrate the use of custom annotation.
 * 
 * It is about 2 classes, Car and Engine. Suppose we have a requirement such that 
 * BasicEngine needs to apply to all types of cars. In that case, 
 * we can develop custom annotation such as @BasicEngineand annotate 
 * all kinds of Car implementations (e.g., HatchBackCars, SportsCars, SedanCars, etc.,) 
 * with BasicEngine.
 */


@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface BasicEngine {
    String mileage() default "20";
    String fuelType() default "Gasoline";
}


@BasicEngine(mileage="30", fuelType ="BioDiesel")
class Car {

	public void getCarDetails() {
		System.out.println("I am from Car class");
	}
}

class HatchBackCars extends Car{
    String make;
    String model;
    
    public HatchBackCars(String make, String model){
        this.make = make;
        this.model = model;
    }

    @Override
    public void getCarDetails(){
        System.out.println("Car Manufacture: " + make);
        System.out.println("Car Model: " + model);
    }	
}

class SportsCars extends Car{
    String make;
    String model;
    public SportsCars(String make, String model){
        this.make = make;
        this.model = model;
    }

    @Override
    public void getCarDetails(){
        System.out.println("Car Manufacture: " + make);
        System.out.println("Car Model: " + model);
    }	
}

public class Using_Custom_Annotations_Demo {

	public static void main(String[] args) {
		
		/*
		 * Both HatchBackCars & SportsCars has metadata of mileage=30 and fuelType=BioDiesel
		 * as they are extending Car which has annotation @BasicEngine
		 * 
		 */
        Car car = new HatchBackCars("2016", "Baleno");
        car.getCarDetails();
        Class carClass = car.getClass();
        Annotation testAnn = carClass.getAnnotation(BasicEngine.class);
        BasicEngine engine = (BasicEngine)testAnn;
        System.out.println("Mileage: " + engine.mileage());
        System.out.println("Fuel Type: " + engine.fuelType());
        
        System.out.println("\n");
        
        car = new SportsCars("2021", "Sonata");
        car.getCarDetails();
        carClass = car.getClass();
        testAnn = carClass.getAnnotation(BasicEngine.class);
        engine = (BasicEngine)testAnn;
        System.out.println("Mileage: " + engine.mileage());
        System.out.println("Fuel Type: " + engine.fuelType());        
	}
}
