import java.util.HashMap;
import java.util.Map;

class ParkingSystem {
    public Map< Integer, Integer> slots = new HashMap();

    public ParkingSystem(int big, int medium, int small) {
        slots.put(1,big);
        slots.put(2,medium);
        slots.put(3,small);
        
    }
    
    public boolean addCar(int carType) {
        Integer val = slots.get(carType);
        try {
            if (val > 0) {
                slots.put(carType, slots.get((carType) - 1));
                return true;
            }
        }catch (Exception exception){
            
        }
        return  false;
    }
}


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
