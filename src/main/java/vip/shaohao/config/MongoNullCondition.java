package vip.shaohao.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: Shaohao 2623537618@qq.com
 **/
public class MongoNullCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String database = context.getEnvironment().getProperty("shaohao.database");
        return !"mongodb".equalsIgnoreCase(database);
    }
}
