class Solution {
    public int maxDistance(String s, int k) {
        int result = 0;
        int north = 0, south = 0, east = 0, west = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case 'N':
                north++;
                break;
                case 'S':
                south++;
                break;
                case 'E':
                east++;
                break;
                case 'W':
                west++;
                break;
                default:
                break;
            }

            int x = Math.abs(north - south);
            int y = Math.abs(east - west);

            int MD = x + y;
            int maxDistance = MD + Math.min(2*k, (i+1)-MD);
            result = Math.max(result, maxDistance);
        }
        return result;
    }
}