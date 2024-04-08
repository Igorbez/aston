class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull = false;

    public Cat() {
        super();
    }

    public void eat(int amount) {
        if (amount >= 0) {
            System.out.println("Кот поел.");
            isFull = true;
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}