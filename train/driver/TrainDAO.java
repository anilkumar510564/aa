package com.train.driver;
/*package com.train.driver;


import com.train.model.Train;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.train.model.Passenger;
import com.train.model.Ticket;

import javax.xml.crypto.Data;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TrainDAO {
    public static int n;
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Passenger passenger=new Passenger();
    Scanner sc=new Scanner(System.in);
        System.out.println("enter a train number");
   // Data number=sc.next;
        System.out.println("enter number of passengers");
         n=sc.nextInt();
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





    }
}
*/

import com.train.model.Train;

import java.util.Scanner;


public class TrainDAO {


    public static final String DB_URL =" jdbc:mysql://localhost:3306/traindb";
    public static final  String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
  //  private static final String DB_URL="jdbc:mysql://localhost:3306/traindb";
    //public static final String USERNAME="root";
    public static final String PASSWORD="anil9.58s";
    private  static  Train train;
    public int n;
    Train trains=new Train();

    public void findTrain(Train train)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a train number");
        int tainNo=scanner.nextInt();
        if


    }


}
