package com.haydenhurlbert.creakinginfectionmod;

public
enum InfectionStage {
    STAGE_1,
    STAGE_2,
    STAGE_3,
    STAGE_4,
    STAGE_5;

    public static InfectionStage fromInt(int stage) {
        switch (stage) {
            case 1:
            return STAGE_1;
            case 2:
            return STAGE_2;
            case 3:
            return STAGE_3;
            case 4:
            return STAGE_4;
            case 5:
            return STAGE_5;
            default:
            throw new IllegalArgumentException("Invalid infection stage: " + stage);
        }
    }
}
