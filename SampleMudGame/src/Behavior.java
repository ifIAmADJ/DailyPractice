abstract class Behavior{
//抽象类，无法实例化。
        static void run(double distance) //static修饰，禁止修改。
        {
            System.out.println("I have ran"+distance+"meters.");
        }

        static void run(int distance)
        {
            System.out.println("I have ran"+distance+"meters.");  //方法重载。
        }

        static int jump(int distance)
        {
            System.out.println("I have jumped "+distance+" meters.");
            return distance;
        }

        static double jump(double distance)
        {
            System.out.println("I have jumped "+distance+" meters");
            return distance;
        }
    }



