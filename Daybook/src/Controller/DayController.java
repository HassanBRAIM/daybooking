package Controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Dao.Day;
import Dao.DayDao;
import Dao.period;

@Controller
public class DayController {
	
	@Autowired
	DayDao dd;
	@RequestMapping("/day")
	public String Go(Model model) {
		
	
		return "day";
	}
	
	
	@RequestMapping("/rechercher")
    public String recherche(Model model,@RequestParam(value="date") String date) {
		
			List<period>sched=new ArrayList<period>();
			Day hh=dd.getDayByDate(date);
			// liste.add(dd.getDayByDate(date));
			if(hh==null) {
				Day newDay=new Day();
				newDay.setDate(date);
				sched=newDay.getPeriods();	
				dd.addDay(newDay);
			}
			else {
				sched=dd.getFreePeriods(hh);
			}
		
		model.addAttribute("periods",sched);
		model.addAttribute("date",date);
		
		return "day";
	}

	@RequestMapping("/reserver")
    public String DEL(Model model,@RequestParam int id,@RequestParam String date) {
			dd.getperiodFromDayWithId(date, id).setEtat(false);
		     System.out.println("reserved");
		return "day";
			
		
		
	}
	
	
}
