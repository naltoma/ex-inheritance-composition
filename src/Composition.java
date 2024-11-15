/* 合成の例：DogクラスがAnimalクラスを内部で使用する形でクラスを作成
 */

// Animalクラス
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return "Some sound";
    }

    public String getName() {
        return name;
    }
}

// DogクラスがAnimalクラスを合成する
class Dog {
    private Animal animal;

    public Dog(String name) {
        this.animal = new Animal(name);  // Animalのインスタンスを持つ
    }

    public String speak() {
        return "Woof!";
    }

    public String getName() {
        return animal.getName();
    }
}

// 使用例
public class Composition {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.getName()); // "Buddy"
        System.out.println(dog.speak());   // "Woof!"
    }
}
