public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 10000; i++){
            if(i == (sum(sum(i)))){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static int sum(int x){
        int counter = 0;
        for(int i = 1; i < x; i++){
            if(x % i == 0){
                counter += i;
            }
        }
        return counter;
    }
}