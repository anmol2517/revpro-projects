package org.hibernate;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Abhishek Sarjerao Jarhad", "ABHISHEK SATISH LAWHALE", "ADITYA ANIL BODAKE", "Aditya Sachin More", "Aishwarya Kalahal", "Akshata Hemraj Band",
                "Anmol Kumar", "Arya Dolas", "Ashwini Ramdas Lade", "Ayush Ambana Kore", "Boga Pavan Sai", "Dharamveer Singh",
                "Gaurav Ramesh Ahirrao", "Hariom Nagar", "Harshita Yadav", "Khote Tejaswi Ankush", "Konda Mahesh", "Manaaf Mohd",
                "Pranjal Sanjay Palpattuwar", "PRANJAL SINGH", "PRATEEK AGRAWAL", "Pratik Kumar", "Prerana Gopal Misal", "Priyanshu Gautam Wahane",
                "Ranjeet Bhivaji Dethe", "Rehan Nurmahamad Pathan", "Sakshi Ravindra Bejgamwar", "Sanjay Dharmendra Prasad", "Shrutika Dnyandeo Patil",
                "Shubhada Hanamant Shingate", "Siddhi Sujit Bhadange", "SNEHA SHIVHARE", "Sonawane Raj Sunil", "Soumya",
                "Suyog Rajiv Kalmegh", "Tejas Sambhaji Mohite", "Tejas Sewanand Borkar", "Tejas Vidyasagar Hinde", "Vaibhav Dnyanoba Pawar",
                "Vaibhav Vishnu Roman", "Vaishnavi Kalidas Randive", "Vaishnavi Rajabhau Ninghot", "Vishal Shivram Bhure", "Vivek girhare", "Yash Savle"
        ));

        System.out.println("Total Students : " + students.size());
        System.out.println("\n RANDOM GROUP ASSIGNMENT \n");

        int maxGroupSize = 6;
        int numberOfGroups = 7;

        RandomgroupAssigner assigner = new RandomgroupAssigner();
        ArrayList<ArrayList<String>> allGroups = assigner.createRandomGroups(students, maxGroupSize, numberOfGroups);
        assigner.displayGroups(allGroups);


    }
}

