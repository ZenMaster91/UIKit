package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Foundation.NSDate;
import Foundation.NSDateFormatter;

public class NSDateTest {

	@Test
	public void test() {
		NSDate date = new NSDate(01,01,2016);
		NSDateFormatter formater = new NSDateFormatter("dd, MMM, yyyy");
		assertEquals("01, ene, 2016", formater.format(date));
		System.out.println(formater.format(date));
	}

}
