package company.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resume> resumes = new ArrayList<>();
        int r;
        for (r = 0; r < 3; r++) {

            Resume new_res = new Resume();

            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            new_res.setName(name);

            System.out.println("Please enter your email:");
            String email = scanner.nextLine();
            new_res.setEmail(email);

            System.out.println("Please enter your phone number:");
            String phone = scanner.nextLine();
            new_res.setPhone(phone);


            System.out.println("Please enter the below details about your educational background: ");

            int n;
            n = 0;

            while (n == 0) {
                System.out.println("Degree:");
                String degree = scanner.nextLine();
                System.out.println("Major:");
                String major = scanner.nextLine();
                System.out.println("University:");
                String uni = scanner.nextLine();
                System.out.println("Graduation year:");
                String grad_yr = scanner.nextLine();
                new_res.add_Education(degree, major, uni, grad_yr);
//                System.out.println("\n");
                System.out.println("If you would like to add another education, enter 'Y'");
                String resp = scanner.nextLine();
                if (resp.equalsIgnoreCase("y")) {
                    System.out.println("Adding new education ... enter the details below:");
                    n = 0;
                } else {
                    n = 1;
                }
            }


            int x;
            x = 0;
            System.out.println("Please enter the below details about your experience:");
            while (x == 0) {
                System.out.println("Company:");
                String comp = scanner.nextLine();
                System.out.println("Job Title:");
                String title = scanner.nextLine();
                System.out.println("Start Date:");
                String strt = scanner.nextLine();
                System.out.println("End Date:");
                String end = scanner.nextLine();
                System.out.println("Job Description:");
                String job_desc = scanner.nextLine();
                new_res.add_Exp(comp, title, strt, end, job_desc);
                System.out.println("If you would like to add another experience, enter 'Y'");
                String resp = scanner.nextLine();
                if (resp.equalsIgnoreCase("y")) {
                    x = 0;
                    System.out.println("Adding new experience... please enter the below details:");
                } else {
                    x = 1;
                }
            }

            int z;
            z = 0;

            while (z == 0) {
                System.out.println("Please enter a skill: ");
                String skill = scanner.nextLine();
                System.out.println("Please enter your competency: ");
                String competency = scanner.nextLine();
                new_res.add_Skill(skill, competency);
                if (skill.equalsIgnoreCase("y")) {
                    z = 0;
                    System.out.println("Adding new skill... please enter the below details:");
                } else {
                    z = 1;
                }
            }

            System.out.println("Resume complete.\n");
            new_res.get_resume();
            resumes.add(new_res);
        }


        for (Resume s : resumes){
            System.out.println(s.getResume());
        }

    }
}

