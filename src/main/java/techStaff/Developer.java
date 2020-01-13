package techStaff;

import staff.Employee;

public class Developer extends Employee {
    public Developer(String name, String ni, double salary){
        super(name, ni, salary); //referencing super's constructor.
    }
}
