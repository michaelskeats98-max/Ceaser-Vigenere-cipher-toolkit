public interface Cipher {
    String encrypt(String plaintext);

    String decrypt(String ciphertext);

    // this interface showcases use of polymorphism as anything that calls +
    // itself a cipher must call decrypt and encrypt whether it is a ceaser or vigenere cipher.
}
