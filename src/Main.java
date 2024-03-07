import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = myHash();
        String myObj = "Element4";

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(myObj)) {
                iterator.remove();
            }
        }
        hashSet.clear();

        if (hashSet.isEmpty()) {
            System.out.println("Our HashSet is Empty!");
        } else {
            System.out.println("Our HashSet is Full!");
        }
    }

    public static HashSet<String> myHash() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");
        return hashSet;
    }

}