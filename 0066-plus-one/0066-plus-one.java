class Solution 
{
    public int[] plusOne(int[] digits)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = digits.length - 1;
        int sum = (digits[n] + 1);
        int carry = sum/10;
        list.add(sum%10);
        n--;
        if(n>=0)
        {
            while(n>=0)
            {
                sum = digits[n] + carry;
                list.add(sum%10);
                carry = sum/10;
                n--;
            }
        }
        if(carry!=0)
        list.add(carry);
        int arr[] = new int[list.size()];
        int count = 0;
        for(int i=list.size() - 1; i>=0; i--)
        {
            arr[count] = list.get(i);
            count++;
        }
        return arr;
    }
}