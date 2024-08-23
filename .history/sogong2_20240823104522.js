class Person {
    //Private fields (캡슐화) person으로 바로 접근못하게 하는 것.
    //getter setter를 통해서 불러들어야함
    //제한자 #. person.#name으로 바로 못불러옴. #을 빼면 퍼블릭. 접근가능해짐.
    
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
const person2 = new Person('Amy', 55); //Person 붕어빵틀 //person2 붕어빵
console.log(person2.getName()); //John
person.setAge(35); //나이를 30에서 35로 바꾸는 것.
console.log(person.getAge()); //35. 출력하는 것.
person2.setAge(60); //person2의 나이를 55에서 60으로 변경
console.log(person2.getAge()); // person2를 출력 //자바스크립트는 console.log에 따라서 다음줄에 찍힘.

