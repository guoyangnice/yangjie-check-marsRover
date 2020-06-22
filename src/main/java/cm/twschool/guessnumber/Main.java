package cm.twschool.guessnumber;

import java.util.Scanner;

/**
 * 主体函数：输入、调用随机数等逻辑
 */
public class Main {

    public static void main(String[] args) {
        //生成随机数
        Generator generator = new Generator();
        String randomStr = generator.generaotrRondomNumber();

        String succeed = Status.SUCCEED.name();
        String contiuned = Status.CONTINUED.name();
        String failed = Status.FAILED.name();

        System.out.println("--------------");
        System.out.println("游戏开始啦！请输出你的答案");
        System.out.println("测试用的随机数:" + randomStr);
        System.out.println("--------------");

        String inputStr = getUserInputStr();
        Game game = new Game(new Answer(randomStr));
        String statusStr = game.guess(inputStr);

        while(Status.CONTINUED.equals(statusStr)){
            System.out.println("你的答案准确率："+Answer.answerStr);
            if (succeed.equals(statusStr)) {
                System.out.println("You Win");
                break;
            } else if (contiuned.equals(statusStr)) {
                System.out.println("Wrong Input，Input again");
            } else if (failed.equals(statusStr)) {
                System.out.println("You Failed");
                break;
            }
            //获取用户输入
            inputStr = getUserInputStr();
            game = new Game(new Answer(randomStr));
            statusStr = game.guess(inputStr);
        }
        System.out.println("游戏已结束！");
    }


    public static String getUserInputStr() {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        return inputStr;
    }
}
