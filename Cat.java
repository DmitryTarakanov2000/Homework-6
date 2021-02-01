public class Cat extends Animal {

    @Override
    public void run(int a) {
        System.out.println("Кот бежит");
        boolean result = a <=200;
        if (result) _a = a;
        showResult(this, result);

    }


}
