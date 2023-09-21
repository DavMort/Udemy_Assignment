package assignment;

public record LecturerRecord(String name, Integer age, Faculty faculty, Department dept) {
    public LecturerRecord {
        String errorMsg = """
                Illegal argument passed:
                    "name": %s,
                    "age": %s
                """.formatted(name, age);
        if (name.isBlank() || age < 0) {
            throw new IllegalArgumentException(errorMsg);
        }
    }


    public boolean hasPhd() {
        String phd = name().startsWith("Dr.") ? "Dr." : name().endsWith("PhD") ? "PhD" : "null";
        switch (phd) {
            case "Dr.", "PhD" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
    public void whichFaculty() {
        String errorMsg = """
                    Illegal argument passed:
                    Faculty: %s
                    """.formatted(faculty.toString());

        switch (this.faculty.toString()) {
            case "Engineering" -> {
                EngineeringFaculty s = new EngineeringFaculty();
                System.out.println("Faculty of: " + s);
                s.engineering();
            }
            case "Humanities" -> {
                HumanitiesFaculty s = new HumanitiesFaculty();
                System.out.println("Faculty of: " + s);
                s.humanities();
            }
            case "Business" -> {
                BusinessFaculty s = new BusinessFaculty();
                System.out.println("Faculty of: " + s);
                s.business();
            }
            default -> throw new IllegalArgumentException(errorMsg);
        }
    }
    public void whichDept() {
        String errorMsg = """
                Illegal argument passed:
                Department: %s
                """.formatted(dept.toString());

        switch (dept.toString()) {
            case "Computer Engineering" -> {
                ComputerEngineeringDept cd = new ComputerEngineeringDept();
                System.out.println("Dept of: " + dept);
                cd.compEng();
            }
            case "Software Engineering" -> {
                SoftwareEngineeringDept se = new SoftwareEngineeringDept();
                System.out.println("Dept of: " + dept);
                se.swEng();
            }
            case "Social Care" -> {
                SocialCareDept scd = new SocialCareDept();
                System.out.println("Dept of: " + dept);
                scd.SocialCare();
            }
            case "Accounting" -> {
                AccountingDept ad = new AccountingDept();
                System.out.println("Dept of: " + dept);
                ad.accounting();
            }
            default -> throw new IllegalArgumentException(errorMsg);
        }
    }
}


