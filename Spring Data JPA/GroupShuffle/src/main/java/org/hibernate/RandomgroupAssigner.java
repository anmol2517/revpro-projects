package org.hibernate;

import java.util.*;

public class RandomgroupAssigner {

    public ArrayList<ArrayList<String>> createRandomGroups(
            ArrayList<String> students, int maxGroupSize, int numberOfGroups) {

        ArrayList<String> remainingStudents = new ArrayList<>(students);
        ArrayList<ArrayList<String>> groups = new ArrayList<>();

        Random random = new Random();
        int groupNumber = 1;

        while (!remainingStudents.isEmpty() && groupNumber <= numberOfGroups) {
            ArrayList<String> currentGroup = new ArrayList<>();

            int membersToAdd = Math.min(maxGroupSize, remainingStudents.size());

            for (int i = 0; i < membersToAdd; i++) {
                int randomIndex = random.nextInt(remainingStudents.size());
                currentGroup.add(remainingStudents.remove(randomIndex));
            }

            groups.add(currentGroup);
            groupNumber++;
        }

        return groups;
    }

    public void displayGroups(ArrayList<ArrayList<String>> groups) {
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("GROUP "
                    + (i + 1) + " (" + groups.get(i).size()
                    + " members) : ");
            System.out.println("------------");

            for (int j = 0; j < groups.get(i).size(); j++) {


                System.out.println((j + 1) + " . "

                        + groups.get(i).get(j));
            }



            System.out.println();


        }
        System.out.println("------------");
        System.out.println("Total Groups Created : " + groups.size());
    }
}