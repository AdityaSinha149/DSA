/**
 * Definition for a street.
 * class Street {
 *     public Street(int[] doors);
 *     public void openDoor();
 *     public void closeDoor();
 *     public boolean isDoorOpen();
 *     public void moveRight();
 *     public void moveLeft();
 * }
 */
class Solution {
    public int houseCount(Street street, int k) {
        for(int i=0;i<k;i++){
            if(street.isDoorOpen()==true)street.closeDoor();
            street.moveRight();
        }
        int cnt=0;
        while(street.isDoorOpen()==false){
            street.openDoor();
            cnt++;
            street.moveRight();
        }
        return cnt;
    }
}