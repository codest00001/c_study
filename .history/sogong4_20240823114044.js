//객체지향의 특징 중 다형성의 예시코드

class Animal {
    makeSound() {
        return "Some generic sound";
    }

    eatFood() {
        return "Eat everything";
    }
}

class Dog extends Animal{
    makeSound(){
        return "Woof!";
    }
    eatFood(){
        return "MEAT";
    }
}

class Cat extends Animal{
    makeSound(){
        return "Meow!";
    }
    eatFood(){
        return "FISH";
    }
}

const animals = [new Dog(), new Cat(), new Animal()];
animals.forEach(animal => 
    {console.log(animal.makeSound());});

    animals.forEach(animal => 
        {console.log(animal.eatFood());});
