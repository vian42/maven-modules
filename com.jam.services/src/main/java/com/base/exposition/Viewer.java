package com.base.exposition;

import com.base.internal.Participants;

import java.util.List;

/**
 * This class reprensents your data access level
 * This class will be used in com.jam.app to retrieve some data
 */
public class Viewer {

    public List<String> getParticipants() {
        List<String> participants = Participants.getParticipants();
        /*
         * we suppose that some data checks are done here
         */
        return participants;
    }

}
