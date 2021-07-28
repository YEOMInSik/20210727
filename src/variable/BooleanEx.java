package variable;

public class BooleanEx {
//    boolean power = false; // 선언과 초기화 동시에 가능
    boolean power;
    //    power = false; 초기화만 따로 할수 없다 ,선언만 가능
    void turn() {
        boolean onOff;  //지역변수에서는 선언과 초기화를 따로 할 수 있다.
        onOff = true;
        power = !power;
        System.out.println(power);

    }
    public static void main(String[] args){
        BooleanEx booleanEx = new BooleanEx(); //new를 만나면 멤버변수가 기본값으로 초기화 된다
        booleanEx.turn();
        booleanEx.turn();
        booleanEx.turn();
        booleanEx.turn();
        booleanEx.turn();
    }
}

