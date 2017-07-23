package com.jsaop.katas

import spock.lang.Specification


class StackSpec extends Specification {

    Stack stack

    def pushNTimes(int n) {
        for (int i = 1; i <= n; i++) {
            stack.push(i)
        }
    }

    def popNTimes(int n) {
        def pops = []
        for (int i = 1; i <= n; i++) {
            pops.add(stack.pop())
        }
        return pops
    }

    void setup() {
        stack = new Stack()

    }

    def "new stack is empty"() {
        expect:
            stack.empty == true
    }

    def "empty stack size is 0"() {
        expect:
            stack.size() == 0
    }

    def "push to stack size is now 1"() {
        when:
            stack.push(8)
        then:
            stack.size() == 1
    }

    def "pushed stack is not empty"() {
        when:
            stack.push(2)
        then:
            stack.empty == false
    }

    def "push twice size is 2"() {
        when:
            stack.push(8)
            stack.push(8)
        then:
            stack.size() == 2

    }

    def "pop on empty stack throws error"() {
        when:
            stack.pop()
        then:
            thrown(IllegalStateException)
    }

    def "stack size 1 after pop size is 0 "() {
        given:
            stack.push(8)
        when:
            stack.pop()
        then:
            stack.size() == 0
    }

    def "size after 2 push one pop is 1"() {
        given:
            stack.push(8)
            stack.push(8)
        when:
            stack.pop()
        then:
            stack.size() == 1
    }

    def "after push '8' pop returns 8"() {
        when:
            stack.push(8)
        then:
            stack.pop() == 8
    }

    def "push '8' and '7' pop returns '7' then '8'"() {
        when:
            stack.push(8)
            stack.push(7)
        then:
            stack.pop() == 7
            stack.pop() == 8
    }

    def "push starting cap9acity times doesn't throw error"() {
        when:
            pushNTimes(Stack.STARTING_CAPACITY)
        then:
            noExceptionThrown()
    }

    def "push above starting capacity works"() {
        when:
            pushNTimes(Stack.STARTING_CAPACITY +2)
        then:
            noExceptionThrown()
    }

    def "pushes and pops"() {

        when:
            stack.push(2)
            stack.push(3)
            stack.push(4)
            stack.pop()
            stack.push(5)
            stack.push(6)
            stack.pop()
            stack.pop()
        then:
            stack.pop() == 3
    }

    def "many pushes then all the pops"() {

        def times = 100
        when:
            pushNTimes(times)
            def pops = popNTimes(times)
        then:
            pops == (times..1).asList()

    }
}