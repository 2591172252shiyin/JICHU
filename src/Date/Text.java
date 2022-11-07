package Date;

import org.apache.groovy.dateutil.extensions.DateUtilExtensions;
import org.apache.groovy.dateutil.extensions.DateUtilStaticExtensions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Text {
    public static void main(String[] args) {
        //输出当前时间
        Date d = new Date();
//        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        String str = s.format(d);
        //Date s = DateUtilStaticExtensions.parseToStringDate(d, "yyyy年MM月dd日 HH:mm:ss");

       // System.out.println(str);
    }
}
