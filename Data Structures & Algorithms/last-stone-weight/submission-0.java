class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = Arrays.stream(stones).boxed().collect(Collectors.toCollection(() -> new PriorityQueue<>(Collections.reverseOrder())));
        while(queue.size() > 1){
            int x = queue.poll();
            int y = queue.poll();
            if(x==y){
                continue;
            }
            queue.offer(Math.abs(x-y));
        }
        if(queue.size() == 0){
            return 0;
        }
        return queue.peek();
    }
}
