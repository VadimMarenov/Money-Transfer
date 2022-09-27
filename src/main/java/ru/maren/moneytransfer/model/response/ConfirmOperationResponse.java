package ru.maren.moneytransfer.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfirmOperationResponse {
    String operationId;
}
