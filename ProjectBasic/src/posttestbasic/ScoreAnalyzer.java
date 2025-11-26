package posttestbasic;

public class ScoreAnalyzer {

    public String classifyResult(int[] scores) {
        if (scores == null || scores.length == 0) {
            return "No Data"; 
        }

        double totalSum = 0;

        
        for (int score : scores) {
            if (score >= 0 && score <= 100) {
                totalSum += score;
            }
        }

        
        double average = totalSum / scores.length;

        
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 70) {
            return "Good";
        } else if (average >= 50) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}