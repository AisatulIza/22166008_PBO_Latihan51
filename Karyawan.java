/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat51;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas karyawan
public class Karyawan {
     //variabel
    private String nik;
    private String nama;
    private String jabatan;
    private int golongan;
    //metode get dan set
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getGolongan() {
        return golongan;
    }
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}
//kelas manager turunan dari kelas karyawan
class Manager extends Karyawan {
    //vatiabel
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
   
    //metode get dan set
    public int getKehadiran() {
        return kehadiran;
    }
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    //menghitung tunjangan kehadiran
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    //menghitung tunjangan jabatan
    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    //menghitung tunjangan golongan
    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    //menghitung gaji total
    public float gajiTotal() {
        return tunjanganKehadiran + tunjanganJabatan + tunjanganGolongan;
    }
    //metode menampilkan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan Nik : ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = scanner.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = scanner.next();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int jumlahKehadiran = scanner.nextInt();

        Manager manager = new Manager();
        manager.setNik(nik);
        manager.setNama(nama);
        manager.setGolongan(golongan);
        manager.setJabatan(jabatan);
        manager.setKehadiran(jumlahKehadiran);
        System.out.println(" ");
        System.out.println("====Hasil Perhitungan Gaji Karyawan====");
        System.out.println("Nik : " + manager.getNik());
        System.out.println("Nama : " + manager.getNama());
        System.out.println("Jabatan : " + manager.getJabatan());
        System.out.println("Golongan : " + manager.getGolongan());
        System.out.println("Kehadiran : " + manager.getKehadiran());
        System.out.println("Tunjangan Kehadiran : " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("Tunjangan Jabatan : " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("Tunjangan Golongan : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("Gaji Total : " + manager.gajiTotal());
    }
    
}
