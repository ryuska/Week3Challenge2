package company.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Resume {


    private String name;
    private String email;
    private String phone;
    List<Map<String, String>> educations = new ArrayList<Map<String, String>>();
    List<Map<String, String>> experiences = new ArrayList<Map<String, String>>();
    List<Map<String, String>> skills = new ArrayList<Map<String, String>>();

    public Resume() {
        System.out.println("NEW RESUME");
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setEmail(String em) {
        this.email = em;
    }

    public void setPhone(String ph) {

    }

    public void add_Education(String Degree, String Major, String Uni, String Grad) {

        HashMap<String, String> edu_hm = new HashMap<String, String>();
        edu_hm.put("Degree", Degree);
        edu_hm.put("Major", Major);
        edu_hm.put("University Name", Uni);
        edu_hm.put("Graduation Year", Grad);
        this.educations.add(edu_hm);
        System.out.println("Education added.");

    }

    public void add_Exp(String Company, String Title, String Start_DT, String END_Dt, String Description) {
        HashMap<String, String> exp_hm = new HashMap<String, String>();
        exp_hm.put("Company", Company);
        exp_hm.put("Title", Title);
        exp_hm.put("Start Date", Start_DT);
        exp_hm.put("End Date", END_Dt);
        exp_hm.put("Job Description", Description);
        this.experiences.add(exp_hm);
        System.out.println("Experience added");
    }

    public void add_Skill(String Skill, String Competency) {
        HashMap<String, String> s_hm = new HashMap<String, String>();
        s_hm.put("Skill", Skill);
        s_hm.put("Competency", Competency);
        this.skills.add(s_hm);
        System.out.println("Skills Added");
    }

    public void get_resume() {
        System.out.println("\n");
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);
        System.out.println("\n" + "Education:");
        for (Map hm : educations) {
            System.out.println(hm.get("Degree") + " in " + hm.get("Major"));
            System.out.println(hm.get("University Name") + "," + hm.get("Graduation Year"));
        }
        System.out.println("\n" + "Experience:");
        for (Map hm : experiences) {
            System.out.println(hm.get("Title"));
            System.out.println(hm.get("Company") + ", " + hm.get("Start Date") + "-" + hm.get("End Date"));
            System.out.println(hm.get("Job Description"));
        }

        System.out.println("\n" + "Skills:");
        for (Map hm : skills) {
            System.out.println(hm.get("Competency") + " in " + hm.get("Skill"));
        }
        System.out.println("\n");

    }

    public String getResume() {
        return "Resume " + getResume();

    }
}


