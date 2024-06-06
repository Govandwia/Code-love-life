class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
    
    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Referensi superkelas menjadi referensi subkelas
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Referensi subkelas menjadi referensi superkelas
            dog.wagTail(); // Panggil metode spesifik subkelas
        }
    }
}
