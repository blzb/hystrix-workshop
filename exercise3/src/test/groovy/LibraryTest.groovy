/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'apimentel' at '3/30/16 1:16 AM' with Gradle 2.7
 *
 * @author apimentel, @date 3/30/16 1:16 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
