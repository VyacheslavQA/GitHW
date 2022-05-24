package lesson6;

import java.util.Random;

public class HW6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Senya");
        Cat cat2 = new Cat("Persik");

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Fire");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(255);
        dog1.swim(7);


        System.out.println();

        cat1.run(165);
        cat1.swim(4);

    }

    public static class Animals {//super class
        protected String name;
        protected String type;
        protected int maxRun;
        protected int maxSwim;

        public Random random = new Random();

        public Animals(String name){
            this.name = name; // при создании объекта нужно ввести имя
        }

        public void run(int dist) { // выводит инфо об объекте относительно действия
            if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't run so far.");
        }

        public void swim(int dist) {// выводит инфо об объекте относительно действия
            if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't swim so far.");
        }

        public void jump(double height) {// выводит инфо об объекте относительно действия

            System.out.println(this.type + " " + this.name +  + height + " m.");

        }

        public void info() { // выводит сведения об объекте в разрезе дейсвтий
            System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + "  ");
        }
    }

    public static class Cat extends Animals {//наследующий класс
        public Cat(String name) {
            super(name);// наследуюемый признак

            this.maxRun = random.nextInt(35) + 75;
            this.type = "Cat";
        }

        @Override
        public void swim(int dist) {
            System.out.println("Cat's no swim!");
        }
    }

    public static class Dog extends Animals {//наследующий класс
        public Dog(String name) {
            super(name);
            this.type = "Dog";
            this.maxRun = random.nextInt(150) + 350;
            this.maxSwim = random.nextInt(3) + 6;

        }
    }
}




