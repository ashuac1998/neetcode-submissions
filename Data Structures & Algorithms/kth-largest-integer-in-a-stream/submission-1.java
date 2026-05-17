class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.pq = Arrays.stream(nums).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        this.k = k;
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size() > this.k){
            pq.poll();
        }        
        return pq.peek();
    }           
}
