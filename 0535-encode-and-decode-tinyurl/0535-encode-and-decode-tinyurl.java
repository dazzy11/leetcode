public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longu) {
        longu="a"+longu;
        return longu;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortu) {
        return shortu.substring(1, shortu.length());
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));