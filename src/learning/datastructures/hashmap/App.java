package learning.datastructures.hashmap;

public class App {

    public static void main(String[] args){
        HashMap newHM = new HashMap(100);
        newHM.insert("Rince", "good boy");
        newHM.insert("Kinoj", "some boy");
        newHM.insert("Hannnah", "good girl");
        newHM.insert("Biyana", "some good girl");

        newHM.displayTable();
    }
}
