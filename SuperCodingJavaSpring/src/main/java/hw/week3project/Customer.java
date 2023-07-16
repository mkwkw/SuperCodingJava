package hw.week3project;

import java.util.Arrays;

public class Customer {

    private long money; //잔액
    private boolean likeDelivery; //배송 선호 여부

    public Customer(long money, boolean likeDelivery){
        this.money = money;
        this.likeDelivery = likeDelivery;
    }

    public boolean isLikeDelivery() {
        return likeDelivery;
    }

    public long getMoney() {
        return money;
    }

    public boolean checkMoney(long sneakersPrice){
        if(this.money>=sneakersPrice){
            return true;
        }
        else{
            return false;
        }
    }

    public void buySneakers(long sneakersPrice){
        this.money -= sneakersPrice;
    }

    public void payDeliveryFee(long deliveryFee){
        this.money -= deliveryFee;
    }

    public void refundSneakers(long sneakersPrice){
        this.money += sneakersPrice;
        System.out.println("고객: 신발을 환불합니다.");
    }

    public void askInfo(){
        System.out.println("고객: Nike 운동화에 대해 알려주세요");
    }

    public void sayInfo(long sneakersPrice, String sneakersFeature){
        System.out.println("고객: Nike 운동화의 가격은 "+sneakersPrice+"원이고, 특징은 "+sneakersFeature+"입니다.");
        System.out.println("저는 지금 기분이 좋습니다.");
    }

    public void sayComeAgain(){
        System.out.println("고객: 다음에 다시 올게요.");
    }

}
