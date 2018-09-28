package be.pxl.generics.opgave1.opgave_d;

import be.pxl.generics.opgave1.Bike;
import be.pxl.generics.opgave1.Motorized;
import be.pxl.generics.opgave1.Vehicle;

public class WorkingPlaceUtility {
	public static int getScore(WorkingPlace<? extends Bike> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
