package com.gmail.davidsavignac.cooking.recipes.exception;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ErrorDetails {

    LocalDateTime timestamp;
    String message;
    String path;

}
