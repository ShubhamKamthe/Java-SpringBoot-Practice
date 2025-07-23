package com.java.basics.loops;

import java.util.Scanner;

public class RoleAccessSwitchLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userRole;

        while (true) {
            System.out.print("Enter your role (ADMIN / MODERATOR / USER or type 'exit' to quit): ");
            userRole = scanner.nextLine().trim().toUpperCase();

            if (userRole.equals("EXIT")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            switch (userRole) {
                case "ADMIN":
                    System.out.println("Access to Admin Dashboard, Reports, and Users");
                    break;
                case "MODERATOR":
                    System.out.println("Access to Content Moderation Tools");
                    break;
                case "USER":
                    System.out.println("Access to User Dashboard only");
                    break;
                default:
                    System.out.println("Access Denied: Invalid Role");
            }
            System.out.println(); // add a line break for better readability
        }

        scanner.close();
    }
}
