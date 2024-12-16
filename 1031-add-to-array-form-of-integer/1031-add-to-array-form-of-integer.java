class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<Integer>(); 
        int carry = 0;
        int n = num.length-1;
        int sum;
        while(k>0||n>=0)
        {
            if(n>=0)
            sum = (k%10) + num[n] + carry;
            else
            sum = (k%10) + carry;
            if(sum>9)
            {
                list.add(sum%10);
                carry = sum/10;
            }
            else
            {
                list.add(sum);
                carry = 0;
            }
            k = k/10;
            n--;
        }
        if(carry!=0)
        list.add(carry);
        List<Integer> newlist=new ArrayList<Integer>();
        int len = list.size()-1;
        for(int i=0; i<list.size(); i++)
        {
            newlist.add(i,list.get(len));
            len--;
        }
        return newlist;
    }
}