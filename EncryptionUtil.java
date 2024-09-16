// Encryption utility
public class EncryptionUtil {
    private static final String AES_KEY = "my-secret-key";
    
    public static String encrypt(String message) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKey = new SecretKeySpec(AES_KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(message.getBytes()));
    }
}
