package application;


import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os valores do triangulo x:");
        x.n1 = sc.nextDouble();
        x.n2 = sc.nextDouble();
        x.n3 = sc.nextDouble();

        System.out.println("Digite os valores do triangulo y");
        y.n1 = sc.nextDouble();
        y.n2 = sc.nextDouble();
        y.n3 = sc.nextDouble();

        double p = (x.n1 + x.n2 + x.n3) / 2.0;
        double areaX = Math.sqrt(p * (p - x.n1) * (p - x.n2) * (p - x.n3));

        p = (y.n1 + y.n2 + y.n3) / 2.0;
        double areaY = Math.sqrt(p * (p - y.n1) * (p - y.n2) * (p - y.n3));

        System.out.printf("area do triangulo x: %4f%n", areaX);
        System.out.printf("area do triangulo y: %4f%n", areaY);

        if (areaX > areaY){
            System.out.printf("maior é o X");
        }else{
            System.out.printf("Maior é o Y");
        }
        sc.close();
    }
}
