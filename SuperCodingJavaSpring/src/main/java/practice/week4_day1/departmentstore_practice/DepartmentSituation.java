package practice.week4_day1.departmentstore_practice;

public class DepartmentSituation {
    public static void main(String[] args) {

        //전제 상황
        int price = 10000;
        Staff staff = new Staff();
        staff.setSalesAmount(1000000);

        Customer customer = new VIPCustomer("아이유"); //단골 손님

        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("광해군"),
                new VIPCustomer("유성룡"), new Customer("김좌진"), customer,
                new Customer("장원영"), customer, new VIPCustomer("김혜수"),
                new GoldCustomer("하니"), new GoldCustomer("정우성"), new GoldCustomer("손흥민")
        };

        //시나리오
        for(Customer customerEach : customerQueue){
            customerEach.printMyInfo();
            customerEach.calculatePrice(price);
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();
    }
}
