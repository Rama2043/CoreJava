package Assignments.leetcode;

public class CountTotalNumberOfColoredCells2579 {
    public long coloredCells(int n) {
        return (long)(Math.pow(n,2) + Math.pow(n-1,2));
    }
}
class Color{
    public static void main(String[] args) {
        CountTotalNumberOfColoredCells2579 c = new CountTotalNumberOfColoredCells2579();
        System.out.println(c.coloredCells(2));
    }
}
