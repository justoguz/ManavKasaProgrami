package com.example.ManavKasaProgrami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class ManavKasaProgramiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManavKasaProgramiApplication.class, args);
		Scanner input = new Scanner(System.in);

		int kg;
		double armutTL = 2.14, elmaTL = 3.00, muzTL = 4.00 , total;

		System.out.print("Kaç Kilo Armut ? ");
		kg = input.nextInt();

		System.out.print("Kaç Kilo Elma ? ");
		kg = input.nextInt();

		System.out.print("Kaç Kilo Muz ? ");
		kg = input.nextInt();

		total = (kg * armutTL) + (kg * elmaTL) + (kg * muzTL);
		System.out.println("Toplam Tutar : " + total + " TL");

	}

}
