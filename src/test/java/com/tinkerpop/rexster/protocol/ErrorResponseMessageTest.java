package com.tinkerpop.rexster.protocol;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.UUID;

public class ErrorResponseMessageTest {
    @Test
    public void constructEmptyConstructorEnsureFormat() {
        UUID session = UUID.randomUUID();
        UUID request = UUID.randomUUID();
        String message = "you bombed out";

        ErrorResponseMessage msg = new ErrorResponseMessage(session, request,
                ErrorResponseMessage.FLAG_ERROR_MESSAGE_VALIDATION, message);

        Assert.assertEquals(session, msg.getSessionAsUUID());
        Assert.assertTrue(msg.hasSession());
        Assert.assertEquals(ErrorResponseMessage.FLAG_ERROR_MESSAGE_VALIDATION, msg.getFlag());
        Assert.assertEquals(14, msg.getBodyLength());
        Assert.assertTrue(Arrays.equals(message.getBytes(), msg.getBody()));
        Assert.assertEquals(MessageType.ERROR, msg.getType());
    }

    @Test
    public void getErrorMessageValid() {
        UUID session = UUID.randomUUID();
        UUID request = UUID.randomUUID();
        String message = "you bombed out";

        ErrorResponseMessage msg = new ErrorResponseMessage(session, request,
                ErrorResponseMessage.FLAG_ERROR_MESSAGE_VALIDATION, message);

        Assert.assertEquals(message, msg.getErrorMessage());
    }
}
