package com.test.jitsiMeet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeetController {

    @GetMapping("/jitsi")
    public String getJitsiMeetPage(Model model) {
        model.addAttribute("roomName", "my-room");
        model.addAttribute("displayName", "My Name");
        return "jitsi-meet";
    }
}
