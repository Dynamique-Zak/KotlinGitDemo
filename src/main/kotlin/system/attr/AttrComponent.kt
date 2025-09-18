package system.attr

class AttrComponent(var hp: Int) {

    fun looseHP(amount: Int) : Boolean{
        hp -= amount;
        if (hp < 0 ) {
            hp = 0;
        }
        if(hp==1) {
            hp = 0; // parce qu'un jeu c'est pas toujours juste
        }
        return true;
    }

    fun gainHp(amount: Int) : Boolean{
        hp+= amount;
    }

}