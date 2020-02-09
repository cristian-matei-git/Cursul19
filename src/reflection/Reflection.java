package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Reflection {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//we create a vehicle object
		Vehicle vehicle = new Vehicle("WBA1R510505E86409", 5);
		
		//we get the first method and make it accesible and then we call it
		Class aVehicle = Vehicle.class;
		Method firstMethod = Vehicle.class.getDeclaredMethod("displaySerialNumberAndPassword", null);
		
		firstMethod.setAccessible(true);
		firstMethod.invoke(vehicle, null);
		
		//we read the noPersons field and get its value
		Field privateField = Vehicle.class.getDeclaredField("noPersons");

		privateField.setAccessible(true);
		
		Integer fieldValue = (int) privateField.get(vehicle);
		System.out.println("noPersons from constructor = " + fieldValue);
		
		//we get the second method and make it accesible
		Method secondMethod = Vehicle.class.getDeclaredMethod("changeNoPersons", int.class);
		secondMethod.setAccessible(true);
		
		// we call it with the value we read before and double it
		boolean returnValue = (boolean) secondMethod.invoke(vehicle, fieldValue*2);
		
		//we read the noPersons field again to see if the value changed
		fieldValue = (int) privateField.get(vehicle);
		System.out.println("noPersons after reflection = " + fieldValue);
		
	}

}
