package strings2.telran.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import strings2.telran.Regex;

class RegexTest {
	
	 

		@Test
		void javaVariableTrueTest() {
			String regex = Regex.javaVariable();

			assertTrue("abs".matches(regex));
			assertTrue("a".matches(regex));
			assertTrue("$".matches(regex));
			assertTrue("$123".matches(regex));
			assertTrue("$1_23".matches(regex));
			assertTrue("abc_".matches(regex));
			assertTrue("__".matches(regex));
			assertTrue("Abs_".matches(regex));

		}

		@Test
		void javaVariableFalseTest() {
			String regex = Regex.javaVariable();
			assertFalse("1abc".matches(regex));
			assertFalse("_".matches(regex));
			assertFalse("a-2".matches(regex));
			assertFalse("a 2".matches(regex));
			assertFalse("a?2".matches(regex));
			assertFalse("i*nt".matches(regex));
		}

		@Test
		void zero_300TrueTest() {
			String regex = Regex.zero_300();
			assertTrue("0".matches(regex));
			assertTrue("2".matches(regex));
			assertTrue("19".matches(regex));
			assertTrue("198".matches(regex));
			assertTrue("299".matches(regex));
			assertTrue("30".matches(regex));
			assertTrue("33".matches(regex));
			assertTrue("300".matches(regex));
		}

		@Test
		void zero_300FalseTest() {
			String regex = Regex.zero_300();
			assertFalse("00".matches(regex));
			assertFalse("01".matches(regex));
			assertFalse("19s".matches(regex));
			assertFalse("398".matches(regex));
			assertFalse("2990".matches(regex));
			assertFalse("-30".matches(regex));
			assertFalse("330".matches(regex));
			assertFalse("301".matches(regex));

		}

		@Test
		void ipOctetTest() {
			String regex = Regex.ipOctet();
			assertTrue("0".matches(regex));
			assertTrue("00".matches(regex));
			assertTrue("000".matches(regex));
			assertTrue("10".matches(regex));
			assertTrue("19".matches(regex));
			assertTrue("199".matches(regex));
			assertTrue("009".matches(regex));
			assertTrue("255".matches(regex));
			assertTrue("250".matches(regex));

			assertFalse("-0".matches(regex));
			assertFalse("00 ".matches(regex));
			assertFalse("0000".matches(regex));
			assertFalse("10?".matches(regex));
			assertFalse("1900".matches(regex));
			assertFalse("299".matches(regex));
			assertFalse("00a".matches(regex));
			assertFalse("256".matches(regex));
			assertFalse("260".matches(regex));
			assertFalse("300".matches(regex));

		}

		@Test
		void mobileIsraelPhoneTest() {
			String regex = Regex.mobileIsraelPhone();
			assertTrue("+972-55-1234567".matches(regex));
			assertTrue("+972-59-9876543".matches(regex));
			assertTrue("+972-50-1112233".matches(regex));
			assertTrue("+97250-1112233".matches(regex));
			assertTrue("+972501112233".matches(regex));

			assertFalse("+972-54-123".matches(regex));
			assertFalse("+972-55-123456781910".matches(regex));
			assertFalse("+972-56-123456a".matches(regex));
			assertFalse("+972-14-1234567".matches(regex));
			assertFalse("+972-5-1234567".matches(regex));
			assertFalse("972-5-1234567".matches(regex));
			assertFalse("+5-1234567".matches(regex));
			assertFalse("2-5-1234567".matches(regex));

		}
	}

