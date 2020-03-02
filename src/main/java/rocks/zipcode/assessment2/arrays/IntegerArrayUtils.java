package rocks.zipcode.assessment2.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(integerArray));
        integers.add(valueToBeAdded);
        Integer [] array = new Integer[integers.size()];
        array =integers.toArray(array);




        return array;
    }
    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(integerArray));
             integers.set(indexToInsertAt,valueToBeInserted);
        Integer [] array = new Integer[integers.size()-1];
        array =integers.toArray(array);

        return array;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(integerArray));
        integers.get(indexToFetch);


        return integers.get(indexToFetch);
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        List<Integer> integers = new ArrayList<>();
        for( Integer num : integerArray){
            if (num%2==0){
          integers.add(num+1);
            } else
                integers.add(num-1);
        }Integer [] array = new Integer[integers.size()-1];
        array =integers.toArray(array);


        return array;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        List<Integer> integers = new ArrayList<>();
        for( Integer num : integerArray){
            if (num%2==0){
                integers.add(num+1);
            }else
                integers.add(num);}
        Integer [] array = new Integer[integers.size()-1];
        array =integers.toArray(array);
        return array;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        List<Integer> integers = new ArrayList<>();
        for( Integer num : input){
            if (num%2!=0){
                integers.add(num-1);
            }else
                integers.add(num);}
        Integer [] array = new Integer[integers.size()-1];
        array =integers.toArray(array);
        return array;
    }
}
