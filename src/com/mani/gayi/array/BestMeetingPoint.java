
package com.mani.gayi.array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Date 22/07/2016
 * 
 * @author Manidhar
 * 
 *         A group of two or more people wants to meet and minimize the total
 *         travel distance. You are given a 2D grid of values 0 or 1, where each
 *         1 marks the home of someone in the group. The distance is calculated
 *         using Manhattan Distance, where distance(p1, p2) = |p2.x - p1.x| +
 *         |p2.y - p1.y|. Find the total distance that needs to be travelled to
 *         reach this meeting point.
 * 
 *         Time complexity O(m*n) Space complexity O(m + n)
 *         http://yuanhsh.iteye.com/blog/2192671
 *         https://leetcode.com/problems/best-meeting-point/
 */

		// For example, given three people living at (0,0), (0,4), and (2,2):
//			1 - 0 - 0 - 0 - 1
//			|   |   |   |   |
//			0 - 0 - 0 - 0 - 0
//			|   |   |   |   |
//			0 - 0 - 1 - 0 - 0
		// The point (0,2) is an ideal meeting point, as the total travel
		// distance of 2+2+2=6 is minimal. So return 6.+

		// problem solving idea:

		// "In order to ensure the minimum total length , as long as we try not to repeat each of the paths on the line , 
		//such as 1-> 2-> 3 < -4 of this one-dimensional case, manidif the starting point is 1, 2 and 4 , 
		// that 2-> 3 and 1- > 2-> 3 the two paths will have to repeat the order to try to ensure the right of the dot left, 
		//point left to go to the right , then we should go to these intermediate points as the intersection point . 
		//Because it is Manhattan distance , we can calculate separate horizontal and vertical coordinates , the result is the same. 
		//Therefore, we calculated the midpoint of each of the horizontal distance between the horizontal axis , 
		//with each ordinate distance to the midpoint of the ordinate is the result . "
		// +you
public class BestMeetingPoint {
	public int minTotalDistance(int[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		List<Integer> vertical = new ArrayList<>();
		List<Integer> horizontal = new ArrayList<>();

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					System.out.println("Values of horizontal "+j);
					System.out.println("Values of vertical "+i);
					vertical.add(i);
					horizontal.add(j);
				} 
			}
		}

		Collections.sort(vertical);
		Collections.sort(horizontal);

		int size = vertical.size() / 2;
		int x = vertical.get(size);
		int y = horizontal.get(size);
		int distance = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					distance += Math.abs(x - i) + Math.abs(y - j);
				}
			}
		}

		return distance;
	}

	public static void main(String args[]) {
		BestMeetingPoint bmp = new BestMeetingPoint();
		int[][] grid = { { 1, 0, 0, 0, 1 }, 
						 { 0, 0, 0, 0, 0 },
						 { 0, 0, 1, 0, 0 } };
		System.out.print(bmp.minTotalDistance(grid));
	}
}
