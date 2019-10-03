package studentTest.java;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import student.java.Student;

public class StudentTest {


    public static double[] pullInt(String grades) {
        String s[] = grades.split(" ");
        double out[] = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            out[i] = Double.parseDouble(s[i]);
        }

        return out;
    }


    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();
        
       
        Scanner sc = new Scanner(System.in);
    	String fileName = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader("Student.java"))) {
            String line;
            int id = 0;
            int count = 0;
            String firstName = "";
            String lastName = "";
            String grades = "";


            while ((line = br.readLine()) != null) {
                id = Integer.parseInt(line);
                firstName = br.readLine();
                lastName = br.readLine();
                grades = br.readLine();
                
               

              Student s = new Student(id,firstName,lastName);
              
               students.add(s);
               
               String [] parts = grades.split(" ");
               for (int i =0; i < parts.length; i++) {
               	s.addGrade(Double.parseDouble(parts [i]));
               }
               System.out.println(id + s.computeAverage());
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
