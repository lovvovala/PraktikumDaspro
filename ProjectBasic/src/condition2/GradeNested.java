package condition2;

public class GradeNested {
   // Method menerima subject (String) dan score (int)
    public String getGradeInfo(String subject, int score) {
        
        String grade;

        // Kondisi LUAR: Cek mata pelajarannya
        if (subject.equals("Math")) {
            
            // Kondisi DALAM: Cek skor khusus untuk Math
            if (score >= 90) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else {
                grade = "C";
            }
            // Kembalikan hasil format untuk Math
            return "Subject: Math, Grade: " + grade;

        } else if (subject.equals("English")) {
            
            // Kondisi DALAM: Cek skor khusus untuk English
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else {
                grade = "C";
            }
            // Kembalikan hasil format untuk English
            return "Subject: English, Grade: " + grade;

        } else {
            // Jika mata pelajaran tidak dikenali
            return "Subject: Unknown, Grade: N/A";
        }
    } 
}
