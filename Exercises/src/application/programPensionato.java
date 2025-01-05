package application;

import java.math.BigInteger;
import java.util.Scanner;

import entities.Room;

public class programPensionato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Room[] rooms = new Room[10];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nRent #%d:\n", i+1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Room(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("\n%d: %s, %s", i, rooms[i].getName(), rooms[i].getEmail());
			}
		}
		
		
			
		sc.close();
	}
}
