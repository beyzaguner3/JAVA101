public class HarmonicArrays {
    public static void main(String[] args) {
        int[] list = {1,5,8,4,3,6};
        double harmonic = 0.0;
        for(int i = 0; i < list.length; i++){
            harmonic += 1.0 / list[i];
        }
        double harmonicAverage = list.length / harmonic;
        System.out.println("Harmonic Average : " + harmonicAverage);
    }
}
