public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Animal[] animals = {dog, cat1, cat2};

        for (Animal animal : animals) {
            animal.run(300);
            animal.swim(5);
        }

        Bowl bowl = new Bowl(10);
        cat1.eat(5);
        cat2.eat(15);

        System.out.println("Сытость кота 1: " + cat1.isFull());
        System.out.println("Сытость кота 2: " + cat2.isFull());

        bowl.addFood(20);
    }
}
