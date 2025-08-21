import java.util.*;
class Main_std {
    class Node {
        String name;
        String dept;
        long phoneno; 
        Node next;

        public Node(String name, String dept, long phoneno) {
            this.name = name;
            this.dept = dept;
            this.phoneno = phoneno;
            this.next = null;
        }
    }

    Node start = null, end = null;

    void insert(String name, String dept, long phoneno) {
        Node newnode = new Node(name, dept, phoneno);
        if (start == null) {
            start = newnode;
            end = newnode;
        } else {
            end.next = newnode;
            end = newnode;
        }
    }

    void display() {
        Node i = start; 
        while (i != null) {
            System.out.println("Name: " + i.name);
            System.out.println("Department: " + i.dept);
            System.out.println("Phone No: " + i.phoneno);
            System.out.println("----------------------");
            i = i.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main_std obj = new Main_std(); 
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Phone No: ");
            long phoneno = sc.nextLong();
            sc.nextLine(); 
            obj.insert(name, dept, phoneno);
        }

        System.out.println("\nStudent Details");
        obj.display();
    }
}
