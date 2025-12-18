public class Employee {
    private String name;
    private String department;
    private String mail;

    Employee(String name, String department, String mail) {
        this.name = name;
        this.department = department;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString() {
        return "Name: " + name + " Department: " + department + " Mail: " + mail;
    }
}
