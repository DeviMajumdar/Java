package VARIABLE;

public class employee {
    static String ename="raja";
    int empno=101;
    double esalary=1000;

    void empDetails()
    {
        String ejob="Analyst";
        System.out.println("employee Name is:"+ employee.ename);
        System.out.println("employee Number is:"+empno);
        System.out.println("employee salary is:"+esalary);
        System.out.println("employee job is:"+ejob);
        System.out.println("employee id is:"+empno);
    }
    public static void main(String[] args) {
        employee emp=new employee();
        emp.empDetails();
    }
    
}
