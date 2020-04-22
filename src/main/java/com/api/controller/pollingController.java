package com.api.controller;

import com.api.model.ParamModel;
import com.api.model.Polling;
import com.api.repo.IPollingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
public class pollingController {
    @Autowired(required = true)
    private IPollingRepo _repo;

    @GetMapping("/polling")
    public List<Polling> getPolling(){
        return _repo.findAll();
    }

    @PostMapping(value = "/pollingById")
    public List<Polling> getEvents(@Valid @RequestBody ParamModel model){
        return _repo.find(model.get_id(),model.get_startDate()+" 00:00:00.000",model.get_endDate()+" 00:00:00.000");
    }
}
