class Student {
    int rollNo;
    int[] marks = new int[3];
    
    Student(int rollNo, int[] marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
    
    int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total = total + mark;
        }
        return total;
    }
    
    int getHighestMark() {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        students[0] = new Student(1, new int[]{85, 90, 78});
        students[1] = new Student(2, new int[]{92, 88, 95});
        students[2] = new Student(3, new int[]{78, 86, 90});
        students[3] = new Student(4, new int[]{95, 82, 88});
        students[4] = new Student(5, new int[]{89, 91, 79});
        
        for (Student student : students) {
            System.out.println("Total marks obtained by Student " + student.rollNo + ": " + student.getTotalMarks());
        }
        
        for (int i = 0; i < 3; i++) {
            int highest = students[0].marks[i];
            int rollNo = students[0].rollNo;
            for (Student student : students) {
                if (student.marks[i] > highest) {
                    highest = student.marks[i];
                    rollNo = student.rollNo;
                }
            }
            System.out.println("Highest mark in Subject " + (i+1) + ": " + highest + " (Student " + rollNo + ")");
        }
        
        int highestTotal = students[0].getTotalMarks();
        for (Student student : students) {
            if (student.getTotalMarks() > highestTotal) {
                highestTotal = student.getTotalMarks();
            }
        }
        System.out.println("Students who obtained highest total marks:");
        for (Student student : students) {
            if (student.getTotalMarks() == highestTotal) {
                System.out.println("Student " + student.rollNo);
            }
        }
    }
}
