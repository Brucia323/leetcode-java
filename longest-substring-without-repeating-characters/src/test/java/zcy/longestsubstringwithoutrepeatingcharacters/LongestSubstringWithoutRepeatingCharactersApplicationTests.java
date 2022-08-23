package zcy.longestsubstringwithoutrepeatingcharacters;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zcy.longestsubstringwithoutrepeatingcharacters.services.Solution;
import zcy.longestsubstringwithoutrepeatingcharacters.services.impl.SolutionImpl;

@Slf4j
@SpringBootTest
class LongestSubstringWithoutRepeatingCharactersApplicationTests {

    @Test
    void contextLoads() {
        String[] strings = new String[]{"abcabcbb", "bbbbb", "pwwkew"};
        Solution solution = new SolutionImpl();
        for (String s : strings) {
            log.info("s: {}, return: {}", s, solution.lengthOfLongestSubstring(s));
        }
    }

}
