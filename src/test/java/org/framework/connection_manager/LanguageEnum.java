package org.framework.connection_manager;

public enum LanguageEnum {
    AFRIKAANS("af"),
    ALBANIAN("al"),
    ARABIC("ar"),
    AZERBAIJANI("az"),
    BULGARIAN("bg"),
    CATALAN("ca"),
    CZECH("cz"),
    DANISH("da"),
    GERMAN("de"),
    GREEK("el"),
    ENGLISH("en"),
    BASQUE("eu"),
    PERSIAN_FARSI("fa"),
    FINNISH("fi"),
    FRENCH("fr"),
    GALICIAN("gl"),
    HEBREW("he"),
    HINDI("hi"),
    CROATIAN("hr"),
    HUNGARIAN("hu"),
    INDONESIAN("id"),
    ITALIAN("it"),
    JAPANESE("ja"),
    KOREAN("kr"),
    LATVIAN("la"),
    LITHUANIAN("lt"),
    MACEDONIAN("mk"),
    NORWEGIAN("no"),
    DUTCH("nl"),
    POLISH("pl"),
    PORTUGESE("pt"),
    PORTUGESE_BRASIL("pt_br"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SWEDISH("sv"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SPANISH("sp"),
    SERBIAN("sr"),
    THAI("th"),
    TURKISH("tr"),
    UKRANIAN("ua"),
    VIETNAMESE("vi"),
    CHINESE_SIMPLIFIED("zh_cn"),
    CHINESE_TRADITIONAL("zh_tw"),
    ZULU("zu");

    private String langCode;

    public String getLanguageCode() {
        return langCode;
    }

    LanguageEnum(String langCode) {
        this.langCode = langCode;
    }
}
