public class EX1 implements EX1IF {

    @Override
    public void info() {
        System.out.println("메소드 재정의");
    }

    @Override
    public void name(String name) {
        System.out.println("이름 메소드 재정의 " + name);
    }

    @Override
    public void address(String address, int addressNum) {
        System.out.println("주소 메소드 재정의 "+address+" "+addressNum);
    }

    public static void main(String[] args){
        EX1 ex = new EX1();
        ex.info();
        ex.name("소병권");
        ex.address("서울", 10);

    }
}
