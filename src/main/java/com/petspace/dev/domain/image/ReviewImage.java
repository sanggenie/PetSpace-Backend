package com.petspace.dev.domain.image;

import com.petspace.dev.domain.Review;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReviewImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_image_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id")
    private Review review;

    @Column(columnDefinition = "TEXT")
    private String reviewImageUrl;

    @Builder
    public ReviewImage(Review review, String reviewImageUrl) {
        this.review = review;
        this.reviewImageUrl = reviewImageUrl;
    }
}
