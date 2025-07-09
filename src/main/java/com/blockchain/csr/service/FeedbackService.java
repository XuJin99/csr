package com.blockchain.csr.service;

import com.blockchain.csr.model.entity.Feedback;
import com.blockchain.csr.repository.FeedbackRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }
} 