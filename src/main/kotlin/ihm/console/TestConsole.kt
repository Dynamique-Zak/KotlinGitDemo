package ihm.console

import system.attr.AttrComponent

class TestConsole {

    fun start(){
        var attrComponent = AttrComponent(hp = 100)

        println("A ${attrComponent.hp} HP");

        // je fais perdre 30 pv
        attrComponent.looseHP(30)
        println("Les pv sont à ${attrComponent.hp} HP");


        // je fais perdre 200 pv
        attrComponent.looseHP(200)
        println("Les pv sont à ${attrComponent.hp} HP");
    }
}