class final_result_grade {
    public static void main(String[] args) {
        int marks_1 = 84, marks_2 = 71, marks_3 = 60, marks_4 = 85, marks_5 = 79, marks_6 = 90;
        float total_marks, percentage;
        total_marks = marks_1 + marks_2 + marks_3 + marks_4 + marks_5 + marks_6;
        percentage = (total_marks * 100)/600;

        if (percentage >= 60) { 
            System.out.println("First Class"); 
        }
        else if (percentage < 60 && percentage >= 48) { 
            System.out.println("Second Class"); 
        }
        else if (percentage < 48 && percentage >= 40) { 
            System.out.println("Pass Class"); 
        } 
        else { 
            System.out.println("Re-Examination"); 
        }
    }
}