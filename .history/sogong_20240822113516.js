class Animal{ //바로 쓰지말고 상속받아서 쓰게 하려는 코드. 각 하위 클래스가 공통의 기반을 가지면서도, 자신만의 고유한 기능을 추가로 구현해야 하는 경우.
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

// const animal = new Animal('Buddy'); //이렇게 넣으면 Cannot instantiate abstract class Animal 이 에러가 발생함
const dog = new Dog('Buddy');
console.log(dog.makeSound());
            