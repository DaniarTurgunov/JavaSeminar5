package Seminar5.HW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Вопросы по теме урока Задать или практическому заданию можно задать наставнику заДать";
        String searchN = scanner.nextLine().toLowerCase();
        System.out.println(searchN);
        String[] textArr = text.toLowerCase().split(" ");
        Map<String,Integer> maplist = new HashMap<>();
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].equals(searchN)) {
                maplist.putIfAbsent(textArr[i], 0);
                maplist.put(textArr[i], maplist.get(textArr[i]) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : maplist.entrySet()){
            System.out.println("Cлово "+ "'" + entry.getKey() + "'"+ " встретилось " + entry.getValue() + " раз(а)");
        }
    }
}
