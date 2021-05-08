package org.blt.trappingrainwater;

public class TrappingRainWater {

    public int trap(int[] height) {
        int i = 1, maxLeftIndex = 0, maxRightIndex = 0, water = 0;
        int maxLVal = 0, maxRVal = 0;
        while (i < height.length - 1) {
            if (maxLVal < height[i - 1]) {
                maxLVal = height[i - 1];
                maxLeftIndex = i - 1;
            }
            if (maxRVal < height[i + 1]) {
                maxRVal = height[i + 1];
                maxRightIndex = i + 1;
            } else {
                maxRightIndex = getFistBiggerVal(i + 1, height);
                maxRVal = height[maxRightIndex];
            }

            int min = Math.min(height[maxLeftIndex], height[maxRightIndex]);

            for (int k = maxLeftIndex; k < maxRightIndex - 1; k++) {
                water += Math.abs(min - height[k + 1]);
                i++;
            }
            i++;
        }

        return water;
    }

    public int getFistBiggerVal(int currentIndex, int[] arr) {
        int retVal = currentIndex;
        int mx = arr[retVal];
        for (int i = currentIndex + 1; i < arr.length; i++) {
            if (mx < arr[i]) {
                retVal = i;
                mx = arr[retVal];
            }
        }
        return retVal;
    }
}
