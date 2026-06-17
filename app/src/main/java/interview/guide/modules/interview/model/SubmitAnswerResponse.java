package interview.guide.modules.interview.model;

// @author TrustMe.  @date 2025-06-01

/**
 * 提交答案响应
 */
public record SubmitAnswerResponse(
    boolean hasNextQuestion,
    InterviewQuestionDTO nextQuestion,
    int currentIndex,
    int totalQuestions
) {}
