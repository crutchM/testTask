package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String line = scanner1.nextLine();
        System.out.println(summator(firstNumber, Convert(line)));
    }

    private static  ArrayList<Integer> Convert(String line){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String[] newLIne = line.split(" ");
        for(String e : newLIne)
            numbers.add(Integer.parseInt(e));
        return numbers;
    }

    private static int summator(int count,  ArrayList<Integer> numbers){
        int result = 0;
        for(int i = 0; i < count - 1; i++){
            result += numbers.get(i) + numbers.get(i + 1);
        }
        return result;
    }
}
