package in.bushansirgur.expensetrackerapi.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorObject {
    private int statusCode;
    private String message;
    private Date timestamp;
}
