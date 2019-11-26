public class Employee{
    
    String name;
    int age;
    String dob;
    String city;
    double salary;
    
    Employee(){}
    
    Employee(String name,int age,String dob,String city,double Salary){
        
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.city=city;
        this.salary=salary;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public void setDob(String dob){
        this.dob=dob;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    public static void main(String args[]){
    
    Employee emp1 = new Employee();
    emp1.setName("abc");
    emp1.setAge(22);
    emp1.setDob("23-12-1996");
    emp1.setCity("Delhi");
    emp1.setSalary(20000);
    
    Employee emp2 = new Employee();
    emp2.setName("def");
    emp2.setAge(22);
    emp2.setDob("24-12-1996");
    emp2.setCity("Pune");
    emp2.setSalary(21000);
    
    Employee emp3 = new Employee();
    emp3.setName("pqr");
    emp3.setAge(22);
    emp3.setDob("25-12-1996");
    emp3.setCity("Chennai");
    emp3.setSalary(20500);
    
    Employee emp4 = new Employee();
    emp4.setName("xyz");
    emp4.setAge(22);
    emp4.setDob("11-12-1996");
    emp4.setCity("Bangalore");
    emp4.setSalary(35000);
    
    Employee emp5 = new Employee();
    emp5.setName("ghi");
    emp5.setAge(22);
    emp5.setDob("30-12-1996");
    emp5.setCity("Kolkata");
    emp5.setSalary(30000);
    
    Employee empl1 = new Employee("klm",23,"12-11-1996","Jammu",45000);
    
    Employee empl2 = new Employee("khg",24,"18-10-1995","Jaipur",25000);
    
    Employee empl3 = new Employee("jhg",26,"12-1-1994","Kochi",35000);
    
    Employee empl4 = new Employee("dfg",23,"10-8-1996","Kolkata",55000);
    
    Employee empl5 = new Employee("gbdf",23,"12-3-1996","Delhi",45000);
    }
    
    
    
    
    
    
    
}