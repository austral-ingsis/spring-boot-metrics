package edu.austral.ingsis.jibberjabber;

import edu.austral.ingsis.jibberjabber.dto.PostCreateDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class SimpleController {

  private static final Logger log = LoggerFactory.getLogger(SimpleController.class);

  @GetMapping("/generate/info")
  public String info() {
    log.info("Info message");
    return "Info sent";
  }

  @GetMapping("/generate/error")
  public String error() {
    try {
      String a = null;
      a.equals("");
    }catch (Exception e){
      log.error("Catched exception", e);
    }
    return "Error sent";
  }

  @PostMapping("/post")
  public ResponseEntity<Object> createPost(@RequestBody PostCreateDTO comment) {
    return new ResponseEntity<>(comment.getTitle(), HttpStatus.OK);
  }
}
