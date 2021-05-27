import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class GetIntersection
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int num : nums1)
        {
            set1.add(num);
        }

        for(int num: nums2)
        {
            set2.add(num);
        }

        return getIntersection(set1, set2);
    }

    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> intersectionSet = new HashSet<Integer>();

        for(int num:set1)
        {
            if(set2.contains(num))
            {
                intersectionSet.add(num);
            }
        }

        int[] intersection = new int[intersectionSet.size()];
        for(int i = 0; i< intersectionSet.size(); i++)
        {
            intersection[i] = intersectionSet.iterator().next();
        }

        return intersection;
    }
}
