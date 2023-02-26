package Seminar5.HW1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String,Integer> maplist = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] strArr = str.replace("— ","").replace(".","").toLowerCase().split(" ");
        for (int i = 0; i < strArr.length; i++) {
            maplist.putIfAbsent(strArr[i],0);
            maplist.put(strArr[i], maplist.get(strArr[i])+1);
        }
        for (Map.Entry<String, Integer> entry : maplist.entrySet()){
            System.out.println("Cлово "+ "'" + entry.getKey() + "'"+ " встретилось " + entry.getValue() + " раз(а)");
        }
    }
}
