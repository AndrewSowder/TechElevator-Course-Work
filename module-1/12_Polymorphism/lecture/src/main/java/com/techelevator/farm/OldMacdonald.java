package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Pig() };

		Singable happyCow = new Cow();




		Singable[] singables = new Singable[] { new Cow(), new Chicken(), new Pig(), new Tractor()};
		Sellable[] sellables = new Sellable[] {new Cow(), new Chicken(),new Pig(), new Egg()};
		for (Sellable Item : sellables){
			System.out.println(Item.getName() +" " + Item.getPrice());

		}



		for (Singable  animal : singables) {
			String name = animal.getName();
			String sound = animal.getSound();
			String aOrAn = animal.getAorAn();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With " + aOrAn + " " + sound + " " + sound + " here");
			System.out.println("And " + aOrAn  + " " + sound + " " + sound + " there");
			System.out.println("Here " + aOrAn + " " + sound + " there " + aOrAn +  " " + sound +
							" everywhere " + aOrAn + " " + sound + " " + sound);
			System.out.println();
		}

		List<Sellable> sellableItems = new ArrayList<>();
		sellableItems.add(new Egg());
		sellableItems.add(new Cow());
		sellableItems.add(new Chicken());

		BigDecimal sum = new BigDecimal("0");
		for(
			Sellable item :sellableItems ){

			BigDecimal price = item.getPrice();
				System.out.println(item.getName()+" "+"Price is "+price);
			sum =sum.add(price);
		}
		System.out.println("Total is " + sum );



	}
}