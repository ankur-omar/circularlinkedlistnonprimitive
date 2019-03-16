class Employee{
    private int salary;
    private String name;
    Employee()
    {
        salary =0;
        name = null;
    }
    public Employee(int salary,String name)
    {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
class Node{
    private Employee emp;
    private Node next;

    public Employee getEmp() {
        return emp;
    }

    public void setData(Employee e) {
        this.emp = e;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
class circularlist {
    Node start;

    public boolean isEmpty() {
        return (start == null);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("node is empty");
            return;
        } else {
            Node temp;
            temp = start;
            while (temp.getNext() != start) {
                System.out.println(temp.getEmp());
                temp = temp.getNext();

            }
            System.out.println(temp.getEmp());

        }


    }

    public void insertend(Employee data) {
        Node n = new Node();
        n.setData(data);
        if (isEmpty()) {
            n = start;
            n.setNext(start);

        } else {
            Node temp;
            temp = start;
            while (temp.getNext() != start) {
                temp = temp.getNext();
            }
            temp.setNext(n);
            n.setNext(start);

        }
    }

    public void insertfirst(Employee e) {
        Node n = new Node();
        n.setData(e);
        if (isEmpty()) {
            start = n;
            n.setNext(n);//or start in place of n
        } else {
            Node temp;
            temp = start;
            while (temp.getNext() != start) {
                temp = temp.getNext();

            }
            temp.setNext(n);
            n.setNext(start);
            start = n;
        }
    }

    public void deletefirst() {
        if (isEmpty()) {
            System.out.println("node is empty");
            return;
        } else {
            Node temp;
            temp = start;
            while (temp.getNext() != start) {
                temp = temp.getNext();
            }
            start = start.getNext();
            temp.setNext(start);
        }
    }

    public void deletelast() {
        if (isEmpty()) {
            System.out.println("node is empty");
            return;
        } else {
            Node temp;
            temp = start;
            Node previous = new Node();
            while (temp.getNext() != start) {
                previous = temp;
                temp = temp.getNext();

            }
            previous.setNext(start);

        }
    }

    public static void main(String[] args) {
        circularlist obj = new circularlist();
        Employee e1 = new Employee(1000, "ankur");
        Employee e2 = new Employee(2000, "vinayak");
        Employee e3 = new Employee(3000, "prashant");
        Employee e4 = new Employee(4000, "rajiv");
        obj.insertfirst(e1);
        obj.insertfirst(e2);
        obj.insertfirst(e3);
        obj.insertend(e4);
        obj.display();


    }
}


