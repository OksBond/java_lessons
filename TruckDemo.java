/**
 * Created by Оксана on 28.11.2016.
 */

//Try This 7-1

    //Build a subclass of Vehicle for trucks.
    class Vehicle {
    private int passengers; //number of passengers.
    private int fuelcap;    //fuel capacity (вместимость топливных баков) in gallons
    private int mpg; //fuel consumption (расход, потребление) in miles per gallon

    //This is a constructor for Vehicle.
    Vehicle (int p, int f, int m){
        passengers=p;
        fuelcap=f;
        mpg=m;
    }

    //Return the range (дальность поездки).
    int range(){
        return mpg*fuelcap;
    }

    //Compute (вычислить) fuel needed for a given (заданного) distance.
    double fuelneeded (int miles){
        return (double)miles/mpg;
    }

    //Accesser methods for instance variables.
    int getPassengers(){return passengers;}
    void setPassengers(int p){passengers=p;}
    int getFuelcap(){return fuelcap;}
    void setFuelcap(int f){fuelcap=f;}
    int getMpg(){return mpg;}
    void setMpg(int m){mpg=m;}
    }

//Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargocap;   //cargo capacity (грузоподъемность) in pounds.

    //This is a constructor for Truck.
    Truck (int p, int f, int m, int c){
        //Initialize Vehicle members using Vehicle's constructor
                  super(p,f,m);

        cargocap=c;
    }

    //Accessor methods for cargocap.
    int getCargo(){return cargocap;}
    void setCargo (int c){cargocap=c;}
}

public class TruckDemo {
    public static void main(String[] args) {
        //construct some trucks - Создать ряд новых объектов типа Truck
        Truck semi=new Truck(2,200,7,44000);
        Truck pickup=new Truck(3,28,15,2000);
        double gallons;
        int dist=252;

        gallons=semi.fuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() +
        " pounds.");
        //Для преодоления " + dist + "миль грузовику
        //требуется " + gallons + " галлонов топлива.\n");
        System.out.println("To go " + dist + " miles semi needs " +
        gallons + " gallons of fuel.\n");

        gallons=pickup.fuelneeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                gallons + " gallons of fuel.");
    }
}
