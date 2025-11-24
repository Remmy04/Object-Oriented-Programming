package oop.group.project;
import java.io.UnsupportedEncodingException;

import java.util.Scanner;

public class Realtime {

    // 每个地区有7天的数据，每天有9个属性
    static int[][][] weatherData = {
    // 温度，体感温度，空气质量，风速，湿度，能见度，气压，露点，日期
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}}, // 吉打
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}}, // 吉兰丹
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}}, //登嘉楼
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//马六甲
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//森美兰
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//彭亨
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//霹雳
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//柔佛
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//沙巴
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//砂劳越
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//雪兰莪
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//槟城
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//玻璃市
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//吉隆坡
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}},//纳闵
            {{25, 26, 50, 10, 70, 8, 1010, 18, 18}, {24, 25, 48, 9, 68, 9, 1009, 17, 17}, {23, 24, 46, 8, 66, 10, 1008, 16, 16}, {22, 23, 44, 7, 64, 11, 1007, 15, 15}, {21, 22, 42, 6, 62, 12, 1006, 14, 14}, {20, 21, 40, 5, 60, 13, 1005, 13, 13}, {19, 20, 38, 4, 58, 14, 1004, 12, 12}}//布城
    };

    // 地区的名称
    static String[] regions = {"Kedah(吉打)", "Kelantan(吉兰丹)", "Terengganu(登嘉楼)", "Melaka(马六甲)", "Negeri Sembilan(森美兰)", "Pahang(彭亨)", "Perak(霹雳)", "Johor(柔佛)", "Sabah(沙巴)", "Sarawak(沙捞越)", "Selangor(雪兰莪)", "Pulau Pinang(槟城)", "Perlis(玻璃市)","Kuala Lumpur(吉隆坡)","Labuan(纳闽)","Putrajaya(布城)"};

    // 天气属性的名称
    static String[] attributes = {"Temperatures(温度)", "Body temperature(体感温度)", "Air quality(空气质量)", "Air velocity(风速)", "Humidity level(湿度)", "Increased visibility(能见度)", "Pneumatic(气压)", "Dew point(露点)", "Dates(日期)"};

    // 创建一个Scanner对象用于接收用户的输入
    static Scanner sc = new Scanner(System.in,"UTF-8");

    public static void weather() {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        while(true){
// 显示欢迎信息
        System.out.println("\nWelcome to the Weather Checker program!/欢迎使用天气查询程序！");
        System.out.println("Enter BACK to go back to Main Page");
        System.out.println("Enter PLAY to enter the program");

        String feedback = sc.nextLine();
            if ("PLAY".equalsIgnoreCase(feedback)) {
                selectRegion();
            }
        if ("BACK".equalsIgnoreCase(feedback)) {
                break;
            }

        // 调用选择地区的方法

    }
    }
    // 选择地区的方法
    public static void selectRegion() {
        // 显示提示信息
        System.out.println("\nPlease select a region (enter a number)/请选择一个地区（输入数字）：");


        // 显示地区的选项
        for (int i = 0; i < regions.length; i++) {
            System.out.println((i + 1) + ": " + regions[i]);
        }

        // 显示返回上一级的选项
        System.out.println("0: Return to previous level/返回上一级");

        // 获取用户的输入
        int input = sc.nextInt();
        sc.nextLine();
        // 判断用户的输入是否有效
        if (input < 0 || input > regions.length) {
            // 输入无效，显示错误信息
            System.out.println("Input error, please re-enter!/输入错误，请重新输入！");
            // 重新调用选择地区的方法
            selectRegion();
        } else if (input == 0) {
            // 输入为0，表示返回上一级
            // 显示提示信息
            System.out.println("Returned to higher level!/已返回上一级！");
            // 重新调用主方法
            return;
        } else {
            // 输入有效，表示选择了一个地区
            // 调用选择日期的方法，传入地区的索引
            selectDate(input - 1);
        }
    }

    // 选择日期的方法，接收一个地区的索引作为参数
    public static void selectDate(int regionIndex) {
        // 显示提示信息
        System.out.println("\nPlease select a date (enter a number)/请选择一个日期（输入数字）：");

        // 显示日期的选项
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + ": " +"December "+weatherData[regionIndex][i][8]+" / "+"12月"+ weatherData[regionIndex][i][8] +"日");
        }

        // 显示返回上一级的选项
        System.out.println("0: Return to previous level/返回上一级");

        // 获取用户的输入
        int input = sc.nextInt();

        // 判断用户的输入是否有效
        if (input < 0 || input > 7) {
            // 输入无效，显示错误信息
            System.out.println("Input error, please re-enter!/输入错误，请重新输入！");
            // 重新调用选择日期的方法
            selectDate(regionIndex);
        } else if (input == 0) {
            // 输入为0，表示返回上一级
            // 显示提示信息
            System.out.println("Returned to higher level!/已返回上一级！");
            // 重新调用选择地区的方法
            selectRegion();
        } else {
            // 输入有效，表示选择了一个日期
            // 调用显示天气的方法，传入地区和日期的索引
            showWeather(regionIndex, input - 1);
        }
    }

    // 显示天气的方法，接收一个地区和一个日期的索引作为参数
    public static void showWeather(int regionIndex, int dateIndex) {
        // 显示提示信息
        System.out.println("\n以下是" + regions[regionIndex] + "在12月" + weatherData[regionIndex][dateIndex][8] + "日的天气信息：");
        System.out.println("Here's the weather in " + regions[regionIndex] + "on December " + weatherData[regionIndex][dateIndex][8] +":");

        // 显示天气的属性和值
        for (int i = 0; i < 8; i++) {
            System.out.println(attributes[i] + ": " + weatherData[regionIndex][dateIndex][i]+ getUnit(i));
        }

        // 显示返回上一级的选项
        System.out.println("0: Return to previous level/返回上一级");

        // 获取用户的输入
        int input = sc.nextInt();

        // 判断用户的输入是否为0
        if (input == 0) {
            // 输入为0，表示返回上一级
            // 显示提示信息
            System.out.println("Returned to higher level!/已返回上一级！");
            // 重新调用选择日期的方法
            selectDate(regionIndex);
        } else {
            // 输入不为0，表示输入错误
            // 显示错误信息
            System.out.println("Input error, please re-enter!/输入错误，请重新输入！");
            // 重新调用显示天气的方法
            showWeather(regionIndex, dateIndex);
        }

    }
    public static String getUnit(int attributeIndex) {
        // 在这里根据需要添加其他属性的单位
        switch (attributeIndex) {
            case 0:
            case 1:
            case 7:
                return "℃";
            case 3:
                return "km/h";
            case 4:
                return "%";
            case 5:
                return "km";
            case 6:
                return " hPa";
            default:
                return ""; // 默认为空字符串
        }
    }

    /*private static void weather(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/


}