package com.school.student_leave.controller;

import com.school.student_leave.bean.Leave;
import com.school.student_leave.bean.User;
import com.school.student_leave.repository.LeaveRepository;
import com.school.student_leave.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/leave")
public class LeaveController {
    @Autowired
    private LeaveService leaveService;

    @GetMapping
    public List<Leave> getLeave(){
        List<Leave> list=leaveService.getLeave();
        return list;
    }

    @GetMapping("/sno")
    public Leave findBySno(String sno){
        Leave l=leaveService.findBySno(sno);
        return l;
    }

    @GetMapping("/days")
    public List<Leave> findByDays(int days){
        List<Leave> list=leaveService.findByDays(days);
        return list;
    }

//    final Map<String,Object> params=new HashMap<String, Object>();
//    @RequestMapping(value = "/upload", method = RequestMethod.POST)
//    public Object leaveup(String name,String startD,String endD,int days,String place,String reason){
//        params.clear();
//        params.put("name",name);
//        params.put("start_date",startD);
//        params.put("end_date",endD);
//        params.put("days",days);
//        params.put("place",place);
//        params.put("reason",reason);
//        return params;
    //}

    @PostMapping("/upload")
    public String leaveUp(Leave leave){
        leaveService.save(leave);
        return "ok";
    }


    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("leave", new Leave());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Leave leave){
        Leave newleave=new Leave();
        newleave.setSno(leave.getSno());
        newleave.setStart_date(leave.getStart_date());
        newleave.setEnd_date(leave.getEnd_date());
        newleave.setDays(leave.getDays());
        newleave.setPlace(leave.getPlace());
        newleave.setReason(leave.getReason());

        return "result";
    }

    @GetMapping("/all")
    public String getMessage(Model model){
        List<Leave> leaves=leaveService.getLeave();
        model.addAttribute("students",leaves);
        return "all";
    }

}
