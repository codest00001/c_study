class Animal{
    constructor(name){
        this.name = name;
    }

    move(){
        console.log(`${this.name}is moving`);
    }
}
// 위는 상위개발자들이 만들고

//

// 하단은 초보개발자들이 만드는 경우가 많음.

class Bird extends Animal{
    constructor(name, canFly){
        super(name);
        this.canFly = canFly;
    }

    fly(){
        if(this.canFly) {
            console.log(`${this.name} is flying`);
        }else{
            console.log(`${this.name} can't fly`);
        }}}

        const eagle = new Bird('Eagle', true);
        eagle.move(); // Eagle is moving
        eagle.fly(); // Eagle is flying

        const penguin = new Bird('Penguin' false);
        penguin.move();
        penguin.fly();
