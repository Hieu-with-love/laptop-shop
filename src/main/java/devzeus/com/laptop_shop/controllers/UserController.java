package devzeus.com.laptop_shop.controllers;

import devzeus.com.laptop_shop.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev/v1")
public class UserController {
    @RequestMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long userId){
        try {
            User user = User.builder()
                    .fullName("Hieu")
                    .build();
            return ResponseEntity.ok(user);
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Cannot get user with id = " + userId +"\n" +e);
        }
    }
}
