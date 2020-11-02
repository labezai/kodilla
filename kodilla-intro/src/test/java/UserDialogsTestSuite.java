import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class UserDialogsTestSuite {

    @Test
    public void shouldUserDialogsProceedProperly() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        UserDialogs.getValue();
        String input1 = "Aga";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);
        UserDialogs.getUsername();
        String input2 = "A";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);
        UserDialogs.getUserSelection();
    }

} 