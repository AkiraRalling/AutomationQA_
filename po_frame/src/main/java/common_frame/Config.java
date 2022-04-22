package common_frame;

public class Config {
    public static final String PLATFORM_DRIVER = "win_chrome";

    /** Clear cookies and storage
     * if true = cookies clean
     */
    public static final boolean CLEAR_COOKIES_AND_STORAGE = true;

    /** Here is constans
     * for count cards on page
     */
    public static final int REAL_COUNT_CARDS_IN_LIST = 20;
    /**
     * Quite driver
     * if true = we quite from browser
     */
    public static final boolean BROWSER_QUITE = true;

    /** Method for timeouts
     *
     */
    public static class TimeoutsVariables {
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 6;
    }

    /** Get Home URL
     *  from this class and method
     */

    public static class Urls {
        public static final String REALT_HOME_PAGE = "https://realt.by/";
    }
}
