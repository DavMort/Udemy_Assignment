package assignment;

public sealed class Faculty implements Educational {
}

final class EngineeringFaculty extends Faculty {
    public void engineering() {
        System.out.println("We teach computer science, civil engineering etc...");
    }
    public String toString() {
        return "Engineering";
    }
}

final class HumanitiesFaculty extends Faculty {
    public void humanities() {
        System.out.println("We teach social care, European studies etc...");
    }
    public String toString() {
        return "Humanities";
    }
}

final class BusinessFaculty extends Faculty {
    public void business() {
        System.out.println("We teach accountancy, law, economics etc...");
    }
    public String toString() {
        return "Business";
    }
}