package db.execute.runtime;

import groovy.sql.Sql;
import java.lang.reflect.Method;

abstract class Binding {
    public static final int DEFAULT_JDBC = 0x7FFF_FFFF;
    public static final String DEFAULT_DB = '';
    
    final Method method;
    final String remoteName;

    public abstract String getSql();
    public abstract Object execute(Sql gsql, Object... arguments);
    
    public Binding(Method method, String remoteName) {
        this.method = method;
        this.remoteName = remoteName;
    }

    public Binding make(Dialect dialect, Method method) {
        if(Dialect.POSTGRESQL == dialect) {
            
        }
    }
}
