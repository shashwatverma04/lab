import java.util.Scanner;

public class Car {
  String make;
  String model;
  short year;
  int price;

  public Car(String make, String model, short year, int price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
  }

  public void displayCarDetails() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Price: $" + price);
    System.out.println("--------------------");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car[] cars = new Car[5]; // Let's allow up to 5 cars for this example
    int carCount = 0;

    while (true) {
      System.out.println("Enter 'add' to add a car, 'display' to show all cars, or 'exit' to quit:");
      String action = scanner.nextLine().toLowerCase();

      if (action.equals("add")) {
        if (carCount < cars.length) {
          System.out.print("Enter the make of the car: ");
          String make = scanner.nextLine();

          System.out.print("Enter the model of the car: ");
          String model = scanner.nextLine();

          System.out.print("Enter the year of the car: ");
          short year = scanner.nextShort();
          scanner.nextLine(); // Consume the newline character

          System.out.print("Enter the price of the car: $");
          int price = scanner.nextInt();
          scanner.nextLine();

          cars[carCount++] = new Car(make, model, year, price);
          System.out.println("Car added successfully!");
        } else {
          System.out.println("You have reached the maximum number of cars.");
        }
      } else if (action.equals("display")) {
        if (carCount > 0) {
          System.out.println("\n--- Car Details ---");
          for (int i = 0; i < carCount; i++) {
            cars[i].displayCarDetails();
          }
        } else {
          System.out.println("No cars have been added yet.");
        }
      } else if (action.equals("exit")) {
        System.out.println("Exiting the program. Goodbye!");
        break;
      } else {
        System.out.println("Invalid action. Please enter 'add', 'display', or 'exit'.");
      }
      System.out.println();
    }
    scanner.close();
  }
}