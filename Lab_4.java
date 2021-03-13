package com.example.helloworld;

import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args) {

            double max = 0;
            int imax = 0;
            int jmax = 0;

            Scanner input = new Scanner(System.in);
            System.out.println("enter quanity of points(n)");
            int size = input.nextInt();

            float arrayX[] = new float[size];
            float arrayY[] = new float[size];

            System.out.println("Insert coord X");
            System.out.println("Insert coord y");

            for (int i = 0; i < size; i++) {
                arrayX[i] = input.nextFloat();
                arrayY[i] = input.nextFloat();
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++){
                    if (i != j){
                        double c = Math.sqrt(Math.pow(arrayX[i] - arrayX[j],2)+Math.pow(arrayY[i] - arrayY[j],2));
                        if (c > max) {
                            max = c;
                            imax = i + 1;
                            jmax = j + 1;
                    }
                }
            }
        }
System.out.printf("Наибольшее расстояние между точками %d, %d",imax,jmax);
    }
}




