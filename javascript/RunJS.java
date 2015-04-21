import javax.script.*;
import java.io.*;

public class RunJS {
    public static class IO {
        private final ScriptEngine engine;
        public IO(final ScriptEngine engine) {
            this.engine = engine;
        }

        public void print(final String message) {
            System.out.print(message);
        }

        public void println(final String message) {
            System.out.println(message);
        }

        public void include(final String file) throws Exception {
            engine.eval(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        }
    }
    public static void main(final String[] args) throws ScriptException, IOException {
        final ScriptEngineManager factory = new ScriptEngineManager();
        final ScriptEngine engine = factory.getEngineByName("JavaScript");
        engine.put("io", new IO(engine));
        engine.eval(
            "var println = function() { io.println(Array.prototype.map.call(arguments, String).join(' ')); };" +
            "var print   = function() { io.print  (Array.prototype.map.call(arguments, String).join(' ')); };" +
            "var include = function(file) { io.include(file); }"
        );

        engine.eval(new InputStreamReader(new FileInputStream("script.js"), "UTF-8"));
    }
}
