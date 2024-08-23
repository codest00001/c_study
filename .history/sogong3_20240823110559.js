class Animal{
    constructor(name){
        this.name = name;
    }
    move(){
        console.log(`${this.name} is moving`);
            }
  
}
// 위는 상위개발자들이 만들고
// 하단은 초보개발자들이 만드는 경우가 많음.
// 다른 개발자들이 위의 Animal 코드 가져다 쓸 수 있음

class Bird extends Animal{
    constructor(name, canFly, canLAUGH){
        super(name);
        this.canFly = canFly;
        this.canLAUGH = canLAUGH;
    }

    fly(){
        if(this.canFly) {
            console.log(`${this.name} is flying`);
        }else{
            console.log(`${this.name} can't fly`);
        }}

    LAUGH(){
            if(this.canLAUGH) {
                console.log(`${this.name} is LAUGHING`);
            }else{
                console.log(`${this.name} can't LAUGH`);
            }}}


        const eagle = new Bird('Eagle', true, true);
        eagle.move(); // Eagle is moving
        eagle.fly(); // Eagle is flying
        eagle.LAUGH();

        const penguin = new Bird('Penguin', false);
        penguin.move(); // Penguin is moving
        penguin.fly(); // Penguin can't fly

        const chicken = new Bird('Chicken',false);
        chicken.moveee();
        chicken.smile();
        chicken.fly();
