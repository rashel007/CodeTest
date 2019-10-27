package Task1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

class AnagramTest {


    @Test
    public void anagram_singleWord_returnTrue() {
        Anagram  SUT = new Anagram();
        boolean result = SUT.functionCheckAnagram("rashel", "elrsah");
        Assert.assertThat(result, is(true));

    }

    @Test
    public void anagram_singleWord_returnFalse() {
        Anagram  SUT = new Anagram();
        boolean result = SUT.functionCheckAnagram("rashe", "elrsah");
        Assert.assertThat(result, is(false));

    }

    @Test
    public void anagram_multiWord_returnTure() {
        Anagram  SUT = new Anagram();
        boolean result = SUT.functionCheckAnagram("Hello World", "WH elloorld");
        Assert.assertThat(result, is(true));

    }

    @Test
    public void anagram_multiWord_returnFalse() {
        Anagram  SUT = new Anagram();
        boolean result = SUT.functionCheckAnagram("HelloWorld", "WH ello orld");
        Assert.assertThat(result, is(false));

    }

    @Test
    public void anagram_differentLenghtWord_returnFalse() {
        Anagram  SUT = new Anagram();
        boolean result = SUT.functionCheckAnagram("HelloWo", "WH ello orld");
        Assert.assertThat(result, is(false));

    }


}