package TddTest;

import TddStudy.StringAddCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class StringAddCalculatorTest {

    @DisplayName("null_또는_빈문자_전달")
    @Test
    void splitAndSum_null_또는_빈문자(){

        assertThat(StringAddCalculator.splitAndSum(null)).isEqualTo(0);
        assertThat(StringAddCalculator.splitAndSum("")).isEqualTo(0);
    }

    @Test
    void splitAndSum_숫자하나() throws Exception {

        assertThat(StringAddCalculator.splitAndSum("1")).isEqualTo(1);

    }

    @Test
    void splitAndSum_쉼표구분자() throws Exception{

        assertThat(StringAddCalculator.splitAndSum("1,2")).isEqualTo(3);
    }

    @Test
    void splitAndSum_쉼표_또는_콜론_구분자() throws Exception{
        assertThat(StringAddCalculator.splitAndSum("1,2:3")).isEqualTo(6);
    }

    @Test
    void splitAndSum_custom_구분자() throws Exception {
        assertThat(StringAddCalculator.isCustom("//;\n1;2;3")).isEqualTo(6);
    }

    @DisplayName("음수_입력시_예외")
    @Test
    void splitAndSum_negative() throws Exception {
        assertThatThrownBy(() -> StringAddCalculator.isMinus("-1,2,3"))
            .isInstanceOf(RuntimeException.class);
    }


    @DisplayName("문자열_형변환_후_덧셈")
    @Test
    void 더하기_테스트(){
        String[] digits = {"1","2","3"};
        assertThat(StringAddCalculator.sum(digits)).isEqualTo(6);
    }




}