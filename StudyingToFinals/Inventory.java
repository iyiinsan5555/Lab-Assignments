import java.io.FileWriter;
import java.util.Formatter;

public class Inventory {
    private Item[] items = new Item[2]; //initially 2
    private int itemCount = 0;

    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount += 1;

        //Checking array size
        if (itemCount >= items.length) {
            //grow the array
            Item[] newArray = new Item[items.length * 2];
            System.arraycopy(items, 0, newArray, 0, items.length);
            items = newArray;
        }
    }

    public void writeToFile(String fileName) {

        for (Item item : items) {

            //null check
            if (item == null) {
                return;
            }

            FileWriter fw = null;
            Formatter formatter = null;

            try {
                fw = new FileWriter(fileName, true);
                formatter = new Formatter(fw);
                formatter.format("Name: %s & Quantity: %d & Price: %.02f %n", item.getName(), item.getQuantity(), item.getPrice());
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (formatter != null) {
                    formatter.close();
                }
            }

        }
    }

    public static void main(String[] args) {
        Item item1 = new Item("Poop", 2, 5);
        Item item2 = new Item("Phone", 5, 105);

        Inventory inv = new Inventory();
        inv.addItem(item1);
        inv.addItem(item2);

        inv.writeToFile("Test.txt");
    }
}
