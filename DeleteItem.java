import java.util.ArrayList;
import java.util.HashMap;

public class DeleteItem {
    private ArrayList<HashMap<String, String>> itemList;

    public DeleteItem(ArrayList<HashMap<String, String>> itemList) {
        this.itemList = itemList;
    }

    public boolean deleteByCode(String code) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).get("Kode").equalsIgnoreCase(code)) {
                itemList.remove(i);
                return true; // Mengembalikan true jika item berhasil dihapus
            }
        }
        return false; // Mengembalikan false jika item tidak ditemukan
    }
}
