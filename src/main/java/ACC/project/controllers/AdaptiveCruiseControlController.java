package ACC.project.controllers;

import ACC.project.services.AdaptiveCruiseControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdaptiveCruiseControlController {

    @Autowired
    private AdaptiveCruiseControlService accService;

    @GetMapping("/run")
    public String runControlLoop() {
        accService.runControlLoop();
        return "Adaptive Cruise Control aktiviert";
    }
}
