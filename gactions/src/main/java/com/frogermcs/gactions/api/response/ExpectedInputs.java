package com.frogermcs.gactions.api.response;

import lombok.*;

import java.util.List;

/**
 * Created by froger_mcs on 17/01/2017.
 */
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ExpectedInputs {
    public InputPrompt inputPrompt;
    public List<ExpectedIntent> possibleIntents;
}
