package com;
import  com.sun.javafx.UnmodifiableArrayList;
import com.sun.javafx.fxml.expression.KeyPath;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    public class Mainuser {
        public String FirstName;
        public String LastName;

        public Mainuser(String sai, String priya, String s, String s1, String hyd, String ap, String india) {
            return;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public static String getEmail() {
            return Email;
        }

        public static void setEmail(String email) {
            Email = email;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public String PhoneNumber;
        public static String Email;
        public String Address;
        public String State;
        public String Country;


        public static void main(String[] args) {
            List<Mainuser> list = Arrays.asList(new Mainuser("akhila", "veeramalla", "7993325395", "akhila1@gmail.com", "atp", "ts", "India"),
                    (new Mainuser("sai", "priya", "9248146448", "priya@gmail.com", "hyd", "ap", "India")),
                    (new Mainuser("spandana", "alampally", "9248046448", "spandana@gmail.com", "karnataka", "ap", "India")),
                    (new Mainuser("Ranbir", "kapoor", "630303794", "ranbir50578@gmail.com", "udipi", "ap", "India")),
                    (new Mainuser("Alia", "Bhatt", "970482893", "Alia56767@gmail.com", "hasan", "", "India")),
                    (new Mainuser("sai", "krishna", "9948604287", "sai505@gmail.com", "yelahanka", "Karnataka", "India")),
                    (new Mainuser("shiva", "tharun", "8074265211", "shiva@gmail.com", "magestic", "Andhra", "India")),
                    (new Mainuser("ayan", "mukheed", "9866148197", "ayan@gmail.com", "Sivajinagar", "telangana", "India")),
                    (new Mainuser("sruthi", "reddy", "8639327298", "sruthi@gmail.com", "chikpet", "kerala", "India")),
                    (new Mainuser("abi", "ram", "980083255", "hema@505", "atp", "Ap", "India")));

            //System.out.println("user details=" + list);

            //  String searcElement = null;
            //  System.out.println("Enter the email to search");
            //   Scanner sc = new Scanner(System.in);
            //  String searchElement = sc.nextLine();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter phonenumber");
            String phonenumber1 = sc1.nextLine();

            for (Mainuser i : list) {
                if (phonenumber1.equals(i.PhoneNumber)) {
                    System.out.println("user details=" + i.FirstName + i.LastName + i.Address + i.Country + i.State);
                }
            }
        }
    }

       /* if (searchElement == null) {
            System.out.println("You haven't entered an email");
            return;
             // KeyPath Email = null;
        for(int i = 0; i<Email.length(); i++) {
          //  System.out.println(Email.getBytes(StandardCharsets.UTF_8));
     //       if(searcElement==Email.toString()) {
                System.out.println("\n");
                System.out.println("email ID" + searcElement + "found");
                break;
                */