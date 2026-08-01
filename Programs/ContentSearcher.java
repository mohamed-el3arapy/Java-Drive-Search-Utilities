import java.io.*;
import java.util.*;

public class ContentSearcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine().toLowerCase();

        System.out.print("Enter drive: ");
        String drive = sc.nextLine().toUpperCase();

        File root = new File(drive + ":/");

        if (root.exists()) {
            search(root, word);
        } else {
            System.out.println("Invalid drive!");
        }

        sc.close();
    }

    static void search(File dir, String word) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File f : files) {
            if (f.isDirectory()) {
                search(f, word);
            } else {
                try (Scanner s = new Scanner(f)) {
                    while (s.hasNextLine()) {
                        if (s.nextLine().toLowerCase().contains(word)) {
                            System.out.println(f.getAbsolutePath());
                            break;
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
    }
}
