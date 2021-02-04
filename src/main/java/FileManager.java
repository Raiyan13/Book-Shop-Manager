
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    FileManager() {

    }

    void write(Books book) throws IOException {

        String id = book.getId().replace(' ', '_');
        String name = book.getName().replace(' ', '_');
        String writer = book.getWriter().replace(' ', '_');
        String availability = book.getAvilability().replace(' ', '_');
        String price = book.getPrice();
        String dateTime = book.getDateTime().replace(' ', '_');

        File file = new File("BookShopStorageFile.txt");
        if (file.createNewFile()) {
            FileWriter myWriter = new FileWriter("BookShopStorageFile.txt");
            myWriter.write(id + " "
                    + name + " "
                    + writer + " "
                    + availability + " "
                    + price + " "
                    + dateTime + "\n");
            myWriter.close();

        } else {

            FileWriter myWriter = new FileWriter("BookShopStorageFile.txt", true);
            myWriter.write(id + " "
                    + name + " "
                    + writer + " "
                    + availability + " "
                    + price + " "
                    + dateTime + "\n");
            myWriter.close();

        }
    }

    ArrayList<Books> read() throws FileNotFoundException {
        ArrayList<Books> allDetails = new ArrayList<Books>();

        File text = new File("BookShopStorageFile.txt");
        if(!text.exists())
            return allDetails;

        Scanner scanner = new Scanner(text);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String str[] = line.split(" ");

            Books book = new Books();

            book.setId(str[0].replace('_', ' '));
            book.setName(str[1].replace('_', ' '));
            book.setWriter(str[2].replace('_', ' '));
            book.setAvilability(str[3].replace('_', ' '));
            book.setPrice(str[4].replace('_', ' '));
            book.setDateTime(str[5].replace('_', ' '));

            allDetails.add(book);
        }

        return allDetails;
    }

    void update(Books book, int idx) throws IOException {

        if(idx==-1){
            FileWriter myWriter = new FileWriter("BookShopStorageFile.txt", false);
            myWriter.close();
            return;
        }
        String id = book.getId().replace(' ', '_');
        String name = book.getName().replace(' ', '_');
        String writer = book.getWriter().replace(' ', '_');
        String avilability = book.getAvilability().replace(' ', '_');
        String price = book.getPrice();
        String dateTime = book.getDateTime().replace(' ', '_');

        if (idx == 0) {
            FileWriter myWriter = new FileWriter("BookShopStorageFile.txt", false);
            myWriter.write(id + " "
                    + name + " "
                    + writer + " "
                    + avilability + " "
                    + price + " "
                    + dateTime + "\n");
            myWriter.close();
        } else {
            FileWriter myWriter = new FileWriter("BookShopStorageFile.txt", true);
            myWriter.write(id + " "
                    + name + " "
                    + writer + " "
                    + avilability + " "
                    + price + " "
                    + dateTime + "\n");
            myWriter.close();
        }

    }

}
