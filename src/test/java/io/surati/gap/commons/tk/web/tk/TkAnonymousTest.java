package io.surati.gap.commons.tk.web.tk;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.takes.rq.RqFake;
import org.takes.rs.RsPrint;
import org.takes.tk.TkText;

final class TkAnonymousTest {

    @Test
    void requestAnonymousPage() throws Exception {
        final String content = "I'm a public page !";
        MatcherAssert.assertThat(
            new RsPrint(
                new TkAnonymous(
                    new TkText(content)
                ).act(new RqFake())
            ).printBody(),
            Matchers.equalTo(content)
        );
    }
}
