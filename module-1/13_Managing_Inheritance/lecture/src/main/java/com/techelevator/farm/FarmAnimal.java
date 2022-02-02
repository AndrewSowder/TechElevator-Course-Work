package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {

	private String name;
	private String sound;
	private static Boolean asleep;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public final String getSound( ) {
		if( asleep ) {
			return "Zzzz...";
		}
		return sound;
	}
	public Boolean isAsleep(){
		return asleep;
	}
	public void setAsleep(Boolean asleep){
		this.asleep = asleep;
	}

	public abstract String getFavoriteFood();

}