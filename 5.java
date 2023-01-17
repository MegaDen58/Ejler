public class Main {
    public static void main(String[] args) {
        boolean isStop = true;
        int start = 10;
        int counter;
        while(isStop){
            counter = 0;
            for(int i = 1; i <= 20;i++){
                if(start % i == 0){
                    counter++;
                }
                else{
                    break;
                }
            }
            if(counter == 20){
                System.out.println(start);
                isStop = false;
            }
            else{
                start++;
            }
        }
    }
}
