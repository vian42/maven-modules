package com.check.app;

import com.base.exposition.Viewer;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        for (String participant:getParticipants()) {
            System.out.println(participant);
        };
    }

    /**
     * That's your main class
     * It's a simple case, we can imagine that the app
     * is doing some things and not only retrieving the data
     */

    public static List<String> getParticipants() {
        //TODO fill the participants list with ParticipantViewer class
        List<String> participants = new ArrayList<>();
        Viewer view = new Viewer();
        participants.addAll(view.getParticipants());
        return participants;
    }
}
