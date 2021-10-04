package com.train.driver;

import com.train.model.Passenger;
import com.train.model.Train;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketApplication {

    public static int n;


        public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

            Passenger passenger=new Passenger();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a train number");
            // Data number=sc.next;
            System.out.println("enter number of passengers");
            n = sc.nextInt();
            for (int i=0;i<n;i++) {
                System.out.println("enter passenger name");
                String name = sc.nextLine();
                System.out.println("enter passenger age");
                int age = sc.nextInt();
                System.out.println("enter passenger gender (M/F)");
                String gender = sc.next();
            }
            //methods access

            Class c = Class.forName("com.train.model.Ticket");
            Object o= c.newInstance();
            Method m =c.getDeclaredMethod("generatePNR");
            m.setAccessible(true);
            m.invoke(o, null);






            try {
               /* Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/traindb";
                String username = "root";
                String password = "anil9.58s";*/

                TrainDAO trainDAO=new TrainDAO();
                Connection connection = DriverManager.getConnection(trainDAO.DB_URL, trainDAO.PASSWORD,trainDAO.DRIVER_NAME);
                System.out.println("connect to db successfully");
                System.out.println();
                Statement statement = connection.createStatement();
                ArrayList<Train> trainData = getTrainData();
                for (Train trains : trainData
                ) {
                    String insertQuery = "insert into train values(" +trains.getTrain_No() + ",'" + trains.getTrainName() + "','" + trains.getSource() + "','" + trains.getDestination() + "'," + trains.getTicketPrice() + ")";
                    statement.execute(insertQuery);


                }
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        public static ArrayList<Train> getTrainData() {
            Train train1 = new Train(1001,"Shatabdi express","Bangalore","Delhi",2500d);
            Train train2 = new Train(1002,"Shatabdi express","Delhi","Bangalore",2500d);
            Train train3 = new Train(1003,"Udyan express","Bangalore","Mumbai",1500d);
            Train train4 = new Train(1004,"Udyan express","Mumbai","Bangalore",1500d);
            Train train5 = new Train(1005,"Brindavan express","Bangalore","chennai",1000d);
            Train train6 = new Train(1006,"Brindavan express","chennai","Bangalore",1000d);


            ArrayList<Train> trainData = new ArrayList<>();
            trainData.add(train1);
            trainData.add(train2);
            trainData.add(train3);
            trainData.add(train4);
            trainData.add(train5);
            trainData.add(train6);
            return trainData;


        }
    }


