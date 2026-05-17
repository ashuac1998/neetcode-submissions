/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(new Comparator<Interval> () { public int compare(Interval a, Interval b) { return a.start - b.start;}});
        for(Interval interval : intervals){
            pq.add(interval);
        }
        while(pq.size() > 1){
            Interval top = pq.remove();
            if(top.end > pq.peek().start){
                return false;
            }
        }
        return true;
    }
}
