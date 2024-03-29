package fizz.buzz

class FizzBuzz {
    static def execute(int value) {
        if (isFizzAndBuzz(value))'fizzbuzz'
        else if (isFizz(value)) 'fizz'
        else if (isBuzz(value)) 'buzz'
        else value
    }

    private static boolean isFizzAndBuzz(int value) {
        value % 3 == 0 && value % 5 == 0
    }

    private static boolean isFizz(int value) {
        value % 3 == 0
    }

    private static boolean isBuzz(int value) {
        value % 5 == 0
    }
}
