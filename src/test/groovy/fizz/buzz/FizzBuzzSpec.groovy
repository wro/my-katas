package fizz.buzz

import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def "test"() {
        expect:
        FizzBuzz.execute(value) == expected

        where:
        value | expected
        1     | 1
        2     | 2
        3     | 'fizz'
        4     | 4
        5     | 'buzz'
        6     | 'fizz'
        7     | 7
        8|8
        9|'fizz'
        10|'buzz'
        11|11
        12|'fizz'
        13|13
        14|14
        15|'fizzbuzz'
        16|16
        17|17
        18|'fizz'
        19|19
        20|'buzz'
        21|'fizz'
        22|22
        23|23
        24|'fizz'
        25|'buzz'
        26|26
        27|'fizz'
        28|28
        29|29
        30|'fizzbuzz'
        31|31
        32|32
        33|'fizz'
    }

}
