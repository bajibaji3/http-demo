package com.example.httpdemo.mapper;

import com.example.httpdemo.bean.*;

import java.util.List;

public interface MyLearnMapper {
    List<SpecialList> findAllSpecialList(String userId);
    List<SpecialTitleList> findAllSpecial();
    void insertUserSpecial(SpecialList specialList);
    List<WeekList> findAllWeekList(String userId);
    List<WeekTitle> findAllWeek();
    void insertUserWeek(WeekList weekList);
    void updateIsAnswerByWeek(WeekList weekList);
    List<Question> findAllChallengeQuestion();
    List<Question> findAllWeekQuestion();
    void insertHighScore(Challenge challenges);
    void updateHighScore(Challenge challenge);
    String findHighScore(String userId);
    String findIsAnswerByWeek(WeekList weekList);
    List<Question> findAllDailyQuestion();
    void updateUserAnswer(UserAnswer userAnswer);
    void updateUserAnswer5(UserAnswer userAnswer);
    UserAnswer findUserAnswer5(UserAnswer userAnswer);
    UserAnswer findUserAnswer(UserAnswer userAnswer);
    void insertUserAnswer(UserAnswer userAnswer);
    void insertUserAnswer5(UserAnswer userAnswer);
    List<Question> findAllSpecialQuestion();
    void updateSpecialIsAnswer(SpecialList specialList);
    void updateSpecialIsOut(SpecialList specialList);
    EverydayPerformance findEverydayScore(EverydayPerformance everydayPerformance);
    void insertDailyScore(EverydayPerformance everydayPerformance);
    void updateDailyScore(EverydayPerformance everydayPerformance);
    void updatePerformanceInDaily(Performance performance);
    void updateAnswerNum(Performance performance);
    void insertWeekScore(EverydayPerformance everydayPerformance);
    void updateWeekScore(EverydayPerformance everydayPerformance);
    String findIsAnswerBySpecial(SpecialList specialList);
    void insertSpecialScore(EverydayPerformance everydayPerformance);
    void updateSpecialScore(EverydayPerformance everydayPerformance);
    void insertChallengeScore(EverydayPerformance everydayPerformance);
    void updateChallengeScore(EverydayPerformance everydayPerformance);
    Performance findPerformance(String userId);
    List<Performance> findAllPerformance();
    void insertPerformance(Performance performance);
    User findUser(String phone);
    void insertUser(User user);
    List<Article> findArticle();
    Comment findCommentToArticle(int id);
    List<Integer> findCommentIdByArticle(CommentDepend commentDepend);
    Integer addCommentToArticle(Comment comment);
    void insertCommentDep(CommentDepend commentDepend);
    UserArticle findUserArticle(UserArticle userArticle);
    void deleteUserArticle(UserArticle userArticle);
    void insertUserArticle(UserArticle userArticle);
    List<UserArticle> findUserCollect(String userId);
    void deleteUserCollect(int id);
    List<VideoUri> findVideo();
    Article findArticleById(int id);
    VideoUri findVideoById(int id);
    void updateUserName(User user);
    void updateUserPhone(UserPhone userPhone);
    void updateUserPas(User user);

    //用于服务端数据操作
    void insertQuestion(Question question);
    String findWeekByWeek(String week);
    void insertWeek(String week);
    List<String> findAllUserPhone();
    void insertWeekToUser(WeekList weekList);
    String findSpecialBySpecial(String specialTitle);
    void insertSpecial(String specialTitle);
    void insertSpecialToUser(SpecialList specialList);
    void insertArticle(Article article);
    void insertVideo(VideoUri videoUri);
}
