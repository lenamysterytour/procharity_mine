package procharity.tests.registerAsFoundation;

import com.github.javafaker.Faker;

public class PhoneTestData {

    Faker faker = new Faker();
    public final String phoneInvalidLength9 = "726351232";
    public final String phoneValidLength10 = "7263512326";
    public String phoneInvalidHugeLength = faker.numerify("####################################################################################################");
    public final String phoneInvalidLength11 = "72635123263";
    public final String phoneInvalidLength0 = "";
    public final String phoneInvalidSymbolsCyrillic = "телефон";
    public final String phoneInvalidSymbolsLatin = "phone";
    public final String phoneInvalidSymbolsSpecialSymbols = "%^*($#^";
}
