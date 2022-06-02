import java.util.*

class Student(var name : String, var birthYear : Int) {

    var age : Int = -1
    get() {
        return Date(System.currentTimeMillis()).year - birthYear
    }

}


//4
class Point(var x: Int, var y: Int) {  //primary constructor

    var color: String = ""
        set(value) {
            println("Point set called")
            if (value in arrayOf("Blue", "Black", "Red", "White", "Pink", "Indigo")) field = value
        }
        get() = "Color is $field"

    init {
        println("Point init block")
        if (this.x < 0) this.x = Math.abs(this.x)
        if (this.y < 0) this.y = Math.abs(this.y)
        color = "Pink"

    }

    constructor() : this(0, 0) {
        println("constructor()")
    }

    constructor(cor: Int) : this(cor, cor) {
        println("constructor(Int)")
    }

    fun display() = println("x = $x y = $y color = $color")

}

//3
/*class Point(var x : Int, var y : Int) {  //primary constructor

    init {
        println("Point init block")
        if(this.x < 0) this.x = Math.abs(this.x)
        if(this.y < 0) this.y = Math.abs(this.y)

    }

    constructor() : this(0, 0) {
        println("constructor()")
    }

    constructor(cor : Int) : this(cor, cor) {
        println("constructor(Int)")
    }

    fun display() = println("x = $x y = $y")

}*/

//2
/*class Point(private var x : Int, private var y : Int) {  //primary constructor

    init {
        println("Point init block")
        if(this.x < 0) this.x = Math.abs(this.x)
        if(this.y < 0) this.y = Math.abs(this.y)

    }

    fun display() {
        println("x = $x y = $y")
    }

}*/

//1
/*
class Point {
    private var x : Int
    private var y : Int

    //secondary constructor
    constructor() {
        x = 0
        y = 0
    }

    //secondary constructor
    constructor(x : Int, y : Int) {
        if(x >= 0) this.x = x else this.x = 0
        if(y >= 0) this.y = y else this.,y = 0
    }

    fun setX(x : Int)  {
        this.x = x
    }

    fun getX() : Int {
        return x
    }

    fun setY(y : Int) {
        this.y = y
    }

    fun getY() : Int {
        return y
    }

    fun display() {
        println("x = $x y = $y")
    }
}*/
