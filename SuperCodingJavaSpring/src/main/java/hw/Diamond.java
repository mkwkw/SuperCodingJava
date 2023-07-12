package hw;

public class Diamond {

    static void drawDiamond(int size){
        for(int i=1; i<=size; i++) {
            //공백
            for(int j=size-i; j>0; j--) {
                System.out.print(' ');
            }
            //별
            for(int j=0; j<i*2-1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=size-1; i>0; i--) {
            //공백
            for(int j=size-i; j>0; j--) {
                System.out.print(' ');
            }
            //별
            for(int j=0; j<i*2-1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawDiamond(3);
        drawDiamond(5);
        drawDiamond(10);
    }
}
