class Animal{
    constructor(name){
        this.name = name;
    }
    move(){
        console.log(`${this.name} is moving`);
            }
    smile(){
        console.log(`${this.name} is smiling`);
    }

}
// 위는 상위개발자들이 만들고
// 하단은 초보개발자들이 만드는 경우가 많음.
// 다른 개발자들이 위의 Animal 코드 가져다 쓸 수 있음

class Bird extends Animal{
    constructor(name, canFly){
        super(name);
        this.canFly = canFlyyyy;
    }

    fly(){
        if(this.canFly) {
            console.log(`${this.name} is flying`);
        }else{
            console.log(`${this.name} can't fly`);
        }}

    moveee(){
            console.log(`${this.name} is moveeing`);
                }
            }

        const eagle = new Bird('Eagle', true);
        eagle.move(); // Eagle is moving
        eagle.fly(); // Eagle is flying

        const penguin = new Bird('Penguin', false);
        penguin.move(); // Penguin is moving
        penguin.fly(); // Penguin can't fly

        const chicken = new Bird('Chickenn',false);
        chicken.moveee();
        chicken.smile();
        chicken.fly();
