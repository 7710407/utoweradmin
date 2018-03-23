package admin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AdminController {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/get/json",
            method = RequestMethod.GET,
            produces = {"application/json"}
    )
    public Student generateJSON() {
        return new Student("111", "Name1", "LastName1"); // );//
    }

    @RequestMapping(value = "/post/xml",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/xml"}
    )
    public Student generateXML(@RequestBody Student student) {
        return student;
    }

}
