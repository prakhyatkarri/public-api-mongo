package com.api.service;

import com.api.data.ActivityRepository;
import com.api.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getAllActivities() {
        return this.activityRepository.findAll();
    }

    @Override
    public void createActivity(Activity activity) {
        Activity savedActivity = this.activityRepository.save(activity);
        System.out.println("Create Result:: " + savedActivity);
    }

    @Override
    public Activity getActivity(Activity activity) {
        return this.activityRepository.findByType(activity.getType()).get(0);
    }

    @Override
    public void updateActivity(Activity activity) {
        this.activityRepository.save(activity);
    }

    @Override
    public void updateActivities(List<Activity> activities) {
        List<Activity> list = this.activityRepository.saveAll(activities);
        System.out.println(list);
    }

    @Override
    public List<Activity> getActivitiesByType(String type) {
        return this.activityRepository.findByType(type);
    }
}
