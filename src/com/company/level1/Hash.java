package com.company.level1;

//미해결
public class Hash {
//프로그래머스 hash - lv1 완주하지 못한 선수

    //hash 에 대해 공부하자..

    @Override
    public int hashCode() {
//            int result = (int) (id ^ (id >>> 32));
//            result = 31 * result + name.hashCode();
//            result = 31 * result + email.hashCode();
//            return result;

//            final int prime = 31;
//            int result = 1;
//            result = prime * result;
//            return result;


        return super.hashCode();
    }


    public String solution() {
//                String[] participant, String[] completion
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

//            HashMap<>


        String answer = participant[0];
        System.out.println("answer = " + answer);


        return answer;
    }
}
