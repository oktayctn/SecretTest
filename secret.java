// Secret Configuration Example
public class SecretConfig {

    public static class Database {
        public static final String USERNAME = "db_user";
        public static final String PASSWORD = "P@ssw0rd123!";
    }

    public static class Api {
        public static final String API_KEY = "abcdef12345-secret-api-key";
        public static final String API_SECRET = "shhh-this-is-a-secret";
    }

    public static class Cloud {
        public static final String AWS_ACCESS_KEY_ID = "AKIAIOSFODNN7EXAMPLE";
        public static final String AWS_SECRET_ACCESS_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
        public static final String AZURE_CLIENT_ID = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx";
        public static final String AZURE_CLIENT_SECRET = "yJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ";
    }

    public static class Jwt {
        public static final String SECRET_KEY = "super-secret-jwt-key";
    }

    public static class Ssh {
        public static final String PRIVATE_KEY = """
            -----BEGIN RSA PRIVATE KEY-----
            MIIEpQIBAAKCAQEA...
            -----END RSA PRIVATE KEY-----
            """;
    }

    public static class OAuth {
        public static final String CLIENT_ID = "oauth-client-id-example";
        public static final String CLIENT_SECRET = "oauth-client-secret-example";
    }

    public static class Email {
        public static final String SMTP_USER = "email_user@example.com";
        public static final String SMTP_PASSWORD = "email_password";
    }

    public static class Payment {
        public static final String STRIPE_API_KEY = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
        public static final String PAYPAL_CLIENT_ID = "AdVf6R4GFkYp1b3m9vwsX1x5Gw";
        public static final String PAYPAL_CLIENT_SECRET = "EJX1oMlNz3Jz3bTosFG1vh1NT";
    }

    public static class Encryption {
        public static final String AES_KEY = "16charlongkey!!!";
        public static final String RSA_PUBLIC_KEY = """
            -----BEGIN PUBLIC KEY-----
            MIIBIjANBgkqhkiG...
            -----END PUBLIC KEY-----
            """;
    }
}
