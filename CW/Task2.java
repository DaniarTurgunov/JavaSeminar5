package Seminar5.CW;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(isDooble(arr));
    }
    public static boolean isDooble (int[] array){
        Map<Integer, Integer> maplist = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (maplist.containsKey(array[i])) return false;
            else maplist.put(array[i], 1);
            }
        return true;
    }
}
