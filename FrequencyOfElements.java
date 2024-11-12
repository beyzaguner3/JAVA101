import java.util.Arrays;
public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("List : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int frequency = 1;
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        frequency++;
                    }
                }
                System.out.println("Frequency of " + list[i] +" is "+ frequency);
            }
        }
    }
}
