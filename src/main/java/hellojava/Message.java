package hellojava;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Example class.
 */
@Value
@AllArgsConstructor
public class Message {
  String message;

  String getMessage() {
    return message;
  }
}
