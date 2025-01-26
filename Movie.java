package com.project;

import java.util.Scanner;

class Movie {
    String name;
    double ticketPrice;

    // Constructor
    public Movie(String name, double ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    }

    // Display movie details
    public void displayMovie() {
        System.out.println(name + " - Ticket Price: Rs" + ticketPrice);
    }
//}

//public class MovieTicketBookingSystem {
    // List of available movies
    static Movie[] movies = {
        new Movie("OG", 200.00),
        new Movie("salaar", 100.00),
        new Movie("Game Changer", 110.00),
        new Movie("sankarnti ki vastunamu", 90.00)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. View Available Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View available movies
                    displayMovies();
                    break;
                case 2:
                    // Book a ticket
                    bookTicket(scanner);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Thank you for using Movie Ticket Booking System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to display available movies
    public static void displayMovies() {
        System.out.println("\n--- Available Movies ---");
        for (int i = 0; i < movies.length; i++) {
            System.out.print((i + 1) + ". ");
            movies[i].displayMovie();
        }
    }

    // Method to book a ticket
    public static void bookTicket(Scanner scanner) {
        displayMovies();
        System.out.print("\nEnter the movie number you want to book: ");
        int movieChoice = scanner.nextInt();

        if (movieChoice < 1 || movieChoice > movies.length) {
            System.out.println("Invalid movie choice!");
            return;
        }

        Movie selectedMovie = movies[movieChoice - 1];
        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();

        double totalCost = selectedMovie.ticketPrice * numTickets;
        System.out.println("--- Booking is  SuccessFull ---");
        System.out.println("Movie: " + selectedMovie.name);
        System.out.println("Tickets: " + numTickets);
        System.out.println("Total Cost: Rupees" + totalCost);
    }
}

