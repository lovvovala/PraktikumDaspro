package posttest2;

public class Accounting extends Employee implements Payable {

    
    public Accounting(String id, String name, String gender, int age) {
       
        super(id, name, gender, age, "Accounting");
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + " Can calculate salaries for Staff & Manager";
    }

    
    @Override
    public double calculateSalary(Employee e) {
        if (!this.getId().equals("A001")) {
            return 0.0;
        }
        if (e.getRole().equals("Staff")) {
            return 5000.0;
        } else if (e.getRole().equals("Manager")) {
            return 7000.0;
        }
        return 0.0;
    }

    
    @Override
    public double calculateSalary(Employee e, double bonusRate) {
        if (!this.getId().equals("A001")) {
            return 0.0;
        }
        double baseSalary = calculateSalary(e);
        return baseSalary + (baseSalary * bonusRate);
    }
}