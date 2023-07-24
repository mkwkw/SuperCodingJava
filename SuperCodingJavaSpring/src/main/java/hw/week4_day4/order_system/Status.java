package hw.week4_day4.order_system;

public enum Status {
    PAID("주문 완료"),
    SHIPPED("배송 완료"),
    DELIVERED("배송 완료"),
    NOT_PAID("결제 전"),
    ON_ORDER("주문 처리 중");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
