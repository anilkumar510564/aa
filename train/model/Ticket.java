package com.train.model;

import com.train.driver.TicketApplication;
import com.train.driver.TrainDAO;

import java.util.Date;
import java.util.TreeMap;

public class Ticket {
    private Integer counter;
    private  String pnr;
    private Date travelDate;
    Passenger passenger;
    private Train train;

    public Ticket() {
    }
    Ticket ticket=new Ticket();
    Train trainsObj=new Train();
    TrainDAO trainDAO=new TrainDAO();

    public Ticket(Integer counter, String pnr, Date travelDate, Passenger passenger) {
        this.counter = counter;
        this.pnr = pnr;
        this.travelDate = travelDate;
        this.passenger = passenger;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "train=" + train +
                '}';
    }

    public Ticket(Train train) {
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    private String generatePNR() {

    }
    private double calcPassengerFare(Passenger passenger)
    {
        if (passenger.getAge()<=12)
        {
            System.out.println((50/100)*train.getTicketPrice());
        }
        else if (passenger.getAge()>=60)
        {
            System.out.println((60/100)*train.getTicketPrice());
        }
        else if (passenger.getAge().equals("Female"))

        {
            System.out.println(train.ticketPrice-(25/100)*train.getTicketPrice());
        }
        else
        {
            System.out.println(train.ticketPrice);
        }
        return 0;
    }
    public  void addPassenger(Passenger passenger)
    {
        Passenger passenger1=new Passenger();
       TreeMap<Passenger,Integer> integerTreeMap=new TreeMap<>();
       integerTreeMap.put(passenger1, (int) calcPassengerFare(passenger));

        for (Passenger passenger2:integerTreeMap.keySet()
        ) {
            System.out.println(integerTreeMap.get(passenger2));

        }



    }




    private double calculateTotalTicketPrice()
    {
        TicketApplication ticketApplication=new TicketApplication();
       Double t=trainsObj.ticketPrice*TicketApplication.n;
        System.out.println(t);
        return 0;


    }
  //  private StringBuilder generateTicket()
    {
       // return true;
    }//
    public void writeticket()
    {

    }
   /* public int Ticket(Date travelDate,Train Train)
    {
        return 1;
    }*/



}
