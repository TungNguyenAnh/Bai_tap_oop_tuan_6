import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("person.dat");
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            String text = "hehehehehehe";
            byte [] bytes =text.getBytes();

            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
