package ihm.console

import system.attr.AttrComponent

class TestConsole {

    fun start(){
        var attrComponent = AttrComponent(hp = 100)

        print("A ${attrComponent.hp} HP");

        // TODO lui faire perdre des vies
    }
}