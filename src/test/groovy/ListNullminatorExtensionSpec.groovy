import org.grails.web.json.JSONArray
import spock.lang.Specification

class ListNullminatorExtensionSpec extends Specification {

    //ArrayList
    def "List which contains all variations of null"(){
        given:
        List myList = [null, "null", 'null', "hello"]

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "List with one null string"(){
        given:
        List myList = ["null", "hello"]

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "List with one null character string"(){
        given:
        List myList = ['null', "hello"]

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "Empty list"(){
        given:
        List myList = []

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 0
    }

    //LinkedList
    def "Linked List which contains all variations of null"(){
        given:
        List myList = new LinkedList()
        myList.add(null)
        myList.add('null')
        myList.add("null")
        myList.add("hello")

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "Linked List with one null string"(){
        given:
        List myList = new LinkedList()
        myList.add("null")
        myList.add("hello")

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "Linked List with one null character string"(){
        given:
        List myList = new LinkedList()
        myList.add('null')
        myList.add("hello")

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "Empty linked list"(){
        given:
        List myList = new LinkedList()

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 0
    }

    //JSON Array
    def "JSON Array which contains all variations of null"(){
        given:
        List myList = new JSONArray()
        myList.add(null)
        myList.add('null')
        myList.add("null")
        myList.add("hello")

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "JSON Array with one null string"(){
        given:
        List myList = new JSONArray()
        myList.add("null")
        myList.add("hello")

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "JSON Array with one null character string"(){
        given:
        List myList = new JSONArray()
        myList.add('null')
        myList.add("hello")

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 1
    }

    def "Empty JSON Array"(){
        given:
        List myList = new JSONArray()

        when:
        myList = myList.removeAllTheNulls()

        then:
        myList.size() == 0
    }
}
