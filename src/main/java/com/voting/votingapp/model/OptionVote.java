package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

@Embeddable
public class OptionVote {
    private String voteOption;
    private Long voteCount = 0L;

    public OptionVote() {
    }

    public OptionVote(String voteOption, Long voteCount) {
        this.voteOption = voteOption;
        this.voteCount = voteCount;
    }

    public String getVoteOption() {
        return voteOption;
    }

    public void setVoteOption(String voteOption) {
        this.voteOption = voteOption;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
