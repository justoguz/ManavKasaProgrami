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

		int armutKG, elmaKG, muzKG;
		double armutTL = 2.14, elmaTL = 3.00, muzTL = 4.00 , total;

		System.out.print("Kaç Kilo Armut ? ");
		armutKG = input.nextInt();

		System.out.print("Kaç Kilo Elma ? ");
		elmaKG = input.nextInt();

		System.out.print("Kaç Kilo Muz ? ");
		muzKG = input.nextInt();

		total = (armutKG * armutTL) + (elmaKG * elmaTL) + (muzKG * muzTL);
		System.out.println("Toplam Tutar : " + total + " TL");

		input.close();

	}

}
