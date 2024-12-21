package Exercise1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.review="qwe";
        movieReview1.title="123";
        MovieReview movieReview2 = new MovieReview();
        movieReview2.review="abc";
        movieReview2.title="321";
    MovieReview[] movieReviews = {movieReview1, movieReview2};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("review: "+movieReview.review+ " title: "+movieReview.title);
        }



    }
}
