package org.sviteco.alarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sviteco.alarm.entity.Alarm;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private AlarmRepo alarmRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String main(Map<String, Object> model) {
Iterable <Alarm> alarms= alarmRepo.findAll();
model.put("alarms",alarms);
return "main";
    }
    @PostMapping
    public String addNewAlarm (@RequestParam String text
            , @RequestParam String email,Map<String, Object>model) {
       Alarm alarm=  new Alarm(text,email);
       alarmRepo.save(alarm);
        Iterable <Alarm> alarms= alarmRepo.findAll();
        model.put("alarms",alarms);
        return "main";}
}