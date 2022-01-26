package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {

		Lecture lecture = new Lecture();
		lecture.testAutoBoxing();

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		List<String> names = new ArrayList<>();
		names.add("Andrew");
		names.add("Alexis");
		names.add("Sterling");

		System.out.println(names.get(2));
		System.out.println(names);

		List<Integer> zipCodes = new ArrayList<>(Arrays.asList(45215, 45209, 45202));
		zipCodes.add(0,45206);
		System.out.println(zipCodes);

		String s1 = "ALL MEN ARE CREATED EQUAL";
		String s2 = s1.substring(16, 19);

		System.out.println(s2);

		String space = " ";
		String[] pets = {"guinea pig", "cat", "dog"};
		String joinedPets = String.join(space, pets);
		pets = joinedPets.split(space);

		System.out.println(pets[2]);




		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		names.add("Andrew");


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(0, "William");
		System.out.println("Number of items in names = " + names.size());

		List<String> planets = new ArrayList<>();
		planets.add("Mercury"); //1
		planets.add("Venus"); //2
		planets.add("Earth"); //3

		for(int i = 0; i < planets.size(); i++) {
			System.out.println(planets.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		planets.remove("Earth") ;
		for(int i = 0; i < planets.size(); i++) {
			System.out.println(i + " : " + planets.get(i));
		}



		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		List<String> boardGames = new ArrayList<>();
		boardGames.add("Risk");
		boardGames.add("Sorry");
		boardGames.add("Monopoly");
		boolean foundMonopoly = lecture.doesListContain(boardGames, "Monopoly");
		if(foundMonopoly) {
			System.out.println("Found Monopoly!");
		}
		System.out.println(boardGames);


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfMonopoly = boardGames.indexOf("Monopoly");
		System.out.println("Found Monoploay at index " + indexOfMonopoly);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		String[] boardGamesArray = boardGames.toArray(new String[0]);


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		System.out.println("boardGames before sort: " + boardGames  );
		Collections.sort(boardGames);
		System.out.println("boardGames after sort: " + boardGames );



		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(boardGames);
		System.out.println(boardGames);



		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(String boardGame : boardGames ){
			System.out.println(boardGame);
		}
Double.valueOf()
		List<Integer> nums =  new ArrayList<>(Arrays.asList(123, 456, 789));

		int sum = 0;
		for( Integer num : nums) {
			sum = sum + num;
			System.out.println(sum);
		}


	}

	public void testAutoBoxing() {
		System.out.println("In testAutoBoxing");

		Integer x = 5;
		Double pi = 3.14159;

		double dpi = pi;
	}

	 public boolean doesListContain(List<String> listToSearch, String strToFind){
		listToSearch.add("Some string");
		boolean found = listToSearch.contains(strToFind);
		return found;
	 }
}
