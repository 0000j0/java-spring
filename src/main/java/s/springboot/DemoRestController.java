package s.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import s.springboot.repositories.DemoDataRepository;

@RestController
public class DemoRestController {

    @Autowired
    DemoDataRepository repository;

    @RequestMapping("/re-str/{id}/{name}")
    public String idAndName(@PathVariable int id, @PathVariable String name) {
        return "id: " + id + "  name:" + name + "\n";
    }
}

