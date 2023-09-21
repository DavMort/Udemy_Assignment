package assignment;

public class Main {
    public static void main(String[] args) {
        Department SoftwareEngineeringDept = new SoftwareEngineeringDept();
        Department AccountingDept = new AccountingDept();
        Department SocialCareDept = new SocialCareDept();
        Faculty HumanitiesFaculty = new HumanitiesFaculty();
        Faculty EngineeringFaculty = new EngineeringFaculty();
        Faculty BusinessFaculty = new BusinessFaculty();

        LecturerRecord lr = new LecturerRecord("Jane Bloggs", 24, EngineeringFaculty, SoftwareEngineeringDept);
        LecturerRecord anne = new LecturerRecord("Dr. Anne Bloggs", 35, BusinessFaculty, AccountingDept);
        LecturerRecord joe = new LecturerRecord("Joe Bloggs PhD", 54, HumanitiesFaculty, SocialCareDept);

        System.out.println(lr);

        System.out.println("Name is " + lr.name());
        System.out.println("Age is " + lr.age());
        System.out.println("Faculty is " + lr.faculty());
        System.out.println("Department is " + lr.dept());

        lr.whichFaculty();
        lr.whichDept();
        System.out.println(lr.hasPhd());

        System.out.println();
        System.out.println(anne);
        System.out.println(anne.hasPhd() ? "Anne has a PhD" : "Anne has not a PhD");

        System.out.println();
        System.out.println(joe);
        System.out.println(joe.hasPhd() ? "Joe has a PhD" : "Joe has not a PhD");
    }
}
