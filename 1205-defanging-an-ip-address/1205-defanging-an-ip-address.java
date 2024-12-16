class Solution {
    public String defangIPaddr(String address) {
        String new_address = "";
        for(int i=0; i<address.length(); i++)
        {
            if(address.charAt(i)=='.')
            {
                new_address = new_address + "[.]";
            }
            else
            {
                new_address = new_address + address.charAt(i);
            }
        }
        return new_address;
    }
}