package com.api.controller;

import com.api.model.Activity;
import com.api.service.ActivityService;
import com.sun.xml.internal.ws.wsdl.writer.document.ParamType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> getAllActivities() {
        return this.activityService.getAllActivities();
    }

    @GetMapping("/create")
    public String createActivity() {
        RestTemplate restTemplate = new RestTemplate();
        Activity activity = restTemplate.getForObject("https://www.boredapi.com/api/activity/", Activity.class);
        this.activityService.createActivity(activity);
        return "Success";
    }

    @GetMapping("/update/{type}")
    public String updateActivity(@PathVariable("type") String type) {
        List<Activity> list = this.activityService.getActivitiesByType(type);
        list.forEach(ac -> {
            Double acc = Double.parseDouble(ac.getAccessibility());
            ac.setAccessibility(String.valueOf(acc+0.1));
        });
        this.activityService.updateActivities(list);
        return "Success";
    }
}
