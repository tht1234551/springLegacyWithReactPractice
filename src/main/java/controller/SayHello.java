package controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@Log4j
public class SayHello {
    {
        System.out.println("aaa");
    }

    @GetMapping("hello")
    public ResponseEntity<String> countUser(String name) {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
}
