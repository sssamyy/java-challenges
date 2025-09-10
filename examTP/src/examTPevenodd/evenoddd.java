package examTPevenodd;


class evenoddd
{
    static void evenoddd(int t[])
    {
        
        int left = 0, right = t.length - 1;
        while (left < right)
        {
            while (t[left]%2 == 0 && left < right)
                left++;
 
            while (t[right]%2 == 1 && left < right)
                right--;
 
            if (left < right)
            {
                int temp = t[left];
                t[left] = t[right];
                t[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main (String[] args)
    {
         int t[] = {7, 2, 7, 1, 2, 3, 8, 1,2,3,4,5 };
        System.out.print("tableau avant traitement ");
        for (int i = 0; i < t.length; i++)
            System.out.print(t[i]+" ");
 
        evenoddd(t);
 
        System.out.print("tableau apres traitement ");
        for (int i = 0; i < t.length; i++)
            System.out.print(t[i]+" ");
    }
}