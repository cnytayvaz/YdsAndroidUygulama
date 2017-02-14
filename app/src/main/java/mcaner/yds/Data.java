package mcaner.yds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cuneyt on 13.11.2016.
 */

public class Data {

    public static String url = "http://10.0.3.2:9090/YdsWebServis";
    public static String examname;
    public static int fragmentSayfaSayisi;
    public static String iduser, username, password, email, status;
    public static List<QuestionModel> questions = new ArrayList<>(80);
    public static String[] userAnswer = new String[80];
    public static String time;


}
