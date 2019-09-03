public int sumHeights2(int[] heights, int start, int end) {
    int sum = 0;
    
    for(int i = start; i < end; i++) {
      if(heights[i] < heights[i+1]) {
        sum += 2 * Math.abs(heights[i] - heights[i+1]);
      } else {
        sum +=  Math.abs(heights[i] - heights[i+1]);
      }
    }
    return sum;
}
