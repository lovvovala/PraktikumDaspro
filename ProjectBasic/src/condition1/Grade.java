package condition1; // Nama package harus sama persis dengan nama foldernya

public class Grade {
  // Method ini menerima satu input integer (skor)
    // dan mengembalikan sebuah String (nilai huruf)
    public String getGrade(int score) {
        
        String grade; // Variabel untuk menyimpan nilai huruf

        if (score >= 90) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Gabungkan "Grade: " dengan nilai huruf yang didapat
        return "Grade: " + grade;
    }
}  

