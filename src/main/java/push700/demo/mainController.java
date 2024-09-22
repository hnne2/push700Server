package push700.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mainController {
    private final pushRep pushRep;
    @Autowired
    public mainController(pushRep pushRep){
    this.pushRep=pushRep;
}
    @GetMapping("getAllPush")
    public List<Push> getAll(){
        return  pushRep.getAllPush();
    }
    @PostMapping("savePush")
    public void save(@RequestBody List<Push> push){
       pushRep.saveAll(push);
    }
    @PostMapping("saveOnePush")
    public void saveOnePush(@RequestBody Push push){
        pushRep.save(push);
    }
}
