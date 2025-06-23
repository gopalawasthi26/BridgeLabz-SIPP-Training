public class distribution {
    public static void main(String[] args) {
        int pen = 14;
        int Student = 3;
        int pensPerStudent = pen / Student;
        int remainingPens = pen % Student;

        System.out.println("The Pen Per Student is" + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}


