import java.util.Arrays;

import static java.lang.System.out;

public class IsAnagram
{
    public boolean isAnagram(String a, String b)
    {
        int[] record = new int[26];

        // 将第一个字符串转化为数组形式
        char[] a_char = a.toCharArray();

        // 将第二个字符串转化为数组形式
        char[] b_char = b.toCharArray();

        for(int i = 0; i<a_char.length; i++)
        {
            record[a_char[i] - 'a']-=1;
        }

        for(int i = 0; i<b_char.length; i++)
        {
            record[b_char[i] - 'a']+=1;
        }

        for(int i = 0; i < record.length; i++)
        {
            if(record[i]!=0)
                return false;
        }

        return true;

    }
    public static void main(String[] args)
    {
        String a = "aaa";
        String b = "aaa";

        IsAnagram test  = new IsAnagram();
        out.println(test.isAnagram(a, b));
    }
}
