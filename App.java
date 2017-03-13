public class App {
  public static void main(String[] args) {

    Vehicle hatchback = new Vehicle();
    hatchback.mYear = 1994;
    hatchback.mBrand = "Subaru";
    hatchback.mModel = "Legacy";
    hatchback.mMiles = 170000;
    hatchback.mPrice = 4000;

    Vehicle suv = new Vehicle();
    suv.mYear = 2002;
    suv.mBrand = "Ford";
    suv.mModel = "Explorer";
    suv.mMiles = 100000;
    suv.mPrice = 7000;

    Vehicle sedan = new Vehicle();
    sedan.mYear = 2015;
    sedan.mBrand = "Toyota";
    sedan.mModel = "Camry";
    sedan.mMiles = 50000;
    sedan.mPrice = 30000;

    Vehicle truck = new Vehicle();
    truck.mYear = 1999;
    truck.mBrand = "Ford";
    truck.mModel = "Ranger";
    truck.mMiles = 100000;
    truck.mPrice = 4000;

    Vehicle crossover = new Vehicle();
    crossover.mYear = 1998;
    crossover.mBrand = "Toyota";
    crossover.mModel = "Rav-4";
    crossover.mMiles = 200000;
    crossover.mPrice = 3500;

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};

   System.out.println("All Vehicles:");

   for ( Vehicle individualVehicle : allVehicles ) {
     System.out.println( "----------------------" );
     System.out.println( individualVehicle.mYear );
     System.out.println( individualVehicle.mBrand );
     System.out.println( individualVehicle.mModel );
     System.out.println( individualVehicle.mMiles );
     System.out.println( individualVehicle.mPrice );
   }

  }
}
