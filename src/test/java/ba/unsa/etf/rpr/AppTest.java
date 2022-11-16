package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class AppTest {
    @Test
    public void mockitoTest(){
        Map<String, String> imenikMock = Mockito.mock(Map.class);
        imenikMock.put("Bosna", "Sarajevo");
        imenikMock.put("Italija", "Rim");
        imenikMock.put("Austrija", "Beč");
        imenikMock.put("Njemačka", "Berlin");
        imenikMock.put("Kanada", "Otava");
        Mockito.verify(imenikMock).put("Bosna", "Sarajevo");
        Mockito.verify(imenikMock).put("Italija", "Rim");
        Mockito.verify(imenikMock).put("Austrija", "Beč");
        Mockito.verify(imenikMock).put("Njemačka", "Berlin");
        Mockito.verify(imenikMock).put("Kanada", "Otava");
        Mockito.when(imenikMock.get("Bosna")).thenReturn("Rim");
        assertEquals("Rim", imenikMock.get("Bosna"));
    }
}
