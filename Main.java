import java.util.HashMap;
import java.util.Scanner;
public class Main {
        public void info() {
        System.out.println("Hal yang perlu ditambahkan:");
        System.out.println("1. Kode Kelas");
        System.out.println("2. Nama Mata Kuliah");
        System.out.println("3. Tempat Kelas");
        System.out.println("4. Jam Mata Kuliah");
        System.out.println("5. Bobot Sks");
        System.out.println("6. Jumlah Mahasiswa (sekarang/batas)");
        System.out.println("");
        
    }

    public void start() {
        
        AddItem AddItem = new AddItem();
        Showitem showItem;
        Showitem showItem2;
        DeleteItem deleteItem;
        Scanner scanner = AddItem.getScanner();
        Scanner info = new Scanner(System.in);
        Scanner pw = new Scanner(System.in);
         HashMap<String, String> itemData;
            showItem = new Showitem(AddItem.getItemList());
            System.out.print("Masukkan Email: ");
            String input = info.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = pw.nextLine();
            System.out.println("");
            AddItem.template();
            if(input.contains("student")){
        
                   
              System.out.println("Anda bukan Dosen/Tendik");
               
            }else{
            while(true) {
            System.out.println("Selamat Datang di SI AKADEMIK");
            System.out.println("1. Lihat informasi mata kuliah");
            System.out.println("2. Tambah mata kuliah");
            System.out.println("3. Hapus mata Kuliah");
            System.out.println("4. Selesai");
            Scanner scanner2 = new Scanner(System.in);
            int input2 = scanner2.nextInt();
            scanner2.nextLine();
            if(input2 == 1){
                showItem.show();    
            }else if(input2 == 2){
        //AddItem.template();      
        while (true) {
           
            
            showItem.show();
            info();
            itemData = AddItem.input(); // Mendapatkan input
            AddItem.addItem(itemData); // Menambahkan item
            // Menginisialisasi Showitem dengan itemList yang diperoleh dari AddItem

            System.out.print("Ingin menambahkan item lagi? (y/n): ");
            String continueInput = AddItem.getScanner().nextLine(); // Anda perlu menambahkan metode getScanner() di AddItem
            System.out.println("");
            if (!continueInput.equalsIgnoreCase("y")) {
                break;
            }
        }
        
    }else if(input2 == 4){
        break;
    }else {
        while (true) {
            System.out.print("Ingin menghapus item? (y/n): ");
            String deleteInput = scanner.nextLine();
            System.out.println("");
            if (deleteInput.equalsIgnoreCase("y")) {
                System.out.print("Masukkan Kode untuk dihapus: ");
                String kodeToDelete = scanner.nextLine();

                deleteItem = new DeleteItem(AddItem.getItemList());
                if (deleteItem.deleteByCode(kodeToDelete)) {
                    System.out.println("Item dengan kode " + kodeToDelete + " berhasil dihapus.");
                } else {
                    System.out.println("Item dengan kode " + kodeToDelete + " tidak ditemukan.");
                }

                // Tampilkan item setelah penghapusan
                showItem.show();
            } else {
                break;
            }
        }
    }
}
}
    }
}

