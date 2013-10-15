package jp.co.wap.exam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.wap.exam.lib.Interval;
public class Problem2 {
	
	class time{
		
		//time class which consists of start time, end time and difference between times(cost)
		
		private int stime;
		private int etime;
		private int cost;
		
		public time(int starttime, int endtime, int cost) {
			this.stime = starttime;
			this.etime = endtime;
			this.cost = cost;
		}
		
		public int getstime(){
			return this.stime;
		}
	
		public int getetime(){
			return this.etime;
		}
		
		public int getcost(){
			return this.cost;
		}
	}
	
	
	/*  public static void testProblem2(){
		
		Problem2 p = new Problem2();
		
		Interval interval1 = new Interval("08:00", "12:00");
		Interval interval2 = new Interval("06:00", "09:00");
		Interval interval3 = new Interval("11:00", "13:30");
		List<Interval> figure1 = Arrays.asList(interval1, interval2, interval3);
		System.out.println(p.getMaxWorkingTime(figure1));
		// example: Figure 2

		List<Interval> figure2 = Arrays.asList(new Interval("09:00", "12:30"),
		new Interval("06:00", "09:30"), new Interval("12:00", "14:30"),
		new Interval("10:00", "10:30"), new Interval("11:00", "13:30"));
		System.out.println(p.getMaxWorkingTime(figure2));
		}
		*/
		
			
	public int getMaxWorkingTime(List<Interval> intervals) {
		
		//weighted activity selection method using greedy algorithmic approach
	
		int n = intervals.size();
		int weight[] = new int[n];
		
		ArrayList<time> arr = new ArrayList<time>();
		
		for(int i=0;i<intervals.size();i++){
			int sthr = intervals.get(i).getBeginHour();
			int stmin = intervals.get(i).getBeginMinute();
			int endhr = intervals.get(i).getEndHour();
			int endmin = intervals.get(i).getEndMinute();	
			int cost  = ((endhr * 60) + endmin) - ((sthr * 60) + stmin);
			
			int starttime = ((sthr * 60) + stmin);
			int endtime = ((endhr * 60) + endmin);
			arr.add(new time(starttime,endtime,cost));
		}
		
		//now arr contains start time and end time and weight contains weight of the time respectively
		
		Collections.sort(arr, new Comparator<time>() {
		    public int compare(time p1, time p2) {
		        return p1.getetime() - p2.getetime();
		    }
		});
		
	//	for(int i=0;i<arr.size();i++)
	//		System.out.println(arr.get(i).getstime() + " " + arr.get(i).getetime());
					
		
	// here q is an array which contains largest index i such that job[i] is compatable with job[j] 
		
		int q[] = new int[n+1];
		
		for(int i=1;i<=n;i++){
            q[i]=0;
               for(int k=i-1;k>0;k--){
                if(arr.get(k-1).getetime() <= arr.get(i-1).getstime()){
                  q[i]=k;
                  break;
                }
               }
       }
	
	//  for(int i=1;i<=n;i++)
	//	  System.out.print(q[i]+" ");

	 // System.out.println();
		
		
    // using dynamic programming we will get to final solution
		
	  int opt[] = new int[n+1];
	  opt[0] = 0;
	  
      for(int j=1;j<=n;j++)
            opt[j]=Math.max(arr.get(j-1).getcost()+opt[q[j]],opt[j-1]);
	  
		return opt[n];
	}
	
/*	public static void main(String[] args){
		testProblem2();
	}
*/
}
