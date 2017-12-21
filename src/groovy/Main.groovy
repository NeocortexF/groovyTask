package groovy

/**
 * Имеется массив чисел, все элементы которого являются четными числами,
 * и один элемент – нечетное число. Написать функцию, возвращающую это нечетное число.
 */

class Main {

    def integerArray = new Integer[10]

    Integer[] fillArray(){
        integerArray = [14, 22, 48, 64, 32, 20, 80, 33, 42, 44]
    }

    def extractOddNumber(Integer[] data) {
        data.each { element ->
            if (element % 2 != 0) {
                println("Нечетное число = " + element)
            }
        }
    }

    static void main(String[] args){
        Main main = new Main()
        main.extractOddNumber(main.fillArray())
    }
}
