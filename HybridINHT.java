class Student {
    String name = "Dev Verma";
    int roll = 1010;

    void displayStudentInfo() {
        System.out.println("Name :" + name);
        System.out.println("Roll : " + roll);
    }
}

class Marks extends Student {
    float sub1 = 33.0F;
    float sub2 = 79.0F;

    void displayMarks() {
        System.out.println("Subject 1 :" + sub1);
        System.out.println("Subject 2 : " + sub2);
    }
}

interface Sports {

    float sportMarks = 10.0F;

    void displaySportMarks();

}

class StudentResults extends Marks implements Sports {
    float total = 0.0F;

    public void displaySportMarks() {
        total = sportMarks + sub1 + sub2;
        displayMarks();
        System.out.println("total :" + total);
    }
}

class HybridINHT {
    public static void main(String a[]) {
        StudentResults obj1 = new StudentResults();
        obj1.displaySportMarks();
    }
}