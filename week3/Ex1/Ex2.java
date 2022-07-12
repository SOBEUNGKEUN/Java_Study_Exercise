public class EX2 implements EX2IF1, EX2IF2{

    @Override
    public void start() {
        System.out.println("자동차 출발");
    }

    @Override
    public void stop() {
        System.out.println("자동차 정지");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("자동차 속도설정 : "+speed);
    }

    @Override
    public void turn(int degree) {
        System.out.println("자동차 방향설정 : "+degree);
    }

    @Override
    public void model(String model) {
        System.out.println("자동차 브랜드 : "+model);
    }

    @Override
    public void color(String color) {
        System.out.println("자동차 생상 : "+color);
    }

    @Override
    public void year(int year) {
        System.out.println("자동차 연식 :" +year);
    }

    public static void main(String[] args){
        EX2 car = new EX2();
        car.start();
        car.setSpeed(20);
        car.turn(15);
        car.stop();
        System.out.println("======================");
        car.model("벤츠");
        car.color("빨강");
        car.year(2018);
    }
}
