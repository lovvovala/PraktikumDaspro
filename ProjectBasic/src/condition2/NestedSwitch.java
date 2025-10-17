package condition2;

public class NestedSwitch {
    // Method menerima kategori dan pilihan, mengembalikan String
    public String getSelection(int category, int choice) {

        // Switch LUAR: untuk memilih Kategori
        switch (category) {
            case 1: // Kategori Minuman
                // Switch DALAM: untuk memilih jenis minuman
                switch (choice) {
                    case 1:
                        return "1, You selected: Tea"; // Kita asumsikan 1 itu Teh
                    case 2:
                        return "1, You selected: Coffee"; // Sesuai tes
                    default:
                        return "1, Invalid drink choice";
                }

            case 2: // Kategori Makanan
                // Switch DALAM: untuk memilih jenis makanan
                switch (choice) {
                    case 1:
                        return "2, You selected: Pizza"; // Sesuai tes
                    default:
                        return "2, Invalid food choice"; // Sesuai tes
                }

            default: // Jika kategori tidak valid (bukan 1 atau 2)
                return category + ", Invalid category"; // Sesuai tes
        }
    }
}

