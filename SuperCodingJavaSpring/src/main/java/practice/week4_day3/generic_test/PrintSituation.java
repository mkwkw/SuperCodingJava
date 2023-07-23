package practice.week4_day3.generic_test;

public class PrintSituation {

    public static void main(String[] args) {
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint<String>(); //우항에는 <String> 작성하지 않아도 됨.
        print.setMaterial("설계도");

        String material = print.getMaterial();
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint<Integer> print2 = new GeneralPrint<Integer>();
        print2.setMaterial(1235);

        Integer intMaterial = print2.getMaterial();
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint<Boolean> print3 = new GeneralPrint<Boolean>();
        print3.setMaterial(true);

        Boolean booleanMaterial = print3.getMaterial();
        print3.printMyInfo();

        //<>에 아무것도 안 넣으면 Object로 생성됨.
    }
}
