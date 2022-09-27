package ru.maren.moneytransfer.repository;

import org.junit.jupiter.api.BeforeEach;
import ru.maren.moneytransfer.model.Card;
import ru.maren.moneytransfer.model.request.TransferRequest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static ru.maren.moneytransfer.data.TestData.*;


public class MoneyTransferRepositoryTest extends MoneyTransferRepository{
    private final Map<String, Card> testCardMap = new ConcurrentHashMap<>();

    @BeforeEach
    void setUp() {
        testCardMap.put(CARD_NUMBER_1, CARD_1);
        testCardMap.put(CARD_NUMBER_2, CARD_2);
    }

    @Override
    public TransferRequest removeTransfer(String operationId) {
        if (operationId.equals("1")) {
            return TRANSFER_REQUEST_1;
        }
        return null;
    }
    @Override
    public String removeCodes(String operationId) {
        if (operationId.equals("1")) {
            return "0000";
        }
        return null;
    }

}