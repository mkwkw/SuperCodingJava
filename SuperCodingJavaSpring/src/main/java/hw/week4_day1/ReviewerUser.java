package hw.week4_day1;

public class ReviewerUser extends User implements CustomerRole, ReviewerRole{
    public ReviewerUser(String username) {
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

    @Override
    public void writeReview() {
        ReviewerRole.super.writeReview();
    }

    @Override
    public void giveRating() {
        ReviewerRole.super.giveRating();
    }
}
