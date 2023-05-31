package EducativeQuestions;

public class CelebrityProblem {

    /*
    Note need to find a person in the 2d array who is known by everyone , but know no one
     the people are the row and col index
     So a celebrity is someone whose row will have all 0 meaning he knows no one assuming that if value at arr[i,j]=1 then i knows j
     also everyone should know this person
     When these 2 condition are met then we will mark that person as celebrity and return the value, if no such person found then return -1
    */

    public static int findCelebrity(int[][] party, int numPeople) {
        int celebrity = -1;
        // Write -- Your -- Code
        int i;
        Stack<Integer> people=new Stack<>(numPeople);
        for(i=numPeople-1;i>=0;i--){
            people.push(i);
        }

        int p1,p2;
        while(people.getCurrentSize()>=2){
            p1=people.pop();
            p2=people.pop();
            if(party[p1][p2]== 1){
                people.push(p2);
            }else {
                people.push(p1);
            }
        }
        boolean cond1=true;
        boolean cond2=true;
        int celeb=people.top();
        for(i=0;i<numPeople;i++){
            if(party[celeb][i]==1)
                cond1=false;

            if(party[i][celeb]==0){
                if(i!=celeb)
                    cond2=false;
            }
        }


        if(cond1 & cond2)
            celebrity=celeb;

        return celebrity;
    }

    public static void main(String[] args) {
        int [][] party1 = {
                {0,1,1,0},
                {1,0,1,1},
                {0,0,0,0},
                {0,1,1,0},
        };

        int [][] party2 = {
                {0,1,1,0},
                {1,0,1,1},
                {0,0,0,1},
                {0,1,1,0},
        };

        int [][] party3 = {
                {0,0,0,0},
                {1,0,0,1},
                {1,0,0,1},
                {1,1,1,0},
        };

        System.out.println(findCelebrity(party1,4));
        System.out.println(findCelebrity(party2,4));
        System.out.println(findCelebrity(party3,4));
    }
}
