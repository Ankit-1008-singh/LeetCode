import java.util.PriorityQueue;

public class problem1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) {
                minHeap.add(diff);
                if (minHeap.size() > ladders) {
                   
                    bricks -= minHeap.poll();
                }
                if (bricks < 0) {
                    return i;
                }
            }
        }
        // We reached the last building
        return heights.length - 1;
    }
}
