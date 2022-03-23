/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 * 
 * 
 */

function isAdmitted(gpa, satScore = 0, recommendation = false) {

    let hasOkGpa = gpa > 3.0;
    let hasOkSat = satScore > 1200;
    let hasRecommendation = recommendation = true
    let isAccepted = false;

    if (hasOkGpa && hasRecommendation) {
        isAccepted = true;
    } else if (hasOkSat && hasRecommendation) {
        isAccepted = true;
    } else if (gpa > 4.0 || satScore > 1400) {
        isAccepted = true;
    }
    return isAccepted;

}


/**
 * Write a function called useParameterToFilterArray that takes a
 * function and uses that in the `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];

function useParameterToFilterArray(input) {
    return unfilteredArray.filter(input);
}

/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

function makeNumber(string1, string2 = '') {
    return parseInt(string1 + string2);

}

/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */

function addAll(...number) {
    return number.reduce((preVal, curVal) => preVal + curVal, 0);
}

/**
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 * 
 * @param {string[]} an array of strings to concatenate 
 * @returns{string[]} a new array of strings with the word 'Happy ' in front
*  
 * */

function makeHappy(words) {
    return words.map(word => 'Happy ' + word);
}


/**
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects. Each object contains the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * Return an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 * 
 * @param {[objects]} an array of property objects.
 * @returns{string[]} an array of the object variables as strings
 */

function getFullAddressesOfProperties(objArray) {
    return objArray.map(({ streetNumber, streetName, streetType, city, state, zip }) => `${streetNumber} ${streetName} ${streetType} ${city} ${state} ${zip}`);
}

/**
 * Write and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It must work for strings and numbers.
 * 
 * 
 * @param{number[]} an array to sort through
 * @returns{string or number} the element with the largest size or value. 
 * 
 * 
 */

function findLargest(array) {
    let max = "";
    array.forEach(element => {
        if (element > max)
            max = element;
    });
    return max;
}


/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */

function getSumOfSubArrayValues(kingArray) {
    if (kingArray == null){
        return 0;
    }else {
    return kingArray.reduce((prev, cur) => {
        return prev + cur.reduce((prevInner, curInner) => {
          return prevInner + curInner;
        });
      }, 0);
    }
}