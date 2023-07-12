package hw;

public class ChuncheonTicket2 {
    public static void main(String[] args){
        int freeTickets = 1111;
        int peopleCnt = freeTickets/4;
        int remainCnt = freeTickets%4;

        System.out.println(String.format("티켓을 가져갈 수 있는 근무자들 수는? %d명", peopleCnt));
        System.out.println(String.format("티켓을 다 나눠주고, 남는 티켓 수는? %d장", remainCnt));

    }
}