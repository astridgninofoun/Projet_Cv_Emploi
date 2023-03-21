package sn.esmt.CurriculumVitae.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.CurriculumVitae.dao.AppCvRepository;
import sn.esmt.CurriculumVitae.entities.AppCvEntity;

import java.util.List;

@RestController
@RequestMapping("/cv")
@AllArgsConstructor

public class AppCvController {

    private AppCvRepository AppCvRepository;

    @PostMapping(path = "/save")
    public AppCvEntity save(@RequestBody AppCvEntity AppCvEntity){
        return AppCvRepository.save(AppCvEntity);
    }
    @GetMapping(path = "/all")
    public List<AppCvEntity> getAll(){
        return AppCvRepository.findAll();
    }

}
