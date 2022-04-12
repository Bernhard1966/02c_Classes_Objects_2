package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    private boolean isFemale;

    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "ERROR: ";
        }
    }

    public String getAge() {
        return checkCompliance();
    }

    private String checkCompliance() {
        if (isFemale) {
            // nicht OK!
            return checkEscalationLevel();
         } else {
            // OK! 
            return Integer.toString(age);
         }
    }

    private String checkEscalationLevel() {
        return "This is an inappropriate question!"; 
    }


}
