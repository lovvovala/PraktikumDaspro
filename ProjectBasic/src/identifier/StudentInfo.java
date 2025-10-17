package identifier;

public class StudentInfo {
    // Method ini menerima nama, umur, dan IPK, lalu mengembalikannya
    // dalam format String yang telah ditentukan
    public String showStudentInfo(String name, int age, double gpa) {
        // menggabungkan semua informasi menjadi satu String sesuai format di dalam soal
        String result = "Name: " + name + "\n" +
                        "Age : " + age + "\n" +
                        "GPA : " + gpa + "\n";
        
        return result; 
}
}
