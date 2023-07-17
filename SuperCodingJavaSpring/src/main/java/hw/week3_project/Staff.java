package hw.week3_project;

public class Staff {

    private long sales; //매상

    public Staff(long sales) {
        this.sales = sales;
    }

    public void sayInfo(long sneakersPrice, String sneakersFeature){
        System.out.println("Nike 운동화의 가격은 "+sneakersPrice+"원이고, 특징은 "+sneakersFeature+"입니다.");
    }

    public void saySneakersPrice(long price){
        System.out.println("매장 직원: Nike 운동화 가격은 "+price+"원입니다.");
    }

    public void saySneakersStock(boolean isStockOk){
        if(isStockOk){
            System.out.println("매장 직원: 재고가 있습니다.");
        }
        else {
            System.out.println("매장 직원: 재고가 없습니다.");
            System.out.println("매장 직원: 물품 배송 요청을 하시겠습니까?");
        }
    }

    public void addSales(long sneakersPrice){
        this.sales += sneakersPrice;
    }

    public void askSneakers(){
        System.out.println("매장 직원: 배송 담당자님, 배송 요청합니다.");
    }

    public void sayTotalInfo(int deliveryDate, int deliveryFee, long sneakersPrice){
        System.out.println("매장 직원: 배송 예정 소요 일자는 "+deliveryDate+"이며, 배송료는 "+deliveryFee+"원 입니다."+
                "총 비용은 "+(deliveryFee+sneakersPrice)+"원 입니다.");
    }

    public void sayTotalPrice(long totalPrice){
        System.out.println("매장 직원: 손님, 총 가격은 "+totalPrice+"원입니다.");
    }

    public void removeSales(long price){
        this.sales -= price;
    }
}
