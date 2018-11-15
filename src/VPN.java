public class VPN {
    public static void main(String[] args) {
        testSessionKey();
    }

    private static void testSessionKey() {
        SessionKey key1 = new SessionKey(128);
        SessionKey key2 = new SessionKey(key1.encodeKey());

        if (key1.getSecretKey().equals(key2.getSecretKey())) {
            System.out.println("The keys match");
        }
        else {
            System.out.println("The keys do not match");
        }
    }
}
