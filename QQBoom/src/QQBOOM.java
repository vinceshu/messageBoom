import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class QQBOOM {
    public static void main(String[] args) throws AWTException {
        String sentence = "fsfa,f,l;smlfm^*&^*%()&)%^(&*%*(&f.as/d,fa;'sd.fasdfa's;f";//定义要发送的话
        Robot robot = new Robot();//创建Robot对象
        robot.delay(3000);//延迟3秒，为了预留出打开窗口的时间，括号内单位为毫秒
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        String[] authors = sentence.split("[,]");//字符串根据，分割
        for (int i = 0; i < 100; i++) {//循环次数
            for (int j = 0; j < authors.length; j++) {
                String sentencet = authors[j];
                Transferable tText = new StringSelection(sentencet);
                clip.setContents(tText,null);
                //for(int j = 1;j <= 1;j++){
                // 以下两行按下了ctrl+v，粘贴
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_CONTROL);//释放ctrl案件，向ctrl，退格键，删除键这样的功能性按键，在按下后以多要释放，不然会出问题/ctrl如果按住没有释放，在按其他字母按键时，敲出来的会是ctrl的快捷键
                robot.delay(500);//延迟一秒再发送，不然会一次性全部发出去，因为电脑的处理速度很快，每次粘贴发送的速度几乎是一瞬间，所以给人的感觉就是一次性发送全部。这个时间可以自己改。
                robot.keyPress(KeyEvent.VK_ENTER);//回车
            }

        }


    }
}
