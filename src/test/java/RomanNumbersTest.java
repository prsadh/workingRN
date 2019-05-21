import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    @Test
    public void testValue1() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(1), "I");
    }

    @Test
    public void testValue2() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(2), "II");
    }

    @Test
    public void testValue3() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(3), "III");
    }

    @Test
    public void testValue4() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(4), "IV");
    }

    @Test
    public void testValue5() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(5), "V");
    }

    @Test
    public void testValue6() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(6), "VI");
    }

    @Test
    public void testValue8() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(8), "VIII");
    }

    @Test
    public void testValue9() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(9), "IX");
    }

    @Test
    public void testValue10() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(10), "X");
    }

    @Test
    public void testValue13() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(13), "XIII");
    }

    @Test
    public void testValue14() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(14), "XIV");
    }

    @Test
    public void testValue15() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(15), "XV");
    }

    @Test
    public void testValue19() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(19), "XIX");
    }

    @Test
    public void testValue20() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(20), "XX");
    }

    @Test
    public void testValue21() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(21), "XXI");
    }

    @Test
    public void testValue23() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(23), "XXIII");
    }

    @Test
    public void testValue24() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(24), "XXIV");
    }

    @Test
    public void testValue25() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(25), "XXV");
    }

    @Test
    public void testValue40() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(40), "XL");
    }

    @Test
    public void testValue50() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(50), "L");
    }

    @Test
    public void testValue90() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(90), "XC");
    }

    @Test
    public void testValue99() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(99), "XCIX");
    }

    @Test
    public void testValue100() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(100), "C");
    }

    @Test
    public void testValue200() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(200), "CC");
    }

    @Test
    public void testValue299() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(299), "CCXCIX");
    }

    @Test
    public void testValue500() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(500), "D");
    }

    @Test
    public void testValue999() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(999), "CMXCIX");
    }

    @Test
    public void testValue1000() {
        RomanNumbers rN = new RomanNumbers();
        assertEquals(rN.translateToRomanNumbers(1000), "M");
    }

}