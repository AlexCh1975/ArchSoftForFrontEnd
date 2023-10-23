package Adapters;

import java.util.List;

import Domain.MovieReview;
import Ports.iPrintMovieReviews;

public class ConsolePrinter implements iPrintMovieReviews{

    @Override
    public void writeMovieReviews(List<MovieReview> MovieReviewList) {
        MovieReviewList.forEach(MovieReview -> {
            System.out.println(MovieReview.toString());
        });
    }
    
}
