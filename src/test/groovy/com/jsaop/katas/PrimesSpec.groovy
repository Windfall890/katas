package com.jsaop.katas

import spock.lang.Specification
import spock.lang.Unroll

class PrimesSpec extends Specification {

    @Unroll
    def "primes of #n are #primes"() {
        expect:
            Primes.of(n).sort() ==  primes.sort()
        where:
            n | primes
            0 | []
            1 | []
            2 | [2]
            3 | [3]
            4 | [2,2]
            5 | [5]
            6 | [2,3]
            7 | [7]
            8 | [2,2,2]
            9 | [3,3]
            2*2*3*2*5*7*2017*2 | [2,2,2,3,5,7,2017,2]
    }
}