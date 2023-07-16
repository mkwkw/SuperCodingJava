package hw.week3project;

public class DeliveryManager {

    private long sales; //매상

    public DeliveryManager(long sales) {
        this.sales = sales;
    }

    public void receiveFee(long fee){
        this.sales += fee;
    }

    public void sayDeliveryInfo(int deliveryDate, int deliveryFee){
        System.out.println("배송 담당자: 배송 예정 소요 일자는 "+deliveryDate+"이며, 배송료는 "+deliveryFee+"원 입니다.");
    }

    public void makePackage(){
        System.out.println("배송 담당자: 패키지를 만들었습니다.");
    }

    public void deliverPackage(){
        System.out.println("배송 담당자: 패키지를 전달합니다.");
    }

}
