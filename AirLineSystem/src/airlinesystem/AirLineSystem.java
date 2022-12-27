/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airlinesystem;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mostafa
 */
public class AirLineSystem {

    public static void main(String[] args) {
        int tripNumber,n,count = 0;
        String name , password, adminPass = "182001";
        Scanner in = new Scanner(System.in);

        Reservations obj1 = new Reservations();
        Reservations obj2 = new Reservations();
        Reservations obj3 = new Reservations();
        Reservations obj4 = new Reservations();
        
        obj1.trip(obj1.address[0],obj1.address[1],obj1.airporName[1], obj1.airporName[0], 1,200,LocalDate.of(2023, 01, 01));

        obj2.trip(obj2.address[1],obj2.address[2],obj2.airporName[2], obj2.airporName[1], 2,210,LocalDate.of(2023, 01, 15));
        
        obj3.trip(obj3.address[2],obj3.address[3],obj3.airporName[3], obj3.airporName[2], 3,100,LocalDate.of(2023, 02, 01));
        
        obj4.trip(obj4.address[4],obj4.address[0],obj4.airporName[0], obj4.airporName[4], 4,50,LocalDate.of(2023, 02, 15));

        do{
           System.out.println("(1) Show the trips list\n(2)Make a reservation\n(3)Passenger Name\n(4)Exit");
           System.out.println("Choose Number");
           n = in.nextInt();
            switch(n)
            {
                case 1 : System.out.printf("Trib[%d]\nTo : %s\nFrom : %s\nArrival : %s\nDeparture: %s\nNumber of passengers: %d\nDate: %s\n",
                    obj1.tripNumber,obj1.To,obj1.From,obj1.arrival,obj1.departure,obj1.number,obj1.madeDate);
                     System.out.printf("Trib[%d]\nTo : %s\nFrom : %s\nArrival : %s\nDeparture: %s\nNumber of passengers: %d\nDate: %s\n",
                    obj2.tripNumber,obj2.To,obj2.From,obj2.arrival,obj2.departure,obj2.number,obj2.madeDate);
                    System.out.printf("Trib[%d]\nTo : %s\nFrom : %s\nArrival : %s\nDeparture: %s\nNumber of passengers: %d\nDate: %s\n",
                    obj3.tripNumber,obj3.To,obj3.From,obj3.arrival,obj3.departure,obj3.number,obj3.madeDate);
                      System.out.printf("Trib[%d]\nTo : %s\nFrom : %s\nArrival : %s\nDeparture: %s\nNumber of passengers: %d\nDate: %s\n",
                    obj4.tripNumber,obj4.To,obj4.From,obj4.arrival,obj4.departure,obj4.number,obj4.madeDate);
                     break;
                case 2 :  System.out.println("Your name please");
                
                      name = in.next();
                      System.out.println("Enter trip number");
                      tripNumber = in.nextInt();

                    switch(tripNumber)
                    {
                        case 1:obj1.personName[++obj1.number] = name;

                                break;
                        case 2:obj2.personName[++obj2.number] = name;
                               
                                
                                break;
                        case 3:obj3.personName[++obj3.number] = name;
                                
                                
                                break;
                        case 4:obj4.personName[++obj4.number] = name;
                                
                                
                                break;
                    }  
                     break;
                case 3:System.out.println("Password please"); 
                        password = in.next();
                        if(password.equals(adminPass))
                        {
                            System.out.println("Enter trip number");
                            tripNumber = in.nextInt();
                            System.out.println("Enter tpassenger number");
                            count = in.nextInt();
                            switch(tripNumber)
                            {
                                case 1:obj1.printPassengers(obj1.personName, count);
                                       
                                        break;
                                case 2:obj2.printPassengers(obj2.personName, count);
                                        
                                        break;
                                case 3:obj3.printPassengers(obj3.personName, count);
                                        
                                        break;
                                case 4:obj4.printPassengers(obj4.personName, count);
                                        
                                        break;                                
                    }
                           
                        }
                        break;
            }
        }while(n !=4);
    }
  
}

class Airport extends Passenger {
    protected String airporName[] = {"International Cairo","Burg El Arab ","Sphinx","Luxor Airport","Aswan Airport"};

    public String[] getAirporName() {
        return airporName;
    }

    public void setAirporName(String[] airporName) {
        this.airporName = airporName;
    }    
}

class FlightDescription extends Airport {
    
    protected String To;
    protected String From;
    protected int Capacity = 256;
    protected String arrival;
    protected String departure;

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }
    
    
}

class ScheduledFlight extends FlightDescription {
    Date Date = new Date();
    int tripNumber;

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(int tripNumber) {
        this.tripNumber = tripNumber;
    }  
}

class Person extends Address {
    String personName[] = new String[500];

    public String[] getPersonName() {
        return personName;
    }

    public void setPersonName(String[] personName) {
        this.personName = personName;
    }  
}

class Passenger extends Person {
    int number;
    public void printPassengers(String names[],int num)
    {
        System.out.println(names[num]);
    }

    public int getNumber() {
        return number ;
    }

    public void setNumber(int number) {
        this.number = number;
    }  
}

class Reservations extends ScheduledFlight {
    LocalDate madeDate ;

    public LocalDate getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(LocalDate madeDate) {
        this.madeDate = madeDate;
    }
    

    public void trip(String to ,String from , String startAirport ,String endAirport, int num,int numOfPassengers ,LocalDate Date )
    {
        this.To = to;
        this.From = from;
        this.arrival = endAirport;
        this.departure = startAirport;
        this.tripNumber = num;
        this.number = numOfPassengers; 
        this.madeDate = Date;
        
    }   
}

class Address {
    protected String address[] = {"Cairo","Alexanderia","Giza","Luxor","Aswan"};

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    } 
}
