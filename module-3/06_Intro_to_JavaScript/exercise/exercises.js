/*
1. **sumDouble** Given two int values, return their sum. Unless the two values are the 
	same, then return double their sum.

		sumDouble(1, 2) → 3
		sumDouble(3, 2) → 5
		sumDouble(2, 2) → 8

		function sumDouble(x, y) {
			// do logic here
			// return result;
			return x + y;
		}
*/

function sumDouble(x, y) {
	if (x === y) {
		return (x + y) * 2;
	}
	else
		return x + y;

}


/*
2. **hasTeen** We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	Given 3 int values, return true if 1 or more of them are teen.

		hasTeen(13, 20, 10) → true
		hasTeen(20, 19, 10) → true
		hasTeen(20, 10, 13) → true
*/

function hasTeen(num1, num2, num3){

numArr = [num1, num2, num3];
for (let i = 0; i < numArr.length; i++) {
	if (numArr[i] >= 13 && numArr[i] <= 19) {
		return true;
	} else {
	}
}return false;
}


/* 
3. **lastDigit** Given two non-negative int values, return true if they have the same 
	last digit, such as with 27 and 57.

		lastDigit(7, 17) → true
		lastDigit(6, 17) → false
		lastDigit(3, 113) → true
*/

function lastDigit(num1, num2) {
	return num1 % 10 === num2 % 10;
}

/*
4. **seeColor** Given a string, if the string begins with "red" or "blue" return that color 
	string, otherwise return the empty string.

		seeColor("redxx") → "red"
		seeColor("xxred") → ""
		seeColor("blueTimes") → "blue"
*/

function seeColor(str) {
	let color = "";
	if (str.startsWith('red')) {
		color = "red";
	} else if (str.startsWith('blue')) {
		color = "blue";
	}
	return color;
}

/*
5. **oddOnly** Write a function that given an array of integer of any length, filters out
	the even number, and returns a new array of just the the odd numbers.

		oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) → [1, 3, 5, 7, 9, 11];
		oddOnly([2, 4, 8, 32, 256]); → []
*/

function oddOnly(array) {
	let filtered = [];
	for (let i = 0; i < array.length; i++) {
		if (array[i] % 2 > 0 ) {
			filtered.push(array[i]);
		}
	}return filtered;
}

/*
6. **frontAgain** Given a string, return true if the first 2 chars in the string also appear
	at the end of the string, such as with "edited".

		frontAgain("edited") → true
		frontAgain("edit") → false
		frontAgain("ed") → true
*/

function frontAgain (str) {
	return str.substring(0, 2) == str.substring(str.length -2);
}


/*
7. **cigarParty** When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Write a squirrel party function that return true if the party with the given values is successful,
or false otherwise.

		cigarParty(30, false) → false
		cigarParty(50, false) → true
		cigarParty(70, true) → true
*/

function cigarParty(numCigars, isWeekend){
	const hasMinCigars = numCigars >= 40;

	if(hasMinCigars && isWeekend 
		|| !isWeekend && hasMinCigars && numCigars <=60){
			return true;
		} else {
		}
	return false;
}

/*
8. **fizzBuzz** Because you know you can't live without it, FizzBuzz.

		fizzBuzz(3) → "Fizz"
		fizzBuzz(1) → 1
		fizzBuzz(10) → "Buzz"
		fizzBuzz(15) → "FizzBuzz"
		fizzBuzz(8) → 8
*/

function fizzBuzz(num){
	let result = num;
	if(num % 3 == 0 && num % 5 == 0){
		result = "FizzBuzz";
	}else if(num % 3 == 0){
		result = "Fizz";
	}else if(num % 5 == 0){
		result = "Buzz"
	}
	return result;
}

/*
9. **filterEvens** Write a function that filters an array to only include even numbers.

	filterEvens([]) → []
	filterEvens([1, 3, 5]) → []
	filterEvens([2, 4, 6]) → [2, 4, 6]
	filterEvens([100, 8, 21, 24, 62, 9, 7]) → [100, 8, 24, 62]
*/

function filterEvens(array) {
	let filtered = [];
	for (let i = 0; i < array.length; i++) {
		if (array[i] % 2 == 0 ) {
			filtered.push(array[i]);
		}
	}return filtered;
}

/*
10. **filterBigNumbers** Write a function that filters numbers greater than or equal to 100.

	filterBigNumbers([7, 10, 121, 100, 24, 162, 200]) → [121, 100, 162, 200]
	filterBigNumbers([3, 2, 7, 1, -100, -120]) → []
	filterBigNumbers([]) → []
*/

function filterBigNumbers(array) {
	let filtered = [];
	for (let i = 0; i < array.length; i++) {
		if (array[i] >= 100 ) {
			filtered.push(array[i]);
		}
	}return filtered;
}

/*
11. **filterMultiplesOfX** Write a function to filter numbers that are a multiple of a
parameter, `x` passed in.

	filterMultiplesOfX([3, 5, 1, 9, 18, 21, 42, 67], 3) → [3, 9, 18, 21, 42]
	filterMultiplesOfX([3, 5, 10, 20, 18, 21, 42, 67], 5) → [5, 10, 20]
*/

function filterMultiplesOfX(array, x) {
	let filtered = [];
	for (let i = 0; i < array.length; i++) {
		if (array[i] % x == 0 ) {
			filtered.push(array[i]);
		}
	}return filtered;
}

/*
12. **createObject** Write a function that creates and returns an object with a property called
firstName, lastName, and age. Populate the properties with your values.

	createObject() →

	{
		firstName,
		lastName,
		age
	}
*/

function createObject(){
const obj = {
	firstName: "John",
	lastName: "Wick",
	age: 57
};

return obj;
}