package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//  Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//  что 1 человек может иметь несколько телефонов.


public class task1 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();

        addNumber("Иван Иванов", 123, bookPhone);
        addNumber("Иван Иванов", 1234, bookPhone);
        addNumber("Светлана Петрова", 546585, bookPhone);
        addNumber("Иван Ежов", 8956477, bookPhone);
        addNumber("Иван Иванов", 12356233, bookPhone);
        addNumber("Светлана Петрова", 787897, bookPhone);
     printBook(bookPhone);
   }

        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }

        }

        public static void printBook(Map<String, ArrayList<Integer>> map){
            for (var item : map.entrySet()) {
                String phones = "";
                for(int el: item.getValue()){
                    phones = phones + el + ", ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
            }
        }

    }




