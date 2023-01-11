package xyz_hlmy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz_hlmy.util.QRCodeUtil;

@SpringBootTest
class CoreApplicationTests {

    @Test
    void contextLoads() {
        String analyzeImage = "F:\\123.png";
        try {
            String decode = QRCodeUtil.decode(analyzeImage);
            System.out.println(decode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String text = "刘梓阳是傻逼";
        String imag = "F:\\info.gif";
        String destPath = "F:\\202301111634.png";
        try {
            QRCodeUtil.encode(text, imag,destPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
