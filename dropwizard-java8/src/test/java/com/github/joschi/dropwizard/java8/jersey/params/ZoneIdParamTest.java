package com.github.joschi.dropwizard.java8.jersey.params;

import org.junit.Test;

import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

public class ZoneIdParamTest {
    @Test
    public void parsesDateTimes() throws Exception {
        final ZoneIdParam param = new ZoneIdParam("Europe/Berlin");

        assertThat(param.get())
                .isEqualTo(ZoneId.of("Europe/Berlin"));
    }
}