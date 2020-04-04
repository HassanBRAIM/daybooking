package Dao;

import java.util.ArrayList;

import java.util.List;

public class DayDao {
	
	List<Day> pp = new ArrayList<Day>();
	
	public void addDay(Day p) {

	     pp.add(p)	;	
		}

		
		public void deleteDay(String date) {
	     pp.remove(getDayByDate(date))	;
		}

		
		public Day getDayByDate(String date) {
			Day jj=null;
			
			for (int i=0;i<pp.size();i++) {
				
				
				if (pp.get(i).getDate().equals(date))
					jj=pp.get(i);
				
				
			}
			
			return jj;
		}

		
		public List<Day> getAllDays() {
			return pp;
		}
		
		public List<period> getFreePeriods (Day day ){
			List<period> list=new ArrayList<period>();
			
             for (int i=0;i<day.getPeriods().size();i++) {
				
				
				if (day.getPeriods().get(i).isEtat())
					list.add(day.getPeriods().get(i));	
			}
			
			return list ;
		}

	public period getperiodFromDayWithId(String date ,int id) {
		period ff=null;
		
		for(period jj:this.getDayByDate(date).getPeriods()) {
		 if(jj.getId()==id)
			 ff=jj;
		}
		return ff;
	}
}
