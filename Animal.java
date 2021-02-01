


abstract class Animal {


        protected int _a;



        public void run ( int a){
            System.out.println("Животное бежит");

        }

        public void swim ( int a){
            System.out.println("Животное плывет");
        }

        static void showResult (Object obj,boolean result){
            System.out.println(obj.getClass().getName() + ":" + result);
        }
    }

