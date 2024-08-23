class Animal {
    makeSound() {
        return "Some generic sound";
    }
}

class Dog extends Animal{
    makeSound(){
        return "Woof!";
    }
}

class Cat extends Animal{
    makeSound(){
        return "Meow!";
    }
}

const animals = [new Dog(), new Cat(), new Animal()];
animals.forEach(animal => {console.log(animal.makeSound());
});