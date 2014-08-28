package cm.android.preference.util;

import java.io.Closeable;

public class IoUtil {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e) {
                // e.printStackTrace();
                //logger.error("", e);
            }
        }
    }
}