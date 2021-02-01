public class Dog extends Animal {



        @Override
        public void swim ( int a){
            System.out.println("Собака плывет");
            boolean result = a <= 10;
            if (result) _a = a;
            showResult(this, result);
        }

        @Override
        public void run ( int a){
            System.out.println("Собака бежит");
            boolean result = a <= 500;
            if (result) _a = a;
            showResult(this, result);

        }
    }

