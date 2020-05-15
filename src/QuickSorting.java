import java.util.List;

public class QuickSorting {
    public static void sort(List items, ICompareRule rule) {
            for (int i = 1; i < items.size(); i++) {
                Object current = items.get(i);
                int j = i - 1;
                while (j >= 0 && rule.compare(current, items.get(j)) < 0) {
                    items.set(j + 1, items.get(j));
                    j--;
                }
                items.set(j + 1, current);
            }

    }
}