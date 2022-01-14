package org.frameworkTests;

import org.framework.Injector;
import org.framework.connection_manager.ConnectionManager;
import org.framework.connection_manager.Header;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class HeadersTests {

    @BeforeAll
    static void setup(){
        ConnectionManager.generateEndpointCityName("London");
        Injector.injectDTO(ConnectionManager.getURL());
        System.out.println(Header.getFullHeader());
    }

    @Test
    @DisplayName("Test Full Header Return All Keys")
    void testFullHeaderReturnsAllKeys() {
        Assertions.assertTrue(Header.getFullHeader().contains("access-control-allow-credentials"));
        Assertions.assertTrue(Header.getFullHeader().contains("access-control-allow-methods"));
        Assertions.assertTrue(Header.getFullHeader().contains("access-control-allow-origin"));
        Assertions.assertTrue(Header.getFullHeader().contains("connection"));
        Assertions.assertTrue(Header.getFullHeader().contains("content-length"));
        Assertions.assertTrue(Header.getFullHeader().contains("content-type"));
        Assertions.assertTrue(Header.getFullHeader().contains("date"));
        Assertions.assertTrue(Header.getFullHeader().contains("server"));
        Assertions.assertTrue(Header.getFullHeader().contains("x-cache-key"));
    }
    @Test
    @DisplayName("Test connection has valid value")
    void testConnectionHasValidValue() {
        Assertions.assertTrue(Header.getConnection().equals("keep-alive") ||
                Header.getConnection().equals("close"));
    }
    @Test
    @DisplayName("Test content-length has valid value")
    void testContentLengthHasValidValue() {
        String sizeOfBodyAsString = String.valueOf(ConnectionManager.getResponse().body().length());
        Assertions.assertEquals(Header.getContentLength(), sizeOfBodyAsString);
    }
    @Test
    @DisplayName("Test content-type has valid value")
    void testContentTypeHasValidValue() {
        Assertions.assertTrue(Header.getContentType().contains("application/") ||
                Header.getContentType().contains("audio/") ||
                Header.getContentType().contains("image/") ||
                Header.getContentType().contains("multipart/") ||
                Header.getContentType().contains("text/") ||
                Header.getContentType().contains("video/"));
    }

    @Test
    @DisplayName("Test date has valid value")
    void testDateHasValidValue() {

    }
    @Test
    @DisplayName("Test x-cache-key has valid value")
    void testXCacheKeyHasValidValue() {
        Assertions.assertTrue(Header.getXCacheKey().equals("/data/2.5/weather?q=london"));
    }

    @Test
    @DisplayName("Test access-control-allow-credentials has valid value")
    void testAccessControlAllowCredentialsHasValidValue() {
        Assertions.assertTrue(Header.getAccessControlAllowCredentials().equals("true") ||
                Header.getAccessControlAllowCredentials().equals("false"));
    }
    @Test
    @DisplayName("Test access-control-allow-methods has valid value")
    void testAccessControlAllowMethodsHasValidValue() {
        Assertions.assertTrue(Header.getAccessControlAllowMethods().contains("GET") ||
                Header.getAccessControlAllowMethods().contains("POST") ||
                Header.getAccessControlAllowMethods().contains("PUT") ||
                Header.getAccessControlAllowMethods().contains("PATCH") ||
                Header.getAccessControlAllowMethods().contains("DELETE") ||
                Header.getAccessControlAllowMethods().contains("COPY") ||
                Header.getAccessControlAllowMethods().contains("HEAD") ||
                Header.getAccessControlAllowMethods().contains("OPTIONS") ||
                Header.getAccessControlAllowMethods().contains("LINK") ||
                Header.getAccessControlAllowMethods().contains("UNLINK") ||
                Header.getAccessControlAllowMethods().contains("PURGE") ||
                Header.getAccessControlAllowMethods().contains("LOCK") ||
                Header.getAccessControlAllowMethods().contains("UNLOCK") ||
                Header.getAccessControlAllowMethods().contains("PROPFIND") ||
                Header.getAccessControlAllowMethods().contains("VIEW"));
    }
    @Test
    @DisplayName("Test access-control-allow-origin has valid value")
    void testAccessControlAllowOriginHasValidValue() {
        Assertions.assertTrue(Header.getAccessControlAllowOrigin().equals("*") ||
                Header.getAccessControlAllowOrigin().contains("http://"));
    }


}
