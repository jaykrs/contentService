package com.cms.content.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public/api/statuscheck")
public class StatusCheckController {

	@GetMapping("/verify")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "success";
    }
}
