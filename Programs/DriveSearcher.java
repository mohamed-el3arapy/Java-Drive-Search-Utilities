import java.io.File;
import java.util.Scanner;

public class DriveSearcher {
    static boolean found = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine().trim();
        System.out.print("Enter drive: ");
        String drive = sc.nextLine().trim().toUpperCase();

        File root = new File(drive + ":/");
        if (root.exists()) {
            searchFile(root, fileName);
            if (!found) {
                System.out.println("File does not exist");
            }
        } else {
            System.out.println("Invalid drive!");
        }
        sc.close();
    }

    static void searchFile(File dir, String fileName) {
        File[] list = dir.listFiles();
        if (list == null) return;
        for (File f : list) {
            if (f.getName().equalsIgnoreCase(fileName)) {
                System.out.println("Found path: " + f.getAbsolutePath());
                found = true;
            }
            if (f.isDirectory()) searchFile(f, fileName);
        }
    }
}
