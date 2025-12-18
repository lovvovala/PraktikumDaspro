package CaseMethod;

import java.util.Scanner; // Import Scanner untuk input data

public class CM2Magang20 {
    // Deklarasi array untuk menyimpan data magang mahasiswa
    static String[] nama = new String[100];
    static String[] nim = new String[100];
    static String[] prodi = new String[100];
    static String[] tuma = new String[100];
    static int[] Semester = new int[100];
    static String[] statusma = new String[100];
    static int jumlahdata = 0;
    static Scanner input = new Scanner(System.in);

    static void tambahData() {
        // fungsi untuk menambah data magang mahasiswa
        System.out.print("Masukkan Nama: ");
        nama[jumlahdata] = input.nextLine();
        String inputNIM;
        boolean isDuplicate;
        do {
            System.out.print("Masukkan NIM: ");
            inputNIM = input.nextLine();
            isDuplicate = false; 
            //Mengecek ke seluruh data yang sudah tersimpan
            for (int i = 0; i < jumlahdata; i++) {
                //Jika input baru sama dengan salah satu data di array
                if (inputNIM.equals(nim[i])) {
                    System.out.println("NIM " + inputNIM + " sudah terdaftar! Gunakan NIM lain.");
                    isDuplicate = true; 
                    break; 
                }
            }
        } while (isDuplicate); // looping akan diulangan jika ditemukan NIM yang sama (isDuplicate = true)
        nim[jumlahdata] = inputNIM;
        System.out.print("Masukkan Prodi: ");
        prodi[jumlahdata] = input.nextLine();
        System.out.print("Masukkan Tempat Magang: ");
        tuma[jumlahdata] = input.nextLine();
        int semester; // Validasi input semester karena hanya boleh 6 atau 7
        do {
            System.out.print("Masukkan Semester (6 atau 7): ");
            semester = input.nextInt();
            if (semester != 6 && semester != 7) {
                System.out.println("Semester harus antara 6 atau 7. Silakan coba lagi.");
            }
        } while (semester != 6 && semester != 7);
        Semester[jumlahdata] = semester;
        input.nextLine();
        String status; // Validasi input status mahasiswa
        boolean validStatus = false;
        do {
            System.out.print("Masukkan Status Mahasiswa (Diterima/Menunggu/Ditolak): ");
            status = input.nextLine();
            if (status.equalsIgnoreCase("Diterima") ||
                    status.equalsIgnoreCase("Menunggu") ||
                    status.equalsIgnoreCase("Ditolak")) {
                validStatus = true;
            } else {
                System.out.println("Status tidak valid. Coba lagi.");
            }
        } while (!validStatus);
        statusma[jumlahdata] = status;
        jumlahdata++;
        System.out.println("Data berhasil ditambahkan!\n. Total Pendaftar: " + jumlahdata);
    }

