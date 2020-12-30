package icu.qfservice.cloud.pojo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResResult<T> {
    private Integer code;
    private String message;
    private T data;
    public ResResult(Integer code, String message) {
        this(code,message,null);
    }
}
