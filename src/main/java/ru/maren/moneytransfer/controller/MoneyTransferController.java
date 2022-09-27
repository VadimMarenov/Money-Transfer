package ru.maren.moneytransfer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.maren.moneytransfer.model.request.ConfirmOperationRequest;
import ru.maren.moneytransfer.model.request.TransferRequest;
import ru.maren.moneytransfer.model.response.ConfirmOperationResponse;
import ru.maren.moneytransfer.model.response.TransferResponse;
import ru.maren.moneytransfer.service.MoneyTransferService;

@RestController
@AllArgsConstructor
public class MoneyTransferController {
    MoneyTransferService moneyTransferService;

    @PostMapping("/transfer")
    public TransferResponse postTransfer(@RequestBody TransferRequest transferRequest) {
        return moneyTransferService.transfer(transferRequest);
    }

    @PostMapping("/confirmOperation")
    public ConfirmOperationResponse postConfirmOperation(@RequestBody ConfirmOperationRequest confirmOperationRequest) {
        return moneyTransferService.confirmOperation(confirmOperationRequest);
    }
}
