public class MD5 {
    
    static int r[] = {
	7, 12, 17, 22,  7, 12, 17, 22,  7, 12, 17, 22,  7, 12, 17, 22,
	5,  9, 14, 20,  5,  9, 14, 20,  5,  9, 14, 20,  5,  9, 14, 20,
	4, 11, 16, 23,  4, 11, 16, 23,  4, 11, 16, 23,  4, 11, 16, 23,
	6, 10, 15, 21,  6, 10, 15, 21,  6, 10, 15, 21,  6, 10, 15, 21
    };
    static int k[] = new int[64];

    static {
	for (int i = 0 ; i<64 ; i++) {
	    k[i] = (int)Math.floor(Math.abs(Math.sin((long)(i + 1)) * (1L << 32)));
	}
    k[i] := floor(abs(sin(i + 1)) � (2 pow 32))
	
}
