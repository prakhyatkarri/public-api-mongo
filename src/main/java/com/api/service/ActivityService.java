package com.api.service;

import com.api.model.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> getAllActivities();

    void createActivity(Activity activity);

    Activity getActivity(Activity activity);

    void updateActivity(Activity activity);

    void updateActivities(List<Activity> activities);

    List<Activity> getActivitiesByType(String type);
}
