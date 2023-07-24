package hw.week4_day4.calculator;

public class Calculator {
    public static void main(String[] args) {
        // 변수 선언 및 초기화

        try {
            // 숫자1 입력
            int num1 = 2;
            // 숫자2 입력
            int num2 = 0;
            // 연산자 입력
            char op = '/';
            // calculate 메소드 호출
            int answer = calculate(num1, num2, op);
            // 결과 출력
            System.out.println("answer: "+answer);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate ( int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리
        if(operator != '+' && operator !='-' && operator != '*' && operator != '/'){
            throw new InvalidOperatorException("유효하지 않은 연산자입니다.");
        }

        int answer = 0;
        switch (operator){
            case'+':
                answer = num1+num2;
                break;
            case '-':
                answer = num1-num2;
                break;
            case '*':
                answer = num1*num2;
                break;
            case '/':
                if(num2==0) throw new DivideByZeroException("0으로 나눌 수 없습니다.");
                answer = num1/num2;
                break;
        }

        return answer;
    }

}
