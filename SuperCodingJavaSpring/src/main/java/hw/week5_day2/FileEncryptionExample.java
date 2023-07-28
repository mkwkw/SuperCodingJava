package hw.week5_day2;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptionExample {
    public static void main(String[] args) throws IOException {

        //http://www.jasypt.org/api/jasypt/1.8/org/jasypt/encryption/pbe/StandardPBEStringEncryptor.html
        String encryptedOutputFilePath = "C:\\Users\\mkkw2\\Documents\\GitHub\\SuperCodingJavaSpring\\src\\main\\java\\hw\\week5_day2\\encrypted_abc.txt";
        String decryptedOutputFilePath = "SuperCodingJavaSpring/src/main/java/hw/week5_day2/encrypted_abc.txt";

        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";

        // jasypt 라이브러리 이용해서 복호화
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(PW); //키
        encryptor.setAlgorithm(ALGORITHM); //알고리즘
        encryptor.setSaltGenerator(new StringFixedSaltGenerator(SALT_GENERATOR));

        String text = encryptor.decrypt(readTextFile(encryptedOutputFilePath));
        System.out.println("Decrypted text: "+text);
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
