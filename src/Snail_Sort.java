/*
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
        array = [[1,2,3], [4,5,6], [7,8,9]]
        snail(array) = [1,2,3,6,9,8,7,4,5]
        or better understanding, please follow the numbers of the next array consecutively:
        array = [[1,2,3], [8,9,4],[7,6,5]]
        snail(array) => [1,2,3,4,5,6,7,8,9]
*/

import java.util.ArrayList;

public class Snail_Sort {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3}, {8, 9, 4}, {7,6,5} };
        System.out.println(snail(arr));
    }
    public static ArrayList<Integer> snailByDiana(int[][] arr){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0, k = arr[i].length-1; j < arr.length; j++){
                if(i == 0){
                    result.add(arr[i][j]);
                }else {
                    if(i != arr.length - 1){
                        result.add(arr[i][k]);
                        break;
                    }
                    result.add(arr[i][k]);
                    k--;
                }
            }
        }

        for(int i = 0; i < arr[1].length - 1; i++){
            result.add(arr[1][i]);
        }
        return result;
    }

}
