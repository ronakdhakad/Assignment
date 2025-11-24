package SwingProject1.real_estate_project.util;
import java.util.regex.Pattern;

public class ValidationUtil {
  private static final Pattern EMAIL = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
  private static final Pattern PHONE = Pattern.compile("^[+0-9()\\-\\s]{7,20}$");
  private static final Pattern NAME = Pattern.compile("^[A-Za-z][A-Za-z\\s'.-]{1,}$");
  private static final Pattern TITLE = Pattern.compile("^[\\w\\s'.-]{3,}$");
  private static final Pattern PROPERTY_NO = Pattern.compile("^[A-Za-z0-9\\-_/]{2,64}$");
  private static final Pattern DECIMAL_POSITIVE = Pattern.compile("^(?:0|[1-9]\\d*)(?:\\.\\d{1,2})?$");
  private static final Pattern INT_POSITIVE = Pattern.compile("^[1-9]\\d*$");
  private static final Pattern DATE_YYYY_MM_DD = Pattern.compile("^(20|19)\\d{2}-((0[1-9])|(1[0-2]))-(([0][1-9])|([12]\\d)|(3[01]))$");
  private static final Pattern COMMISSION_RATE = Pattern.compile("^\\d{1,2}(?:\\.\\d{1,2})?$|^100(?:\\.0{1,2})?$");
  private static final Pattern PASSWORD_STRONG = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\w\\s]).{8,}$");

  public static void require(boolean ok, String msg){ if(!ok) throw new IllegalArgumentException(msg); }
  public static void email(String s){ require(s == null || s.isEmpty() || EMAIL.matcher(s).matches(), "Invalid email format"); }
  public static void phone(String s){ require(s == null || s.isEmpty() || PHONE.matcher(s).matches(), "Invalid phone format"); }
  public static void name(String s){ require(s != null && NAME.matcher(s).matches(), "Invalid name"); }
  public static void title(String s){ require(s != null && TITLE.matcher(s).matches(), "Invalid title"); }
  public static void propertyNo(String s){ require(s != null && PROPERTY_NO.matcher(s).matches(), "Invalid property number"); }
  public static void price(String s){ require(s != null && DECIMAL_POSITIVE.matcher(s).matches(), "Invalid price"); }
  public static void sizeSqft(String s){ require(s == null || s.isEmpty() || INT_POSITIVE.matcher(s).matches(), "Invalid size (sqft must be integer)"); }
  public static void sellerId(String s){ require(s == null || s.isEmpty() || INT_POSITIVE.matcher(s).matches(), "Invalid seller ID"); }
  public static void date(String s){ require(s != null && DATE_YYYY_MM_DD.matcher(s).matches(), "Invalid date format (yyyy-MM-dd)"); }
  public static void amount(String s){ require(s != null && DECIMAL_POSITIVE.matcher(s).matches(), "Invalid amount"); }
  public static void commission(String s){ require(s != null && COMMISSION_RATE.matcher(s).matches(), "Invalid commission % (0–100)"); }
  public static void passwordStrong(String s){ require(s != null && PASSWORD_STRONG.matcher(s).matches(), "Password must be 8+ chars with upper, lower, digit, special"); }
}
