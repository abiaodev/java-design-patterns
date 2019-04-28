package com.biao.facade;

import java.util.ArrayList;
import java.util.List;

public class ActivityFacade {
    private List<DayActivity> activities;

    public ActivityFacade() {
        this.activities = new ArrayList<>();
        activities.add(new PeopleOneDayActivity());
        activities.add(new PeopleTwoDayActivity());
    }

    public void startDay() {
        makeActions(activities, DayActivity.ACTION.GET_UP, DayActivity.ACTION.WASH);
    }

    public void work() {
        makeActions(activities, DayActivity.ACTION.WORK);
    }

    public void endDay() {
        makeActions(activities, DayActivity.ACTION.GO_HOME, DayActivity.ACTION.GO_TO_SLEEP);
    }

    private void makeActions(List<DayActivity> activities, DayActivity.ACTION... actions) {
        for (DayActivity activity : activities) {
            activity.action(actions);
        }
    }
}
