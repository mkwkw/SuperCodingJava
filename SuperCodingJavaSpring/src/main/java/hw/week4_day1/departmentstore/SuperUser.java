package hw.week4_day1.departmentstore;

public class SuperUser extends User implements CustomerRole, ReviewerRole, AdminRole {
    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers(String username) {
        AdminRole.super.manageUsers(username);
    }

    @Override
    public void changeSettings(String username) {
        AdminRole.super.changeSettings(username);
    }

    @Override
    public void order(String username) {
        CustomerRole.super.order(username);
    }

    @Override
    public void payment(String username) {
        CustomerRole.super.payment(username);
    }

    @Override
    public void writeReview() {
        ReviewerRole.super.writeReview();
    }

    @Override
    public void giveRating() {
        ReviewerRole.super.giveRating();
    }
}
