public class Main {
    public static void main(String[] args) {
        int number = 2;
        int counter = 0;
        int result = 0;

        while (counter != 10001){
            if(isSimple(number)){
                result = number;
                number++;
                counter++;
            }
            else{
                number++;
            }
        }

        System.out.println(result);
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
