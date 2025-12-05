class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 1;
        int n = digits.length - 1;
        while(n >= 0){
            int sum = digits[n] + carry;
            if(sum <= 9){
                list.add(sum);
                carry = 0;
            }
            else{
                if(n!=0){
                    sum = 0;
                    list.add(sum);
                }
                else{
                    sum = 0;
                    list.add(sum);
                    list.add(1);
                }
            }
            n--;
        }
        int[] result = new int[list.size()];
        int reverse = result.length - 1;
        for(int i=0; i<result.length; i++){
            result[reverse] = list.get(i);
            reverse--;
        }
        return result;
    }
}