//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package project.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class Ticket {
    private int count = 0;
    private String pnr;
    private double totalPrice;
    private String travelDate;
    private Train train;
    private TreeMap<Passenger, Double> passengers = new TreeMap();
    private Connection connection;
    private ArrayList<Passenger> passengerArrayList = new ArrayList();

    public Ticket(Train train, String date) {
        this.passengerArrayList = new ArrayList();
        this.passengers = new TreeMap();
        this.train = train;
        this.travelDate = date;
    }

    public String generatePNR() {
        String counterFileName = "count.txt";
        int count = 99;
        File counterFile = new File(counterFileName);
        this.connection = DBConnection.getConnection();
        Throwable var5;
        if (counterFile.isFile()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(counterFileName));
                var5 = null;

                try {
                    count = Integer.parseInt(reader.readLine());
                } catch (Throwable var36) {
                    var5 = var36;
                    throw var36;
                } finally {
                    if (reader != null) {
                        if (var5 != null) {
                            try {
                                reader.close();
                            } catch (Throwable var35) {
                                var5.addSuppressed(var35);
                            }
                        } else {
                            reader.close();
                        }
                    }

                }
            } catch (IOException var40) {
                var40.printStackTrace();
            }
        }

        try {
            FileWriter writer = new FileWriter(counterFileName);
            var5 = null;

            try {
                ++count;
                writer.write(String.valueOf(count));
            } catch (Throwable var34) {
                var5 = var34;
                throw var34;
            } finally {
                if (writer != null) {
                    if (var5 != null) {
                        try {
                            writer.close();
                        } catch (Throwable var33) {
                            var5.addSuppressed(var33);
                        }
                    } else {
                        writer.close();
                    }
                }

            }
        } catch (IOException var38) {
            var38.printStackTrace();
        }

        try {
            Statement statement = this.connection.createStatement();
            ResultSet rs = statement.executeQuery("select *from trains where TRAIN_NO = " + this.train.getTrainNo());
            if (rs.next()) {
                String[] split = this.travelDate.split("/");
                this.pnr = String.valueOf(rs.getString(3).charAt(0)).toUpperCase() + String.valueOf(rs.getString(4).charAt(0)).toUpperCase() + "_" + split[2] + split[1] + split[0] + "_" + count;
                return this.pnr;
            }
        } catch (SQLException var32) {
            var32.printStackTrace();
        }

        return null;
    }

    public void addPassenger(String name, int age, char gender) {
        Passenger pass1 = new Passenger(name, age, gender);
        this.passengerArrayList.add(pass1);
        Passenger pass2 = new Passenger(name, age, gender);
        double prize = this.calcPassengerFare(pass2);
        this.passengers.put(pass2, prize);
    }

    private double calcPassengerFare(Passenger p) {
        if (p.getAge() <= 12) {
            return this.train.getTicketPrice() * 0.5D;
        } else if (p.getAge() >= 60) {
            return this.train.getTicketPrice() * 0.6D;
        } else {
            return p.getGender() != 'F' && p.getGender() != 'f' ? this.train.getTicketPrice() : this.train.getTicketPrice() * 0.75D;
        }
    }

    private double calculateTotalTicketPrice() {
        double totalPrice = 0.0D;

        double p;
        for(Iterator var3 = this.passengers.values().iterator(); var3.hasNext(); totalPrice += p) {
            p = (Double)var3.next();
        }

        return totalPrice;
    }

    public double totalTicketPrice() {
        double totalTicketPrice = 0.0D;
        System.out.println(this.passengers);

        double p;
        for(Iterator var3 = this.passengers.values().iterator(); var3.hasNext(); totalTicketPrice += p) {
            p = (Double)var3.next();
        }

        return totalTicketPrice;
    }

    private StringBuilder generateTicket() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.generatePNR() + "," + this.train.getTrainNo() + "," + this.train.getTrainName() + "," + this.train.getSource() + "," + this.train.getDestination() + "," + this.travelDate + "," + this.calculateTotalTicketPrice());
        return stringBuilder;
    }

    public void writeTicket() {
        File file = new File(this.generatePNR() + ".txt");

        try {
            file.createNewFile();
        } catch (IOException var34) {
            var34.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            Throwable var3 = null;

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                Throwable var5 = null;

                try {
                    StringBuilder stringBuilder = this.generateTicket();
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.write("PNR: " + stringBuilder.toString().split(",")[0]);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Train no: " + stringBuilder.toString().split(",")[1]);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Train name: " + stringBuilder.toString().split(",")[2]);
                    bufferedWriter.newLine();
                    bufferedWriter.write("From: " + stringBuilder.toString().split(",")[3]);
                    bufferedWriter.newLine();
                    bufferedWriter.write("To: " + stringBuilder.toString().split(",")[4]);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Travel Date: " + stringBuilder.toString().split(",")[5]);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Passengers: ");
                    bufferedWriter.newLine();
                    bufferedWriter.write("Name          Age         Gender          Fare");
                    bufferedWriter.newLine();
                    Iterator var7 = this.passengers.keySet().iterator();

                    while(var7.hasNext()) {
                        Passenger passenger = (Passenger)var7.next();
                        bufferedWriter.write(passenger.getName() + "      ");
                        bufferedWriter.write(passenger.getAge() + "       ");
                        bufferedWriter.write(passenger.getGender() + "        ");
                        bufferedWriter.write(this.passengers.get(passenger) + "        ");
                        bufferedWriter.newLine();
                    }

                    bufferedWriter.write("Total Price:  " + this.calculateTotalTicketPrice());
                } catch (Throwable var35) {
                    var5 = var35;
                    throw var35;
                } finally {
                    if (bufferedWriter != null) {
                        if (var5 != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable var33) {
                                var5.addSuppressed(var33);
                            }
                        } else {
                            bufferedWriter.close();
                        }
                    }

                }
            } catch (Throwable var37) {
                var3 = var37;
                throw var37;
            } finally {
                if (fileWriter != null) {
                    if (var3 != null) {
                        try {
                            fileWriter.close();
                        } catch (Throwable var32) {
                            var3.addSuppressed(var32);
                        }
                    } else {
                        fileWriter.close();
                    }
                }

            }
        } catch (IOException var39) {
            var39.printStackTrace();
        }

    }
}
