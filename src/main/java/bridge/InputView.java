package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String input = Console.readLine();
        int inputNum = checkSizeIsNumber(input);
        checkSizeIsInRange(inputNum);
        checkFirstNumberIsZero(input);
        return inputNum;
    }

    private int checkSizeIsNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("다리의 길이는 숫자로 입력해 주어야 합니다.");
        }
    }

    private void checkSizeIsInRange(int inputNum) {
        if (inputNum < 3 || inputNum > 20) {
            throw new IllegalArgumentException("다리의 길이는 3에서 20 사이의 숫자입니다.");
        }
    }
    private void checkFirstNumberIsZero(String input) {
        if (input.charAt(0) == '0') {
            throw new IllegalArgumentException("0으로 시작하는 숫자는 옳은 입력방식이 아닙니다.");
        }
    }


    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
