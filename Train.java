
package com.train.model;

public class Train {
    private Integer train_No;
    private String trainName;
    String source;
    String destination;
    Double ticketPrice;

    public Train() {
    }

    public Train(Integer train_No, String trainName, String source, String destination, Double ticketPrice) {
        this.train_No = train_No;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    public Integer getTrain_No() {
        return train_No;
    }

    public void setTrain_No(Integer train_No) {
        this.train_No = train_No;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Train{" +
                "train_No=" + train_No +
                ", trainName='" + trainName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
