import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Андрей on 01.04.2018.
 */
public class Example {
    public static void main(String[] args) {
        System.out.println(DigestUtils.sha256Hex("Example"));
    }
}
