package ru.maren.moneytransfer.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferResponse {
    private String operationId;
    private String code;

}
