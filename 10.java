public class Main {
    public static void main(String[] args) {
        long sum = 0;

        for(int i = 2; i < 2000000; i++){
            if(isSimple(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isSimple(int x){
        for(int i = 2; i < x; i++){
                if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
