import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.example.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Epic("TAJ")
@Tag("aaa")
public class TestCheckNameToEmboss {


    @DisplayName("Параметризированная проверка: можно ли напечатать строку на карте")
    @ParameterizedTest(name = "Проверка имени: {0}, {1}")
    @CsvSource({
            "'Антошка Картошка', true",
            "'Ан', false",
            "'КартошкаКартошкаКарт', false",
            "' Антошка Картошка ', false",
            "'АнтошкаКартошка', false",
            "'Антошка  Картошка', false"
    })
    @Step("Проверка")
    void check(String name, boolean expected) {
        Assertions.assertEquals(expected, new Account(name).checkNameToEmboss());
    }
}

