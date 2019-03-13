
import main.junitstudy.fabrics.PersonFabric;
import main.junitstudy.fabrics.SchoolAiFabric;
import main.junitstudy.persons.Person;
import main.junitstudy.persons.schoolpersons.Director;
import main.junitstudy.persons.schoolpersons.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class SchoolAiFabricTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before each schoolaifabrictest");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each schoolaifabrictest");

    }
    @DisplayName("Fabric make Student")
    @ParameterizedTest
    @ValueSource(ints = {0, 10, 18})
    void makeStudent(int age) {
        PersonFabric personFabric = new SchoolAiFabric();
        Person person = personFabric.makePerson(age);
        assertEquals(Student.class, person.getClass());
    }

    @DisplayName("Fabric make Director")
    @ParameterizedTest
    @ValueSource(ints = {50, 100})
    void makeDirector(int age) {
        PersonFabric personFabric = new SchoolAiFabric();
        Person person = personFabric.makePerson(age);
        assertEquals(Director.class, person.getClass());
    }

    @DisplayName("Fabric make IllegalAgePerson")
    @ParameterizedTest
    @ValueSource(ints = {-1, -100, 250})
    void makeIllegalAge(int age) {
        PersonFabric personFabric = new SchoolAiFabric();
        assertThrows(IllegalArgumentException.class,() -> {
            personFabric.makePerson(age);
        } );
    }


}