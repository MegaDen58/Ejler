public class Main {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int k = 100; k < 1000; k++) {
                StringBuilder text = new StringBuilder(String.valueOf(i * k));
                if (text.toString().equals(text.reverse().toString())) {
                   if(max < i * k){
                       max = i * k;
                   }
                }
            }
        }
        System.out.println(max);
    }
}
