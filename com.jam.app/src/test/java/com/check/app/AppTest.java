package com.check.app;


import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AppTest {

    private SoftAssertions should;

    @Before
    public void setUp() {
        should = new SoftAssertions();
    }

    @Test
    public void shoul_retrieve_participants() {
        //Setup
        int expectedNumberOfParticipants = 35;

        //Test
        List<String> participants = App.getParticipants();

        //Assert
        should.assertThat(participants).isNotEmpty();
        should.assertThat(participants.size()).isEqualTo(expectedNumberOfParticipants);
        should.assertAll();
    }
}