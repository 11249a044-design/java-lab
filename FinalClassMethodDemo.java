class SecuritySystem {
    final void authenticateUser(String username) {
        System.out.println("Authenticating user: " + username + " via core security protocol.");
    }

    void logAccess() {
        System.out.println("Standard access logging...");
    }
}

class AdvancedSecurity extends SecuritySystem {
    @Override
    void logAccess() {
        System.out.println("Advanced encrypted access logging...");
    }
}

final class EncryptedData {
    void showData() {
        System.out.println("Displaying highly secure encrypted data.");
    }
}

public class FinalClassMethodDemo {
    public static void main(String[] args) {
        AdvancedSecurity sec = new AdvancedSecurity();
        sec.authenticateUser("Admin");
        sec.logAccess();

        EncryptedData data = new EncryptedData();
        data.showData();
    }
}