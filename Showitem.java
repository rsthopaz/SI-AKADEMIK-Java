import java.util.ArrayList;
import java.util.HashMap;

public class Showitem {
    private ArrayList<HashMap<String, String>> itemList;

    public Showitem(ArrayList<HashMap<String, String>> itemList) {
        this.itemList = itemList;
    }

    public boolean check(String cek){
         for (HashMap<String, String> item : itemList) {
            if(cek.equals(item.get("Kode"))){
                System.out.println("Ketemu");
                return true;
            }
        }
        return false;
    }
    public void show() {
        System.out.println("Data yang ada:");
        for (HashMap<String, String> item : itemList) {
            System.out.println(item.get("Kode") + " " + item.get("Nama") + " " + item.get("Tempat") + " " + item.get("Jam") + " " + item.get("Sks") +" "+item.get("Jumlah"));
        }
        System.out.println(" ");
    }
}
