import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList groomingServices = new ArrayList();
    static LinkedList appointments = new LinkedList();
    static Stack medicalRecords = new Stack();
    static Queue petQueue = new Queue();
    static BST petDatabase = new BST();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== PET CARE MANAGEMENT SYSTEM ===");
            System.out.println("1. Grooming Service List");
            System.out.println("2. Appointment Scheduler");
            System.out.println("3. Medical Record History");
            System.out.println("4. Pet Check-up Queue");
            System.out.println("5. Pet Database");
            System.out.println("6. System Summary Dashboard");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> groomingServiceMenu();
                case 2 -> appointmentMenu();
                case 3 -> medicalRecordMenu();
                case 4 -> petQueueMenu();
                case 5 -> petDatabaseMenu();
                case 6 -> showDashboard();
                case 7 -> System.out.println("Exiting system. Thank you!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }

    static void groomingServiceMenu() {
        int choice;
        do {
            System.out.println("\n--- Grooming Service Menu ---");
            System.out.println("1. Add Service at End");
            System.out.println("2. Add Service at Start");
            System.out.println("3. Add Service at Index");
            System.out.println("4. List Services");
            System.out.println("5. Search Service");
            System.out.println("6. Sort Services");
            System.out.println("7. Clear All Services");
            System.out.println("8. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter service name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    groomingServices.addEnd(name + " - $" + price);
                    System.out.println("Service added at end.");
                }
                case 2 -> {
                    System.out.print("Enter service name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    groomingServices.addStart(name + " - $" + price);
                    System.out.println("Service added at start.");
                }
                case 3 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter service name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    groomingServices.addAt(index, name + " - $" + price);
                    System.out.println("Service added at index " + index);
                }
                case 4 -> groomingServices.listAll();
                case 5 -> {
                    System.out.print("Enter service to search: ");
                    String search = sc.nextLine();
                    int idx = groomingServices.search(search);
                    if (idx != -1) System.out.println("Found at index " + idx);
                    else System.out.println("Service not found.");
                }
                case 6 -> {
                    groomingServices.sort();
                    System.out.println("Services sorted alphabetically.");
                }
                case 7 -> {
                    groomingServices.clear();
                    System.out.println("All services cleared.");
                }
                case 8 -> System.out.println("Returning to main menu.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 8);
    }

    static void appointmentMenu() {
        int choice;
        do {
            System.out.println("\n--- Appointment Menu ---");
            System.out.println("1. Add Appointment at End");
            System.out.println("2. Add Appointment at Start");
            System.out.println("3. Add Appointment at Index");
            System.out.println("4. List Appointments");
            System.out.println("5. Search Appointment");
            System.out.println("6. Sort Appointments");
            System.out.println("7. Clear Appointments");
            System.out.println("8. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter date/time: ");
                    String datetime = sc.nextLine();
                    appointments.addEnd(name + " - " + datetime);
                    System.out.println("Appointment added at end.");
                }
                case 2 -> {
                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter date/time: ");
                    String datetime = sc.nextLine();
                    appointments.addStart(name + " - " + datetime);
                    System.out.println("Appointment added at start.");
                }
                case 3 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter date/time: ");
                    String datetime = sc.nextLine();
                    appointments.addAt(index, name + " - " + datetime);
                    System.out.println("Appointment added at index " + index);
                }
                case 4 -> appointments.listAll();
                case 5 -> {
                    System.out.print("Enter pet name to search: ");
                    String search = sc.nextLine();
                    int idx = appointments.search(search);
                    if (idx != -1) System.out.println("Found at index " + idx);
                    else System.out.println("Appointment not found.");
                }
                case 6 -> {
                    appointments.sort();
                    System.out.println("Appointments sorted alphabetically.");
                }
                case 7 -> {
                    appointments.clear();
                    System.out.println("All appointments cleared.");
                }
                case 8 -> System.out.println("Returning to main menu.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 8);
    }

    static void medicalRecordMenu() {
        int choice;
        do {
            System.out.println("\n--- Medical Record Menu ---");
            System.out.println("1. Add Medical Record (Push)");
            System.out.println("2. Remove Last Record (Pop)");
            System.out.println("3. View Last Record (Peek)");
            System.out.println("4. List All Records");
            System.out.println("5. Clear Records");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter treatment details: ");
                    String details = sc.nextLine();
                    medicalRecords.push(name + " - " + details);
                    System.out.println("Medical record added.");
                }
                case 2 -> {
                    String removed = medicalRecords.pop();
                    if (removed != null) System.out.println("Removed: " + removed);
                    else System.out.println("Stack is empty.");
                }
                case 3 -> {
                    String last = medicalRecords.peek();
                    if (last != null) System.out.println("Last record: " + last);
                    else System.out.println("Stack is empty.");
                }
                case 4 -> medicalRecords.listAll();
                case 5 -> {
                    medicalRecords.clear();
                    System.out.println("All records cleared.");
                }
                case 6 -> System.out.println("Returning to main menu.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    static void petQueueMenu() {
        int choice;
        do {
            System.out.println("\n--- Pet Check-up Queue Menu ---");
            System.out.println("1. Add Pet to Queue");
            System.out.println("2. Serve Next Pet");
            System.out.println("3. View Next Pet");
            System.out.println("4. List All Pets in Queue");
            System.out.println("5. Clear Queue");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine();
                    petQueue.enqueue(name);
                    System.out.println("Pet added to queue.");
                }
                case 2 -> {
                    String served = petQueue.dequeue();
                    if (served != null) System.out.println("Served: " + served);
                    else System.out.println("Queue is empty.");
                }
                case 3 -> {
                    String next = petQueue.peek();
                    if (next != null) System.out.println("Next pet: " + next);
                    else System.out.println("Queue is empty.");
                }
                case 4 -> petQueue.listAll();
                case 5 -> {
                    petQueue.clear();
                    System.out.println("Queue cleared.");
                }
                case 6 -> System.out.println("Returning to main menu.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    static void petDatabaseMenu() {
        int choice;
        do {
            System.out.println("\n--- Pet Database Menu ---");
            System.out.println("1. Add Pet");
            System.out.println("2. Search Pet");
            System.out.println("3. List All Pets (In-order)");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter pet name: ");
                    String name = sc.nextLine();
                    petDatabase.insert(name);
                    System.out.println("Pet added to database.");
                }
                case 2 -> {
                    System.out.print("Enter pet name to search: ");
                    String name = sc.nextLine();
                    if (petDatabase.search(name)) System.out.println("Pet found!");
                    else System.out.println("Pet not found.");
                }
                case 3 -> petDatabase.inOrder();
                case 4 -> System.out.println("Returning to main menu.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    static void showDashboard() {
        System.out.println("\n--- System Summary Dashboard ---");
        System.out.println("Total Grooming Services: " + groomingServices.size());
        System.out.println("Total Appointments: " + appointments.size());
        System.out.println("Total Medical Records: " + medicalRecords.size());
        System.out.println("Total Pets in Queue: " + petQueue.size());
        System.out.println("Total Pets in Database: " + petDatabase.size());
    }


    static class ArrayList {
        private String[] arr = new String[10];
        private int size = 0;

        void addEnd(String value) {
            ensureCapacity();
            arr[size++] = value;
        }

        void addStart(String value) {
            ensureCapacity();
            for (int i = size; i > 0; i--) arr[i] = arr[i - 1];
            arr[0] = value;
            size++;
        }

        void addAt(int index, String value) {
            if (index < 0 || index > size) {
                System.out.println("Invalid index");
                return;
            }
            ensureCapacity();
            for (int i = size; i > index; i--) arr[i] = arr[i - 1];
            arr[index] = value;
            size++;
        }

        void listAll() {
            System.out.println("ArrayList contents:");
            for (int i = 0; i < size; i++) System.out.println(i + ": " + arr[i]);
        }

        int search(String value) {
            for (int i = 0; i < size; i++) if (arr[i].equals(value)) return i;
            return -1;
        }

        void sort() {
            for (int i = 0; i < size - 1; i++)
                for (int j = i + 1; j < size; j++)
                    if (arr[i].compareTo(arr[j]) > 0) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
        }

        void clear() {
            arr = new String[10];
            size = 0;
        }

        int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size >= arr.length) {
                String[] newArr = new String[arr.length * 2];
                for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
                arr = newArr;
            }
        }
    }

    static class LinkedList {
        class Node {
            String data;
            Node next;
            Node(String data) { this.data = data; }
        }

        Node head;
        int size = 0;

        void addEnd(String value) {
            Node newNode = new Node(value);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
            }
            size++;
        }

        void addStart(String value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            size++;
        }

        void addAt(int index, String value) {
            if (index < 0 || index > size) {
                System.out.println("Invalid index");
                return;
            }
            if (index == 0) { addStart(value); return; }
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        void listAll() {
            System.out.println("LinkedList contents:");
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                System.out.println(idx++ + ": " + temp.data);
                temp = temp.next;
            }
        }

        int search(String value) {
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data.contains(value)) return idx;
                temp = temp.next;
                idx++;
            }
            return -1;
        }

        void sort() {
            if (head == null) return;
            for (Node i = head; i.next != null; i = i.next) {
                for (Node j = i.next; j != null; j = j.next) {
                    if (i.data.compareTo(j.data) > 0) {
                        String temp = i.data;
                        i.data = j.data;
                        j.data = temp;
                    }
                }
            }
        }

        void clear() { head = null; size = 0; }
        int size() { return size; }
    }

    static class Stack {
        private String[] stack = new String[10];
        private int top = -1;

        void push(String value) {
            if (top + 1 >= stack.length) resize();
            stack[++top] = value;
        }

        String pop() {
            if (top == -1) return null;
            return stack[top--];
        }

        String peek() {
            if (top == -1) return null;
            return stack[top];
        }

        void listAll() {
            System.out.println("Stack contents:");
            for (int i = top; i >= 0; i--) System.out.println(stack[i]);
        }

        void clear() { stack = new String[10]; top = -1; }

        int size() { return top + 1; }

        private void resize() {
            String[] newStack = new String[stack.length * 2];
            for (int i = 0; i < stack.length; i++) newStack[i] = stack[i];
            stack = newStack;
        }
    }

    static class Queue {
        private String[] queue = new String[10];
        private int front = 0, rear = 0, size = 0;

        void enqueue(String value) {
            if (size >= queue.length) resize();
            queue[rear] = value;
            rear = (rear + 1) % queue.length;
            size++;
        }

        String dequeue() {
            if (size == 0) return null;
            String value = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return value;
        }

        String peek() {
            if (size == 0) return null;
            return queue[front];
        }

        void listAll() {
            System.out.println("Queue contents:");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % queue.length;
                System.out.println(queue[idx]);
            }
        }

        void clear() { front = 0; rear = 0; size = 0; queue = new String[10]; }

        int size() { return size; }

        private void resize() {
            String[] newQueue = new String[queue.length * 2];
            for (int i = 0; i < size; i++) newQueue[i] = queue[(front + i) % queue.length];
            queue = newQueue;
            front = 0;
            rear = size;
        }
    }

    static class BST {
        class Node {
            String data;
            Node left, right;
            Node(String data) { this.data = data; }
        }

        Node root;
        int size = 0;

        void insert(String value) {
            root = insertRec(root, value);
            size++;
        }

        private Node insertRec(Node node, String value) {
            if (node == null) return new Node(value);
            if (value.compareTo(node.data) < 0) node.left = insertRec(node.left, value);
            else node.right = insertRec(node.right, value);
            return node;
        }

        boolean search(String value) { return searchRec(root, value); }

        private boolean searchRec(Node node, String value) {
            if (node == null) return false;
            if (node.data.equals(value)) return true;
            if (value.compareTo(node.data) < 0) return searchRec(node.left, value);
            return searchRec(node.right, value);
        }

        void inOrder() { 
            System.out.println("BST in-order:");
            inOrderRec(root); 
        }

        private void inOrderRec(Node node) {
            if (node != null) {
                inOrderRec(node.left);
                System.out.println(node.data);
                inOrderRec(node.right);
            }
        }

        int size() { return size; }
    }
}
