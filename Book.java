package com.project;



	import java.util.ArrayList;
	import java.util.Scanner;

	// Book class to represent a single book
	class Book {
	    private String title;
	    private String author;

	    // Constructor
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Getters
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    // Display book details
	    @Override
	    public String toString() {
	        return "Title: " + title + ", Author: " + author;
	    }
	

	// Main class for Library Management System
	//public class LibraryManagementSystem {
	    public static void main(String[] args) {
	        ArrayList<Book> library = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            // Display menu
	            System.out.println("\n=== Library Menu ===");
	            System.out.println("1. Add Book");
	            System.out.println("2. View All Books");
	            System.out.println("3. Search Book by Title");
	            System.out.println("4. Remove Book");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1: // Add Book
	                    System.out.print("Enter book title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter book author: ");
	                    String author = scanner.nextLine();
	                    library.add(new Book(title, author));
	                    System.out.println("Book added successfully!");
	                    break;

	                case 2: // View All Books
	                    if (library.isEmpty()) {
	                        System.out.println("No books in the library.");
	                    } else {
	                        System.out.println("\nBooks in the Library:");
	                        for (Book book : library) {
	                            System.out.println(book);
	                        }
	                    }
	                    break;

	                case 3: // Search Book by Title
	                    System.out.print("Enter the title to search: ");
	                    String searchTitle = scanner.nextLine();
	                    boolean found = false;
	                    for (Book book : library) {
	                        if (book.getTitle().equalsIgnoreCase(searchTitle)) {
	                            System.out.println("Book Found: " + book);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("Book not found.");
	                    }
	                    break;

	                case 4: // Remove Book
	                    System.out.print("Enter the title to remove: ");
	                    String removeTitle = scanner.nextLine();
	                    found = false;
	                    for (Book book : library) {
	                        if (book.getTitle().equalsIgnoreCase(removeTitle)) {
	                            library.remove(book);
	                            System.out.println("Book removed successfully!");
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("Book not found.");
	                    }
	                    break;

	                case 5: // Exit
	                    System.out.println("Thank you for using the Library Management System!");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }
	

}
