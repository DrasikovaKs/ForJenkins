import org.example.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestCheckNameToEmboss {


    @ParameterizedTest
    @CsvSource({
            "'Антошка Картошка', true",
            "'Ан', false",
            "'КартошкаКартошкаКарт', false",
            "' Антошка Картошка ', false",
            "'АнтошкаКартошка', false",
            "'Антошка  Картошка', false"
    })
    void check(String name, boolean expected) {
        Assertions.assertEquals(expected, new Account(name).checkNameToEmboss());
    }

}
