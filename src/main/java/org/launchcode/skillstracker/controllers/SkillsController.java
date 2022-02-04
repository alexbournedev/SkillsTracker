package org.launchcode.skillstracker.controllers;

import org.launchcode.skillstracker.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String mainPage(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>PHP</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form(){
        return  "<html>" +
                    "<body>" +
                        "<form method='post'>" +
                            "Name:<br>" +
                            "<input type = 'text' name = 'name' />" +
                            "<br>My favorite language:<br>" +
                            "<select name = 'firstChoice'>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select>" +
                            "<br>My second favorite language:<br>" +
                            "<select name = 'secondChoice'>" +
                                "<option value = 'Java'>Java</option>" +
                                "<option value = 'JavaScript'>JavaScript</option>" +
                                "<option value = 'Python'>Python</option>" +
                            "</select>" +
                            "<br>My third favorite language:<br>" +
                            "<select name = 'thirdChoice'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'JavaScript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                            "</select><br>" +
                            "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String results(Form form) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + form.name + "</h1>" +
                        "<ol>" +
                            "<li>" + form.firstChoice + "</li>" +
                            "<li>" + form.secondChoice + "</li>" +
                            "<li>" + form.thirdChoice + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
}