package hw.week3project;

public class OrderSneakersSituation {

    public static void main(String[] args){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 50_000;
        boolean havingNikeSneakersInStore = true; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        Customer customer = new Customer(100000, false);
        DeliveryManager deliveryManager = new DeliveryManager(100000);
        Staff staff = new Staff(100000);

        customer.askInfo();
        staff.sayInfo(nikeSneakersPrice, nikeSneakersFeature);
        if(!customer.checkMoney(nikeSneakersPrice)){
            customer.sayComeAgain();
        }
        else{
            staff.saySneakersStock(havingNikeSneakersInStore);

            if(havingNikeSneakersInStore) { //재고가 있는 경우
                staff.saySneakersPrice(nikeSneakersPrice);
                System.out.println("결제를 진행합니다.");
                customer.buySneakers(nikeSneakersPrice);
                customer.sayInfo(nikeSneakersPrice, nikeSneakersFeature);
                staff.addSales(nikeSneakersPrice);
            }
            else{ //재고가 없는 경우 - 배송 요청
                if(customer.isLikeDelivery()){ //배송 선호
                    staff.saySneakersPrice(nikeSneakersPrice);
                    customer.buySneakers(nikeSneakersPrice);
                    staff.addSales(nikeSneakersPrice);
                    staff.askSneakers();
                    deliveryManager.sayDeliveryInfo(daysForDeliver, costForDeliver);
                    staff.sayTotalInfo(daysForDeliver, costForDeliver, nikeSneakersPrice);

                    if(costForDeliver+nikeSneakersPrice>customer.getMoney()){
                        customer.refundSneakers(nikeSneakersPrice);
                        staff.removeSales(nikeSneakersPrice);
                        customer.sayComeAgain();
                    }
                    else{
                        System.out.println("주문을 진행합니다.");
                        deliveryManager.makePackage();
                        deliveryManager.deliverPackage();
                        customer.payDeliveryFee(costForDeliver);
                        deliveryManager.receiveFee(costForDeliver);
                        customer.sayInfo(nikeSneakersPrice, nikeSneakersFeature);
                    }
                }
                else{ //배송 비선호
                    customer.sayComeAgain();
                }
            }
        }
    }
}
