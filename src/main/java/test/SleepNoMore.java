package test; /**
 * @Author: georgexie
 * @description: TODO
 * @Date: 2020/7/29 10:50
 * @Version 1.0
 */

import org.springframework.stereotype.Component;

/**
 * Ï·¾ç:¡¶²»ÃßÖ®Ò¹Sleep No More¡·
 */
@Component
public class SleepNoMore implements Performance {
    @Override
    public void perform() {
        System.out.println("Ï·¾ç¡¶²»ÃßÖ®Ò¹Sleep No More¡·");
    }
}
