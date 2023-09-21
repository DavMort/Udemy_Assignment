package assignment;

public sealed class Department {
}

final class ComputerEngineeringDept extends Department {
    public void compEng() {
        System.out.println("Custom computer engineering");
    }
    public String toString() {
        return "Computer Engineering";
    }
}

final class SoftwareEngineeringDept extends Department {
    public void swEng() {
        System.out.println("Custom software engineering");
    }
    public String toString() {
        return "Software Engineering";
    }
}

final class SocialCareDept extends Department {
    public void SocialCare() {
        System.out.println("Custom social care");
    }
    public String toString() {
        return "Social Care";
    }
}
final class AccountingDept extends Department {
    public void accounting() {
        System.out.println("Custom accounting");
    }
    public String toString() {
        return "Accounting";
    }
}