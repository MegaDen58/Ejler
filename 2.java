public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int start = 0;
        int end = 1;
        int result = 0;

        while(result < 4000000){
            result = start + end;
            start = end;
            end = result;

            if(result % 2 == 0){
                sum += result;
            }
        }

        System.out.println(sum);
    }
}
