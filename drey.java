package performance;

import java.util.Scanner;

public class drey {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the number of students: ");
 int numStudents = scanner.nextInt();
 scanner.nextLine();

 char result = 'P';
 int serialNumber = 101;

 String[] names = new String[numStudents];
 int[] marks1 = new int[numStudents];
 int[] marks2 = new int[numStudents];
 int[] marks3 = new int[numStudents];
 int[] totals = new int[numStudents];
 float[] averages = new float[numStudents];
 String[] grades = new String[numStudents];

 for (int i = 0; i < numStudents; i++) {
     System.out.print("Enter name: ");
     names[i] = scanner.nextLine();

     System.out.print("Enter mark 1: ");
     marks1[i] = scanner.nextInt();

     System.out.print("Enter mark 2: ");
     marks2[i] = scanner.nextInt();

     System.out.print("Enter mark 3: ");
     marks3[i] = scanner.nextInt();

     scanner.nextLine();

     totals[i] = marks1[i] + marks2[i] + marks3[i];
     averages[i] = totals[i] / 3;
     grades[i] = calculateGrade(averages[i]);
 }
 scanner.close();

 System.out.println("*****************");
 System.out.println("\t\t\tSTUDENT MARKLIST");
 System.out.println("*****************");
 System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAVERAGE\tGRADE");
 for (int i = 0; i < numStudents; i++) {

     System.out.println(+serialNumber + "\t" + names[i] + "\t" + marks1[i] + "\t" + marks2[i] + "\t" + marks3[i]
      + "\t" + totals[i] + "\t" + result + "\t" + String.format("%.1f", averages[i]) + "\t" + grades[i]);

     serialNumber++;
 }
    }

    public static String calculateGrade(double average) {
 if (average >= 80) {
     return "A";
 } else if (average >= 75) {
     return "B+";
 } else if (average >= 65) {
     return "B";
 } else if (average >= 55) {
     return "C+";
 } else if (average >= 50) {
     return "C";
 } else if (average >= 40) {
     return "D";
 } else {
     return "F";
 }
    }
}

