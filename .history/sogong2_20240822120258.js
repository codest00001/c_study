class Person {
    //Private fields (캡슐화)
    #name;
    #age

    constructor(name, age){
        this.#name = name;
        this.#age = age;
    }

    //Public method to access private fields
    getName(){
        return this.#name;
    }

    getAge(){
        return this.#age;
    }

    //Public method to modify private fields
    setName(name){
        this.#name = name;
    }

    setAge(age){
        if (age > 0) {
            this.#age = age;
        }else {
            console.log('Invalid age');
        }
    }
}

const person = new Person('John', 30);
const person2 = new Person('JACK',55);
console.log(person.getName()); //John
person.setAge(35);
console.log(person.getAge()); //35