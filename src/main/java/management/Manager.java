package management;

import staff.Employee;

public class Manager extends Employee {

    protected String deptName;

    public Manager(String name, String ni, int salary, String deptName){
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }
}
