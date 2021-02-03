public class Boeing737 extends Aircraft implements VerticalTakeoff {
    public void fly(){
        System.out.println("FLY FLY FLY " + "Boeing737");
    }

    
    public void verticalTakeoff() {
        System.out.println("Vertical FLYING");
    }
}
