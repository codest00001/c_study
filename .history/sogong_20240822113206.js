class Animal{ //바로 쓰지말고 상속받아서 쓰게 하려는 코드.
    constructor(name) { //생성자. 안 만들면 자동으로 만들어짐.
        if (this.constructor === Animal) { 
            throw new Error("Cannot instantiate abstract class Animal");
        }
        this.name = name; //this는 객체에 대한 스코프를 가짐. const dog의 dog에 대한 스코프를 가짐. 
    }

    //Abstract method
    makeSound() {
        throw new Error("Abstract method 'makeSound' must be implemented");
    }
}

class Dog extends Animal {
    constructor(name){
        super(name); //super : 부모의 name을 불러옴
    }

    makeSound() {
        return "Woof!";
    }
}

const Animal = new Animal('buddy');
const dog = new Dog('Buddy');
console.log(dog.makeSound());
            