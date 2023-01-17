public class Main {
    public static void main(String[] args) {
        boolean isStop = true;
        boolean isNext = true;
        int result = 0;

        while(isStop){
            for(int i = 2; i <= 500; i++){
                if(isNext) {
                    for (int k = 2; k <= 500; k++) {
                        double a = Math.pow(i, 2);
                        double b = Math.pow(k, 2);
                        double c = Math.sqrt(a + b);

                        if ((c == Double.parseDouble(String.valueOf((int) c)))) {
                            if (i + k + (int)c == 1000) {
                                result = i * k * (int)c;
                                isNext = false;
                                isStop = false;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
