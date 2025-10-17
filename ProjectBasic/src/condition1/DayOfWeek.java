package condition1;

public class DayOfWeek {
    // Method ini yang menerima nomor hari dan mengembalikan nama hari
    public String getDayName(int dayNumber) {
        
        String dayName; // Variabel untuk menyimpan nama hari

        // Menggunakan switch-case untuk memilih nama hari berdasarkan nomor
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break; // 'break' penting agar tidak lanjut ke case berikutnya
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday"; // Ini yang diuji di tes pertama
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown"; // Ini untuk menangani input seperti 10
                break;
        }

        // Mengembalikan hasil dengan format "Day: [Nama Hari]"
        return "Day: " + dayName;
    }
}
