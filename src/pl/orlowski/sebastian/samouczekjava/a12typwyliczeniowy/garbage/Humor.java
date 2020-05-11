package pl.orlowski.sebastian.samouczekjava.a12typwyliczeniowy.garbage;

public enum Humor {

    FIRSTOPTION {
        public String format(String message) {
            return "This is first option of your message so you want to say me " + message;
        }
    },

    SECONDOPTION{
        public String format(String message) {
            return "So you want to say me " + message;
        }
    };

    public abstract String format(String message);
}
