package practice.week4_day3.generic_test;

public class GeneralPrint<T> { //제너릭 이용하는 것으로 바꾸기: <T> 추가
    private T material;

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return this.material;
    }
}
