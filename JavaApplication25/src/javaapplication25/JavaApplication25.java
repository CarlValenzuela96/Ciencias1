/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a Number");
        String n = read.next();

        //Calcula numero de permutaciones
        long nPer = 1;
        for (int i = 1; i <= n.length(); i++) {
            nPer *= i;

        }
        System.out.println("Number of Permutations:" + nPer);
        char nums[] = n.toCharArray();

        //realiza la permutacion del numero segun el numero de permutaciones
        for (int i = 0; i < nPer; i++) {

            /*
            valida si es multiplo de 11, no tiene 0 a la izquierda o si se repite 
            y lo agrega al ArrayList list
             */
            System.out.println(nums);
            if (Long.parseLong(String.valueOf(nums)) % 11 == 0) {
                if (nums[0] != '0') {
                    if (!list.contains(String.valueOf(nums))) {
                        list.add(String.valueOf(nums));
                    }
                }
            }

            char t = nums[i % (nums.length - 1)];
            nums[i % (nums.length - 1)] = nums[nums.length - 1];
            nums[nums.length - 1] = t;

        }
        //Muestra la lista con las soluciones finales
        System.out.println("______________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());

    }

}


