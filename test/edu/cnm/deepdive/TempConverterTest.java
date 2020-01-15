package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final int[] INPUT = {4046,6325,9788,5676,88,8925,8598,2025,4738,453};
  static final int[] EXPECTED = {14,16,32,24,16,24,30,9,22,12};

  @Test
  void convertC2F() {
    for(int i = 0; i<INPUT.length; ++i) {
      double input = INPUT[i];
      double expected = EXPECTED[i];
      double actual = TempConverter.convertC2F(input);
      assertEquals(expected,actual);
    }
  }
}