import java.util.Map;
import java.util.HashMap;

public abstract class Organism {
    private static int counter = 0;
    private static Map<String, Integer> specificCounter = new HashMap<String, Integer>();

    public Organism() {
        System.out.println("Creating an organism...");
        ++counter;
        String specificName = toString();
        if (!specificCounter.containsKey(specificName)) {
            specificCounter.put(specificName, 0);
        }
        specificCounter.put(specificName, specificCounter.get(specificName) + 1);
    }

    public static int getCounter() {
        return counter;
    }

    public static int getSpecificCounter(Organism o) {
        return specificCounter.get(o.toString());
    }

    public String toString() {
        return getClass().getName();
    }
}
