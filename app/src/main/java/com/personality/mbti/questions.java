package com.personality.mbti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class questions extends AppCompatActivity {
    private String a[][];
    private TextView textView, textView2;
    private Button button, button2;
    public int I, N, F, P, i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        I = N = F = P = 0;
        a = new String[70][3];
        textView = findViewById(R.id.ques);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);


        a[0][0]="1. At a party do you:";
        a[0][1]="a. Interact with many, including strangers ";
        a[0][2]="b. Interact with a few, known to you ";

        a[1][0]="2. Are you more:";
        a[1][1]="a. Realistic than speculative ";
        a[1][2]="b. Speculative than realistic";

        a[2][0]= "3. Is it worse to: ";
        a[2][1]="a. Have your \"head in the clouds\" ";
        a[2][2]="b. Be \"in a rut\"";

        a[3][0]="4. Are you more impressed by:";
        a[3][1]="a. Principles ";
        a[3][2]="b. Emotions";

        a[4][0]="5. Are more drawn toward the: ";
        a[4][1]="a. Convincing";
        a[4][2]="b. Touching ";

        a[5][0]="6. Do you prefer to work: ";
        a[5][1]="a. To deadlines ";
        a[5][2]="b. Just \"whenever\" ";

        a[6][0]="7. Do you tend to choose: ";
        a[6][1]="a. Rather carefully ";
        a[6][2]="b. Somewhat impulsively ";

        a[7][0]="8. At parties do you: ";
        a[7][1]="a. Stay late, with increasing energy ";
        a[7][2]="b. Leave early with decreased energy ";

        a[8][0]="9. Are you more attracted to: ";
        a[8][1]="a. Sensible people ";
        a[8][2]="b. Imaginative people ";

        a[9][0]="10. Are you more interested in: ";
        a[9][1]="a. What is actual ";
        a[9][2]="b. What is possible";

        a[10][0]="11. In judging others are you more swayed by";
        a[10][1]="a. Laws than circumstances";
        a[10][2]="b. Circumstances than laws ";

        a[11][0]="12. In approaching others is your inclination to be somewhat: ";
        a[11][1]="a. Objective ";
        a[11][2]="b. Personal ";

        a[12][0]="13. Are you more:";
        a[12][1]="a. Punctual ";
        a[12][2]="b. Leisurely ";

        a[13][0]="14. Does it bother you more having things: ";
        a[13][1]="a. Incomplete ";
        a[13][2]="b. Completed ";

        a[14][0]="15. In your social groups do you: ";
        a[14][1]="a. Keep abreast of otherís happenings";
        a[14][2]="b. Get behind on the news ";

        a[15][0]="16. In doing ordinary things are you more likely to: ";
        a[15][1]="a. Do it the usual way ";
        a[15][2]="b. Do it your own way ";

        a[16][0]="17. Writers should:";
        a[16][1]="a. \"Say what they mean and mean what they say\" ";
        a[16][2]="b. Express things more by use of analogy ";

        a[17][0]="18. Which appeals to you more: ";
        a[17][1]="a. Consistency of thought";
        a[17][2]="b. Harmonious human relationships ";

        a[18][0]="19. Are you more comfortable in making:";
        a[18][1]="a. Logical judgments";
        a[18][2]="b. Value judgments";

        a[19][0]="20. Do you want things";
        a[19][1]="a. Settled and decided";
        a[19][2]="b. Unsettled and undecided";

        a[20][0]="21. Would you say you are more";
        a[20][1]="a. Serious and determined ";
        a[20][2]="b. Easy-going";

        a[21][0]="22. In phoning do you: ";
        a[21][1]="a. Rarely question that it will all be said ";
        a[21][2]="b. Rehearse what youíll say";

        a[22][0]="23. Facts: ";
        a[22][1]="a. \"Speak for themselves\" ";
        a[22][2]="b. Illustrate principles";

        a[23][0]="Are visionaries:";
        a[23][1]="a. somewhat annoying";
        a[23][2]="b. rather fascinating ";

        a[24][0]="25. Are you more often:";
        a[24][1]="a. a cool-headed person";
        a[24][2]="b. a warm-hearted person ";

        a[25][0]="26. Is it worse to be:";
        a[25][1]="a. unjust ";
        a[25][2]="b. merciless ";

        a[26][0]=" 27. Should one usually let events occur:";
        a[26][1]="a. by careful selection and choice";
        a[26][2]="b. randomly and by chance ";

        a[27][0]="28. Do you feel better about:";
        a[27][1]="a. having purchased ";
        a[27][2]="b. having the option to buy ";

        a[28][0]="29. In company do you:";
        a[28][1]="a. initiate conversation";
        a[28][2]="b. wait to be approached";

        a[29][0]="30. Common sense is: ";
        a[29][1]="a. rarely questionable ";
        a[29][2]="b. frequently questionable";

        a[30][0]="31. Children often do not:";
        a[30][1]="a. make themselves useful enough";
        a[30][2]="b. exercise their fantasy enough";

        a[31][0]="32. In making decisions do you feel more comfortable with: ";
        a[31][1]="a. standards";
        a[31][2]="b. feelings";

        a[32][0]="33. Are you more:";
        a[32][1]="a. firm than gentle ";
        a[32][2]="b. gentle than firm";

        a[33][0]="34. Which is more admirable:";
        a[33][1]="a. the ability to organize and be methodical";
        a[33][2]="b. the ability to adapt and make do";

        a[34][0]="35. Do you put more value on: ";
        a[34][1]="a. infinite ";
        a[34][2]="b. open-minded ";

        a[35][0]="36. Does new and non-routine interaction with others: ";
        a[35][1]="a. stimulate and energize you ";
        a[35][2]="b. tax your reserves";

        a[36][0]="37. Are you more frequently:";
        a[36][1]="a. a practical sort of person";
        a[36][2]="b. a fanciful sort of person ";

        a[37][0]="38. Are you more likely to:";
        a[37][1]="a. see how others are useful ";
        a[37][2]="b. see how others see";

        a[38][0]="39. Which is more satisfying:";
        a[38][1]="a. to discuss an issue thoroughly";
        a[38][2]="b. to arrive at agreement on an issu";

        a[39][0]="40. Which rules you more";
        a[39][1]="a. your head ";
        a[39][2]="b. your heart ";


        a[40][0]="41. Are you more comfortable with work that is: ";
        a[40][1]="a. contracted ";
        a[40][2]="b. done on a casual basis ";

        a[41][0]="42. Do you tend to look for: ";
        a[41][1]="a. the orderly ";
        a[41][2]="b. whatever turns up ";

        a[42][0]="43. Do you prefer: ";
        a[42][1]="a. many friends with brief contact ";
        a[42][2]="b. a few friends with more lengthy contact ";

        a[43][0]="44. Do you go more by: ";
        a[43][1]="a. facts ";
        a[43][2]="b. principles ";

        a[44][0]="45. Are you more interested in: ";
        a[44][1]="a. production and distribution ";
        a[44][2]="b. design and research ";

        a[45][0]="46. Which is more of a compliment: ";
        a[45][1]="a. \"There is a very logical person.\" ";
        a[45][2]="b. \"There is a very sentimental person.\" ";

        a[46][0]="47. Do you value in yourself more that you are: ";
        a[46][1]="a. unwavering ";
        a[46][2]="b. devoted ";

        a[47][0]="48. Do you more often prefer the ";
        a[47][1]="a. final and unalterable statement ";
        a[47][2]="b. tentative and preliminary statement";

        a[48][0]="49. Are you more comfortable:";
        a[48][1]="a. after a decision ";
        a[48][2]="b. before a decision";

        a[49][0]="50. Do you:";
        a[49][1]="a. speak easily and at length with strangers ";
        a[49][2]="b. find little to say to strangers";

        a[50][0]="51. Are you more likely to trust your:";
        a[50][1]="a. experience ";
        a[50][2]="b. hunch ";

        a[51][0]="52. Do you feel:";
        a[51][1]="a. more practical than ingenious ";
        a[51][2]="b. more ingenious than practical ";

        a[52][0]="53. Which person is more to be complimented ñ  one of: ";
        a[52][1]="a. clear reason ";
        a[52][2]="b. strong feeling ";

        a[53][0]="54. Are you inclined more to be:";
        a[53][1]="a. fair-minded";
        a[53][2]="b. sympathetic";

        a[54][0]="55. Is it preferable mostly to:";
        a[54][1]="a. make sure things are arranged";
        a[54][2]="b. just let things happen ";

        a[55][0]="56. In relationships should most things be: ";
        a[55][1]="a. re-negotiable ";
        a[55][2]="b. random and circumstantial ";

        a[56][0]="57. When the phone rings do you: ";
        a[56][1]="a. hasten to get to it first ";
        a[56][2]="b. hope someone else will answer ";

        a[57][0]="58. Do you prize more in yourself: ";
        a[57][1]="a. a strong sense of reality";
        a[57][2]="b. a vivid imagination ";

        a[58][0]="59. Are you drawn more to:";
        a[58][1]="a. fundamentals ";
        a[58][2]="b. overtones";

        a[59][0]="60. Which seems the greater error:";
        a[59][1]="a. to be too passionate ";
        a[59][2]="b. to be too objective ";

        a[60][0]="61. Do you see yourself as basically:";
        a[60][1]="a. hard-headed ";
        a[60][2]="b. soft-hearted ";

        a[61][0]="62. Which situation appeals to you more:";
        a[61][1]="a. the structured and scheduled ";
        a[61][2]="b. the unstructured and unscheduled";

        a[62][0]="63. Are you a person that is more:";
        a[62][1]="a. routinized than whimsical ";
        a[62][2]="b. whimsical than routinized";

        a[63][0]="64. Are you more inclined to be:";
        a[63][1]="a. easy to approach ";
        a[63][2]="b. somewhat reserved ";

        a[64][0]="65. In writings do you prefer: ";
        a[64][1]="a. the more literal ";
        a[64][2]="b. the more figurative ";

        a[65][0]="66. Is it harder for you to:";
        a[65][1]="a. identify with others";
        a[65][2]="b. utilize others";

        a[66][0]="67. Which do you wish more for yourself: ";
        a[66][1]="a. clarity of reason ";
        a[66][2]="b. strength of compassion ";

        a[67][0]="68. Which is the greater fault: ";
        a[67][1]="a. being indiscriminate";
        a[67][2]="b. being critical ";

        a[68][0]="69. Do you prefer the:";
        a[68][1]="a. planned event ";
        a[68][2]="b. unplanned event ";

        a[69][0]="70. Do you tend to be more:";
        a[69][1]="a. deliberate than spontaneous";
        a[69][2]="b. spontaneous than deliberate ";


        textView.setText(a[0][0]);
        button.setText(a[0][1]);
        button2.setText(a[0][2]);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (i + 1 == 1 || i + 1 == 8 || i + 1 == 15 || i + 1 == 22 || i + 1 == 29 || i + 1 == 36 || i + 1 == 43 || i + 1 == 50 || i + 1 == 57 || i + 1 == 64) {
                    I += 1;
                }

                if (i + 1 == 2 || i + 1 == 3 || i + 1 == 9 || i + 1 == 10 || i + 1 == 16 || i + 1 == 17 || i + 1 == 23 || i + 1 == 24 || i + 1 == 30 || i + 1 == 31 || i + 1 == 37 || i + 1 == 38 || i + 1 == 44 || i + 1 == 45 || i + 1 == 51 || i + 1 == 52 || i + 1 == 58 || i + 1 == 59 || i + 1 == 65 || i + 1 == 66) {
                    N += 1;
                }

                if (i + 1 == 4 || i + 1 == 5 || i + 1 == 11 || i + 1 == 12 || i + 1 == 18 || i + 1 == 19 || i + 1 == 25 || i + 1 == 26 || i + 1 == 32 || i + 1 == 33 || i + 1 == 39 || i + 1 == 40 || i + 1 == 46 || i + 1 == 47 || i + 1 == 53 || i + 1 == 54 || i + 1 == 60 || i + 1 == 61 || i + 1 == 67 || i + 1 == 68) {
                    F += 1;
                }

                if (i + 1 == 6 || i + 1 == 7 || i + 1 == 13 || i + 1 == 14 || i + 1 == 20 || i + 1 == 21 || i + 1 == 27 || i + 1 == 28 || i + 1 == 34 || i + 1 == 35 || i + 1 == 41 || i + 1 == 42 || i + 1 == 48 || i + 1 == 49 || i + 1 == 55 || i + 1 == 56 || i + 1 == 62 || i + 1 == 63 || i + 1 == 69 || i + 1 == 70) {
                    P += 1;
                }

                if(i == 69) {
                    result();
                    Intent intent = new Intent(questions.this, result.class);
                    startActivity(intent);
                }

                if(i<69) {

                    textView.setText(a[++i][0]);
                    button.setText(a[i][1]);
                    button2.setText(a[i][2]);}
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (i + 1 == 1 || i + 1 == 8 || i + 1 == 15 || i + 1 == 22 || i + 1 == 29 || i + 1 == 36 || i + 1 == 43 || i + 1 == 50 || i + 1 == 57 || i + 1 == 64) {
                    I -= 1;
                }

                if (i + 1 == 2 || i + 1 == 3 || i + 1 == 9 || i + 1 == 10 || i + 1 == 16 || i + 1 == 17 || i + 1 == 23 || i + 1 == 24 || i + 1 == 30 || i + 1 == 31 || i + 1 == 37 || i + 1 == 38 || i + 1 == 44 || i + 1 == 45 || i + 1 == 51 || i + 1 == 52 || i + 1 == 58 || i + 1 == 59 || i + 1 == 65 || i + 1 == 66) {
                    N -= 1;
                }

                if (i + 1 == 4 || i + 1 == 5 || i + 1 == 11 || i + 1 == 12 || i + 1 == 18 || i + 1 == 19 || i + 1 == 25 || i + 1 == 26 || i + 1 == 32 || i + 1 == 33 || i + 1 == 39 || i + 1 == 40 || i + 1 == 46 || i + 1 == 47 || i + 1 == 53 || i + 1 == 54 || i + 1 == 60 || i + 1 == 61 || i + 1 == 67 || i + 1 == 68) {
                    F -= 1;
                }

                if (i + 1 == 6 || i + 1 == 7 || i + 1 == 13 || i + 1 == 14 || i + 1 == 20 || i + 1 == 21 || i + 1 == 27 || i + 1 == 28 || i + 1 == 34 || i + 1 == 35 || i + 1 == 41 || i + 1 == 42 || i + 1 == 48 || i + 1 == 49 || i + 1 == 55 || i + 1 == 56 || i + 1 == 62 || i + 1 == 63 || i + 1 == 69 || i + 1 == 70) {
                    P -= 1;
                }

                if(i == 69) {
                    result();
                    Intent intent = new Intent(questions.this, result.class);
                    startActivity(intent);
                }
                if(i < 69) {

                textView.setText(a[++i][0]);
                button.setText(a[i][1]);
                button2.setText(a[i][2]);}
            }
        });
    }

    private void result() {
        char[] res = {'I', 'N', 'F', 'P'};
        if(I < 0)
            res[0] = 'E';
        if(N < 0)
            res[1] = 'S';
        if(F < 0)
            res[2] = 'T';
        if(P < 0)
            res[3] = 'J';

        String respers = new String(res);
        ApplicationSessionStorage.SetSessionData("respers", respers);


    }
}
