import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class AddItem {
    private Scanner scanner;
    private ArrayList<HashMap<String, String>> itemList;

    public AddItem() {
        scanner = new Scanner(System.in);
        itemList = new ArrayList<>();
    }



    public HashMap<String, String> input() {
        HashMap<String, String> itemData = new HashMap<>();
        
       while (true) {
    System.out.print("Kode Kelas> ");
    String kodeKelas = scanner.nextLine();
    boolean isUniqueKode = true;
    
    for (HashMap<String, String> item : itemList) {
        if (item.get("Kode").equalsIgnoreCase(kodeKelas)) {
            System.out.println("Kode kelas harus berbeda.");
            isUniqueKode = false;
            break;
        }
    } 
    
    if (isUniqueKode) {
        itemData.put("Kode", kodeKelas);
        break;
    }
}
    
  while (true) {
    System.out.print("Nama Mata Kuliah> ");
    String namaMataKuliah = scanner.nextLine();
    boolean isUniqueNama = true;

    for (HashMap<String, String> item : itemList) {
        if (item.get("Nama").equalsIgnoreCase(namaMataKuliah)) {
            System.out.println("Nama mata kuliah harus berbeda.");
            isUniqueNama = false;
            break;
        }
    }

    if (isUniqueNama) {
        itemData.put("Nama", namaMataKuliah);
        break;
    }
}

while (true) {
    System.out.print("Tempat Kelas> ");
    String namaMataKuliah = scanner.nextLine();
    System.out.print("Jam Mata Kuliah> ");
    String Jammatkul = scanner.nextLine();
    boolean isUniqueNama = true;
    boolean isUniqueNama2 = true;
    for (HashMap<String, String> item : itemList) {
        if (item.get("Tempat").equalsIgnoreCase(namaMataKuliah)) {
            isUniqueNama = false;
            break;
        }
    }
    
    for (HashMap<String, String> item : itemList) {
        if (item.get("Jam").equalsIgnoreCase(Jammatkul)) {
            isUniqueNama2 = false;
            break;
        }
    }
    
    if ((isUniqueNama == true)  && (isUniqueNama2 == true)) {
        itemData.put("Tempat", namaMataKuliah);
        itemData.put("Jam", Jammatkul);
        break;
    }else {
        System.out.println("Kelas dan Jam sudah terpakai");
    }
}   
       
  while (true) {
    System.out.print("Bobot Sks> ");
    String sksInput = scanner.nextLine();
    
    // Mengonversi input menjadi integer
    int sks;
    try {
        sks = Integer.parseInt(sksInput);
    } catch (NumberFormatException e) {
        System.out.println("Masukkan angka yang valid untuk bobot SKS.");
        continue; // Kembali ke awal loop jika input tidak valid
    }

    // Memeriksa kondisi
    if (sks <= 1) {
        System.out.println("Tidak ada bobot mata kuliah <= 1 kecuali praktikum");
    }else if(sks >= 7){
        System.out.println("Tidak ada bobot mata kuliah >= 7");
    }else {
        // Lanjutkan jika bobot SKS valid
        itemData.put("Sks", String.valueOf(sks)); // Menyimpan SKS ke itemData
        break; // Keluar dari loop jika input valid
    }
}       
        System.out.print("Jumlah Mahasiswa> ");
        itemData.put("Jumlah", scanner.nextLine());
        
        return itemData; // Mengembalikan data yang diinput
    }
    
    public void template(){
        HashMap<String, String> itemData1 = new HashMap<>();
        itemData1.put("Kode", "EF234301");
        itemData1.put("Nama", "Pemrograman Web (A)");
        itemData1.put("Tempat", "IF 305");
        itemData1.put("Jam", "Senin 10.00-15.00");
        itemData1.put("Sks", "3");
        itemData1.put("Jumlah", "20/40");
        itemList.add(itemData1);

        HashMap<String, String> itemData2 = new HashMap<>();
        itemData2.put("Kode", "EF234302");
        itemData2.put("Nama", "Pemrograman Berorientasi Objek (G)");
        itemData2.put("Tempat", "IF 113");
        itemData2.put("Jam", "Kamis 08.00-09.40");
        itemData2.put("Sks", "3");
        itemData2.put("Jumlah", "28/35");
        itemList.add(itemData2);
        
        HashMap<String, String> itemData3 = new HashMap<>();
        itemData3.put("Kode", "EF234303");
        itemData3.put("Nama", "Jaringan Komputer (A)");
        itemData3.put("Tempat", "IF 105");
        itemData3.put("Jam", "Selasa 07.00-08.40");
        itemData3.put("Sks", "4");
        itemData3.put("Jumlah", "40/40");
        itemList.add(itemData3);
        
        HashMap<String, String> itemData4 = new HashMap<>();
        itemData4.put("Kode", "EF234304");
        itemData4.put("Nama", "Teori Graf (H)");
        itemData4.put("Tempat", "IF 105");
        itemData4.put("Jam", "Jum'at 07.00-08.40");
        itemData4.put("Sks", "3");
        itemData4.put("Jumlah", "40/40");
        itemList.add(itemData4);
        
        HashMap<String, String> itemData5 = new HashMap<>();
        itemData5.put("Kode", "EF234305");
        itemData5.put("Nama", "Konsep Pengembangan Perangkat Lunak (D)");
        itemData5.put("Tempat", "IF 311");
        itemData5.put("Jam", "Selasa 10.00-11.40");
        itemData5.put("Sks", "2");
        itemData5.put("Jumlah", "13/30");
        itemList.add(itemData5);
        
        HashMap<String, String> itemData6 = new HashMap<>();
        itemData6.put("Kode", "EF234103");
        itemData6.put("Nama", "Aljabar Linier (A)");
        itemData6.put("Tempat", "IF 105");
        itemData6.put("Jam", "Senin 07.30-09.40");
        itemData6.put("Sks", "3");
        itemData6.put("Jumlah", "67/90");
        itemList.add(itemData6);
        
        HashMap<String, String> itemData7 = new HashMap<>();
        itemData7.put("Kode", "EF234101");
        itemData7.put("Nama", "Dasar Pemrograman (A)");
        itemData7.put("Tempat", "IF 103");
        itemData7.put("Jam", "Rabu 13.00-14.20");
        itemData7.put("Sks", "4");
        itemData7.put("Jumlah", "38/40");
        itemList.add(itemData7);

        
    }

    public void addItem(HashMap<String, String> itemData) {
        itemList.add(itemData); // Menambahkan item ke list
    }

    public ArrayList<HashMap<String, String>> getItemList() {
        return itemList; // Mengembalikan itemList
    }
    
    public Scanner getScanner() {
    return scanner; // Mengembalikan scanner untuk digunakan di Main
    }
    


}
