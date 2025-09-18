package system.attr

class AttrComponent(var hp: Int) {

    fun looseHP(amount: Int) : Boolean{
        hp -= amount;
        // TODO : Empecher négatif (ex hp devient -58)
        return true;
    }
}