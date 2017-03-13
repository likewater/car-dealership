import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
    Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
    Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
    Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
    Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};
    System.out.println("What is your maximum budget for a vehicle?");
    String stringUserMaxBudget = myConsole.readLine();
    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

   System.out.println("Alright, here's what we have in your price range:");

   for ( Vehicle individualVehicle : allVehicles ) {
     if (individualVehicle.worthBuying(userMaxBudget)){
     System.out.println( "----------------------" );
     System.out.println( individualVehicle.mYear );
     System.out.println( individualVehicle.mBrand );
     System.out.println( individualVehicle.mModel );
     System.out.println( individualVehicle.mMiles );
     System.out.println( individualVehicle.mPrice );
   }
   }

  }
}
