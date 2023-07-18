package hw.week4_day1;

public class GeneralUser extends User implements CustomerRole{

    public GeneralUser(String username) {
        super(username);
    }

    @Override
    public void order(String username) {
        CustomerRole.super.order(username);
    }

    @Override
    public void payment(String username) {
        CustomerRole.super.payment(username);
    }
}
