package hellojava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * Example test.
 */
@Slf4j
public class MessageTest {
  /**
   * Example parameterized test.
   *
   * @param messageText The parameterized argument.
   */
  @ParameterizedTest
  @ValueSource(strings = {"Hello World!", "Goodbye"})
  public void helloTest(String messageText) {
    log.debug(messageText);
    Message message = new Message(messageText);
    assertEquals(messageText, message.getMessage());
  }
}
