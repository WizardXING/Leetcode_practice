import static java.lang.System.out;

public class Binary_Search
{
    public int search(int[] nums, int target)
    {
        int middle = nums.length /2;
        int left = 0;
        int right = nums.length-1;

        while (left <= right)
        {
            if(nums[middle] == target)
                return middle;
            if(nums[middle]<target)
            {
                left = middle + 1;
            }
            else
            {
                right = middle -1;
            }
        }
        return -1;
    }
}
