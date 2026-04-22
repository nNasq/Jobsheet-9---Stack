import java.util.Scanner;

public class SuratDemo10 {
    public static void main(String[] args) {
        StackSurat10 stack = new StackSurat10(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat10 surat = new Surat10(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima.\n", nama);
                    break;

                case 2:
                    Surat10 diproses = stack.pop();
                    if (diproses != null) {
                        String jenisStr = (diproses.jenisIzin == 'S') ? "Sakit" : "Izin";
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                        System.out.println("Kelas     : " + diproses.kelas);
                        System.out.println("Jenis Izin: " + jenisStr);
                        System.out.println("Durasi    : " + diproses.durasi + " hari");
                        System.out.println("Surat berhasil divalidasi.");
                    }
                    break;

                case 3:
                    Surat10 teratas = stack.peek();
                    if (teratas != null) {
                        String jenisStr = (teratas.jenisIzin == 'S') ? "Sakit" : "Izin";
                        System.out.println("Surat terakhir masuk:");
                        System.out.println("ID Surat  : " + teratas.idSurat);
                        System.out.println("Nama      : " + teratas.namaMahasiswa);
                        System.out.println("Kelas     : " + teratas.kelas);
                        System.out.println("Jenis Izin: " + jenisStr);
                        System.out.println("Durasi    : " + teratas.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat izin dari " + cari + " DITEMUKAN dalam stack.");
                    } else {
                        System.out.println("Surat izin dari " + cari + " TIDAK DITEMUKAN dalam stack.");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}
