package com.corejava.java5.annotation.custom;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*
 * Sometimes it can be useful to specify the same annotation more than once 
 * on a given Java element.
 */

/* Before Java 7, we had to group annotations together into 
 * a single container annotation:
 * 
 * 	@Schedules({
    	@Schedule(time = "15:05"),
    	@Schedule(time = "23:00")
	})
	void scheduledAlarm() {
	}
 */

/*
 * Since Java 8, with the @Repeatable annotation, we can make an annotation repeatable
 */

/*
 * Step 1: Declare a Repeatable Annotation Type
 */
@Repeatable(Schedules.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Schedule {
    String time() default "09:00";
}

/*
 * Step 2: Declare the Containing Annotation Type
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
    Schedule[] value();
}

public class CustomAnnocation_Repeatable_Demo {

	public static void main(String[] args) throws Exception {
		CustomAnnocation_Repeatable_Demo demo = new CustomAnnocation_Repeatable_Demo();

		Method m = demo.getClass().getMethod("scheduledAlarm");
		System.out.println("Method is: " + m.getName());
		Schedule arrSchedule[] = m.getAnnotationsByType(Schedule.class);
		
		for(Schedule schedule: arrSchedule) {
			System.out.println("Annotation value is: " + schedule.time());
		}
	}
	
	@Schedule
	@Schedule(time = "15:05")
	@Schedule(time = "23:00")
	public void scheduledAlarm() {
	}
}
