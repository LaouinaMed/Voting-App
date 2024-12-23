package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

@Embeddable
public class OptionVote {
    private String voteOption;
    private Long voteCount = 0L;

    public OptionVote() {
    }

    public String getOption() {
        return voteOption;
    }

    public void setOption(String option) {
        this.voteOption = option;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
