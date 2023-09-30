public class Test13 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            int[] num = new int[47];
            for (int j = 0; j < 6; j++) {
                int randNum = (int) (Math.random() * 44) + 1;
                while (num[randNum] == 1){
                    randNum = (int) (Math.random() * 44) + 1;
                }
                System.out.print(randNum+" ");
                num[randNum] = 1;
            }
            System.out.println();
        }
    }
}
