import java.util.List;

public class UniSort {
    public static void sort (List items, ICompareRule rule) {
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < items.size() - 1; i++) {
                // Compare
                if (rule.compare (items.get(i), items.get(i + 1)) > 0) {
                    // Swap
                    Object temp = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, temp);
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}
