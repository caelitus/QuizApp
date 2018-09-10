package com.example.admin.multiplechoicequiz;

public class QuestionLibrary2 {

//영어문제



    public static String mQuestionsTwo [] = {
            "안영길 가문의 재산은?",
            "공무원  기출문제를 만들고 있어요.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright.",
            "5번 문제 ",
            "6번 문제 ",
            "7 문제 ",
            "8 문제 ",
            "9 문제 ",
            "10 문제 ",

    };


    public static String mChoicesTwo [][] = {
            {"100조", "10조", "50조","100원"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
            {"오답", "정답", "Seeds","이건 정답 아니야"},
    };



    public static String mCorrectAnswersTwo[] = {"100조", "정답", "정답", "정답", "정답", "정답", "정답", "정답", "정답", "정답"};




    public String getQuestionTwo(int a) {
        String question = mQuestionsTwo[a];
        return question;
    }


    public String getChoice1_1(int a) {
        String choice0 = mChoicesTwo[a][0];
        return choice0;
    }


    public String getChoice2_1(int a) {
        String choice1 = mChoicesTwo[a][1];
        return choice1;
    }

    public String getChoice3_1(int a) {
        String choice2 = mChoicesTwo[a][2];
        return choice2;
    }
    public String getChoice4_1(int a) {
        String choice3 = mChoicesTwo[a][3];
        return choice3;
    }

    public String getCorrectAnswer_1(int a) {
        String answer = mCorrectAnswersTwo[a];
        return answer;
    }


}



