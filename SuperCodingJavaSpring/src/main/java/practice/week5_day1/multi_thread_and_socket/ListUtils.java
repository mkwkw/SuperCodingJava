package practice.week5_day1.multi_thread_and_socket;

import practice.week4_day5.socket_programming.Customer;

import java.util.List;

public class ListUtils {

    public synchronized static void addList(List<Customer> customerList, Customer newCustomer){
        customerList.add(newCustomer);
    }
}
