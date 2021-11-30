
/*
 // photo category
    const Christmas = null;
    const Thanksgiving = null;
    const NewYears = null;

    // photo finish

    const matte = null;
    const glossy = null;
    const lustre = null;

    // photo size

    const small = null;
    const medium = null;
    const large = null;
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class runner {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the category your photos");
        System.out.println("1. " + "Christmas");;
        System.out.println("2. " + "Thanksgiving");
        System.out.println("3. " + "NewYears");

        String category = scanner.nextLine();
        arrayList.add(category);
        System.out.println("Please choose your photo size");

        System.out.println("1. " + "small");
        System.out.println("2. " + "medium");
        System.out.println("3. " + "large");

        String photoSize = scanner.nextLine();

        arrayList.add(photoSize);

        System.out.println("Please choose your photo finished");

        System.out.println("1. " + "matte black");
        System.out.println("2. " + "glossy");
        System.out.println("3. " + "lustre");

        String photoFinished = scanner.nextLine();

        arrayList.add(photoFinished);

        System.out.println(arrayList.toString());






    }
}
