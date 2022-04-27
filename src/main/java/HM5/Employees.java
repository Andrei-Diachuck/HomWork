package HM5;

public class Employees {
    private String Name;
    private String SurName;
    private String Position;
    private String email;
    private int telephone;
    private int TheSalary;
    private int age;

    public Employees(String Name, String SurName, String Position, String email, int telephone, int TheSalary, int age) {
        this.Name = Name;
        this.SurName = SurName;
        this.Position = Position;
        this.email = email;
        this.telephone = telephone;
        this.TheSalary = TheSalary;
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public String toString() {
        return ("\nИмя - "
                + Name +
                "\nФамилия - "
                + SurName +
                "\nДолжность - "
                + Position +
                "\nemail - "
                + email +
                "\nТелефон - "
                + telephone +
                "\nЗарплата - "
                + TheSalary +
                "\nВозрост - "
                + age);
    }

}

