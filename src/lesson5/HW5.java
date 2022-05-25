package lesson5;

public class HW5 {
        public static void main(String[] args) {
            Employee[] empCorp = new Employee[5];
            empCorp[0] = new Employee("Kuzin Vyacheslav", "Team Lead", "kuzin@gmail.com", "87710662277",250000,33);
            empCorp[1] = new Employee("Chichkan Igor", "QA Engineer", "chichkan@gmail.com", "87012336655",100000,36);
            empCorp[2] = new Employee("Ivanov Gleb", "Developer", "ivanov@gmail.com", "87020558877",200000,43);
            empCorp[3] = new Employee("Vasiliev Dmitry", "System Administrator", "vasiliev@gmail.com", "87770778899",80000,41);
            empCorp[4] = new Employee("Novikov Vladimir", "Systems Analyst", "novikov@gmail.com", "87076543322",120000,45);
            for (Employee employee : empCorp)
                if (employee.getAge()>40)
                    System.out.println(employee);

        }
    }
    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }
    }


