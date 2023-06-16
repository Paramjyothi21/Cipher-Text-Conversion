# Caesar Cipher 
- In this all characters of plain text is replaced by other characters with same pattern.
- A Caesar cipher is a simple method of encoding messages. Caesar ciphers use a substitution method where letters in the alphabet are shifted by some fixed number of spaces to yield an encoding alphabet. A Caesar cipher with a shift of 1 would encode an A as a B, an M as an N, and a Z as an A, and so on.
- Cryptosystems use a set of procedures known as cryptographic algorithms, or ciphers, to encrypt and decrypt messages to secure communications among devices and applications.

### Algorithm
- Choose a value to shift the alphabet by.
- Make a table where the top row contains letters in standard alphabetical order, and the bottom row is the new shifted alphabet.


![image](https://user-images.githubusercontent.com/88529671/218424328-ab741360-a66c-402a-ac40-3dc0f2b05443.png)

- Encode the message by exchanging each letter in the message with the equivalent shifted letter.
- Make sure that the message’s intended recipient knows the shifting scheme you used to encode the message so they can decode it.
- To decrypt a message encoded with a Caesar cipher, simply take the value of 26 minus the shift value, and apply that new value to shift the encoded message back to its original form.
- A public key associated with the creator/sender for encrypting messages and a private key that only the originator knows (unless it is exposed or they decide to share it) for decrypting that information.
