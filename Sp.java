
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Shared Preferences Class, simple save and get data from android SharedPreferences
 * 
 * @author mahdi pishguy
 * @update ‎Thursday, ‎January ‎22, ‎2015
 */
public class SP {

    private static SP _singletonInstance;


    private SP() {}


    public static synchronized SP getInstance() {
        if (_singletonInstance == null)
            _singletonInstance = new SP();
        return _singletonInstance;
    }


    private SharedPreferences getPrefs() {
        return G.context.getSharedPreferences("Tsms", Context.MODE_PRIVATE);
    }


    public String getString(SharedPrefsTypes propertyName) {
        return getPrefs().getString(propertyName.toString(), "");
    }


    public int getInt(SharedPrefsTypes propertyName) {
        return getPrefs().getInt(propertyName.toString(), 0);
    }


    public long getLong(SharedPrefsTypes propertyName) {
        return getPrefs().getLong(propertyName.toString(), 0);
    }


    public boolean getBoolean(SharedPrefsTypes propertyName) {
        return getPrefs().getBoolean(propertyName.toString(), false);
    }


    public boolean getBoolean(SharedPrefsTypes propertyName, boolean value) {
        return getPrefs().getBoolean(propertyName.toString(), value);
    }


    public void setString(SharedPrefsTypes propertyName, String value) {
        getPrefs().edit().putString(propertyName.toString(), value).commit();
    }


    public void setInt(SharedPrefsTypes propertyName, int value) {
        getPrefs().edit().putInt(propertyName.toString(), value).commit();
    }


    public void setLong(SharedPrefsTypes propertyName, Long value) {
        getPrefs().edit().putLong(propertyName.toString(), value).commit();
    }


    public void setBoolean(SharedPrefsTypes propertyName, boolean value) {
        getPrefs().edit().putBoolean(propertyName.toString(), value).commit();
    }


    public enum SharedPrefsTypes {
        LoginStats
    }
}
