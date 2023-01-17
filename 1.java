public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if(multiplicity(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean multiplicity(int x){
        for (int i = 2; i <= x; i++){
            if(x % i == 0 && (i % 3 == 0 || i % 5 == 0)){
                return true;
            }
        }
        return false;
    }
}