    static void tampilkanData() {
        // fungsi untuk menampilkan semua data magang mahasiswa berbentuk tabel atau format tabel
        System.out.println("=== Data Magang Mahasiswa ===");
        if (jumlahdata == 0) {
            // mengecek apakah ada data magang mahasiswa
            System.out.println("Tidak ada data magang mahasiswa.");
            return;
        }
        // menampilkan header tabel
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-10s | %-15s | %-20s | %-8s | %-10s |\n",
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahdata; i++) {
            // menampilkan setiap baris data magang mahasiswa
            System.out.printf("| %-3d | %-20s | %-10s | %-15s | %-20s | %-8d | %-10s |\n",
                    (i + 1), nama[i], nim[i], prodi[i], tuma[i], Semester[i], statusma[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }

    static void cariDatadrProdi() {
        // fungsi untuk mencari data magang mahasiswa berdasarkan prodi
        System.out.println("\n=== Cari Data Magang Mahasiswa berdasarkan Prodi ===");
        System.out.print("Masukkan Prodi yang dicari: ");
        String cariProdi = input.nextLine();
        boolean ditemukan = false; // menandai apakah data ditemukan 
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-15s | %-15s | %-20s | %-8s | %-10s |\n",
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");// menampilkan header tabel
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahdata; i++) {
            // mencari data magang mahasiswa berdasarkan prodi
            if (prodi[i].equalsIgnoreCase(cariProdi)) {
                System.out.printf("| %-3d | %-20s | %-15s | %-15s | %-20s | %-8d | %-10s |\n",
                        (i + 1), nama[i], nim[i], prodi[i], tuma[i], Semester[i], statusma[i]);
                ditemukan = true; // jika data ditemukan, ubah nilai ditemukan menjadi true dan menampilkan data
            }
        }
        // jika data tidak ditemukan, tampilkan pesan
        if (!ditemukan) {
            System.out.println("Data dengan Prodi " + cariProdi + " tidak ditemukan.");
        }
    }

    static void jumlahPendaftar() {
        // fungsi untuk menghitung jumlah pendaftar berdasarkan status
        int diterima = 0;
        int menunggu = 0;
        int ditolak = 0;
        // loop untuk menghitung jumlah pendaftar berdasarkan status
        for (int i = 0; i < jumlahdata; i++) {
            if (statusma[i].equalsIgnoreCase("Diterima")) {
                diterima++;
            } else if (statusma[i].equalsIgnoreCase("Menunggu")) {
                menunggu++;
            } else if (statusma[i].equalsIgnoreCase("Ditolak")) {
                ditolak++;
            }
        }
        // menampilkan hasil perhitungan
        System.out.println("\n=== Jumlah Pendaftar berdasarkan Status ===");
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak: " + ditolak);
        System.out.println("Total Pendaftar: " + jumlahdata);
    }

   static void cariNIMdanUbahPerusahaan() {
        System.out.println("\n=== Ubah Tempat Magang berdasarkan NIM ===");
        System.out.print("Masukkan NIM yang akan diubah: ");
        String cariNIM = input.nextLine();
        boolean ditemukan = false; // menandai apakah NIM ditemukan

        for (int i = 0; i < jumlahdata; i++) {
            if (nim[i].equalsIgnoreCase(cariNIM)) {
                ditemukan = true;
                System.out.println("\nData Mahasiswa Ditemukan:"); // MENAMPILKAN DATA MAHASISWA YANG DITEMUKAN
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-3s | %-20s | %-15s | %-15s | %-20s | %-8s | %-10s |\n",
                        "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-3d | %-20s | %-15s | %-15s | %-20s | %-8d | %-10s |\n",
                        (i + 1), nama[i], nim[i], prodi[i], tuma[i], Semester[i], statusma[i]);
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                // Hanya bisa diubah jika status "Menunggu"
                if (statusma[i].equalsIgnoreCase("Menunggu")) {
                    System.out.print("\nMasukkan Tempat Magang baru: ");
                    String tempatBaru = input.nextLine();
                    tuma[i] = tempatBaru; // Proses mengubah data di array
                    System.out.println("Berhasil! Tempat Magang telah diubah.");
                } else {
                    System.out.println("\nMaaf, data tidak bisa diubah karena status sudah '" + statusma[i] + "'.");
                }
                break; // Keluar dari loop karena NIM sudah ketemu
            }
        }// Jika NIM tidak ditemukan, tampilkan pesan
        if (!ditemukan) {
            System.out.println("NIM " + cariNIM + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        // fungsi main untuk menampilkan menu dan menjalankan program
        int pilihan;
        // menggunakan switch case untuk memilih menu yang diinginkan sesuai dengan perintah soal
        do {
            // pilihan menu (diprint)
            System.out.println("\n=== Menu Manajemen Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang Mahasiswa");
            System.out.println("2. Tampilkan Data Magang Mahasiswa");
            System.out.println("3. Cari Data Magang Mahasiswa berdasarkan Prodi");
            System.out.println("4. Jumlah Pendaftar berdasarkan Status");
            System.out.println("5. Ubah Tempat Magang berdasarkan NIM");
            System.out.println("6. Keluar");
            // untuk memilih menu yang diinginkan
            System.out.print("Pilih menu (1-6): ");
            pilihan = input.nextInt();
            input.nextLine();
            // menjalankan fungsi sesuai dengan pilihan menu
            switch (pilihan) {
                case 1:
                    tambahData();
                    break; // menghentikan eksekusi switch setelah mengeksekusi case yang sesuai
                case 2:
                    tampilkanData();
                    break; 
                case 3: 
                    cariDatadrProdi();
                    break;
                case 4:
                    jumlahPendaftar();
                    break;
                case 5:
                    cariNIMdanUbahPerusahaan();
                    break;
                case 6:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi."); // jika pilihan tidak sesuai dengan menu yang ada
            }
        } while (pilihan != 6);// program akan terus berjalan sampai user memilih menu keluar
        input.close(); // menutup scanner 
    }
}
