package system.attr

class AttrComponent(var hp: Int) {

    fun looseHP(amount: Int) : Boolean{
        hp -= amount;
        if (hp < 0 ) {
            hp = 0;
        }
        // TODO : Empecher négatif (ex hp devient -58)
        return true;
    }
}