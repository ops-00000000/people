fun main(){
    val likes = 11
    if (likes == 11){
        println("Понравилось $likes людям")
    }
    else if (likes % 100 == 11){
        println("Понравилось $likes людям")
    }
    else if (likes % 2 == 0) {
        println("Понравилось $likes людям")
    }
    else{
        println("Понравилось $likes человекам")
    }
}