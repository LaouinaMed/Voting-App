package com.voting.votingapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data

public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;


    @ElementCollection
    private List<OptionVote> options = new ArrayList<>();

    //   @ElementCollection
    //   private List<Long> votes = new ArrayList<>();

    public Poll(String question, List<OptionVote> options) {

        this.question = question;
        this.options = options;
    }

    public Poll() {
    }

    public Long getId() {
        return id;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<OptionVote> getOptions() {
        return options;
    }

    public void setOptions(List<OptionVote> options) {
        this.options = options;
    }







}
