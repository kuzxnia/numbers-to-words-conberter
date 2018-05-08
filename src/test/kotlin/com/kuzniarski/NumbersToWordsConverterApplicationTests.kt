package com.kuzniarski

import com.kuzniarski.converter.convertToWord
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NumbersToWordsConverterApplicationTests {

	@Test
	fun contextLoads() {
		Assert.assertEquals("one hundred twenty", convertToWord(120))
	}

}
