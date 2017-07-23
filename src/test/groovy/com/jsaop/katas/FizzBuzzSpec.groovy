package com.jsaop.katas

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzSpec extends Specification {

    @Unroll
    def "fizzBuzz of #n returns #fb"() {

        expect:
            FizzBuzz.buzzFizz(n).contains(fb)

        where:
            n | fb
            1 | "1"
            2 | "1\n2"
            3 | "1\n2\nfizz"
            4 | "1\n2\nfizz\n4"
            5 | "1\n2\nfizz\n4\nbuzz"
            6 | "1\n2\nfizz\n4\nbuzz\nfizz"
            7 | "1\n2\nfizz\n4\nbuzz\nfizz\npop"
            8 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8"
            9 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz"
            10 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz\nbuzz"
            11 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz\nbuzz\n11"
            12 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz\nbuzz\n11\nfizz"
            13 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz\nbuzz\n11\nfizz\n13"
            14 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz\nbuzz\n11\nfizz\n13\npop"
            15 | "1\n2\nfizz\n4\nbuzz\nfizz\npop\n8\nfizz\nbuzz\n11\nfizz\n13\npop\nfizzbuzz"
    }

    def "fizzbuzz 105"() {

        given:
            println FizzBuzz.buzzFizz(105)
        expect:
            true

    }
}