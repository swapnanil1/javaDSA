public class bitWiseOps {
    public static void main(String[] args) {
        //Get bit     Set Bit      Clear bit    Update bit
        // All Method Use Left SHIFT <<
        // Q-> Get the 3rd bit(position=2)of a number n .(n=0101)
        GetBit(5, 3);// And Gate
        // 5-> 0101
        // 3-> 0011
        //SetBit(13, 1); //OR Gate
        // 5-> 0101
        // 7-> 0111
        //ClearBit(13, 1); //not gate mask
        // updateBit(13, 1, 0);
    }

    static void updateBit(int n, int pos, int setTo) {
        int new_number = 0;
        // update is a mix of CLEAR & SET just we have a additional parameter to Update the bit to 1 or 0
        // if update to 1 then use SET ie; OR ops
        // if update to 0 then use CLEAR ie; AND with NOT (~(AND))
        int bitmask = 1 << pos;
        if (setTo == 1) {
            new_number = bitmask | n;
            System.out.println(new_number);
        } else {
            new_number = (~(bitmask)) & n;
            System.out.println(new_number);
        }
    }

    static void ClearBit(int n, int pos) {
        int bitmask = 1 << pos;
        int notBitmask = ~(bitmask);
        int new_number = (notBitmask & n);
        System.out.println(new_number);

    }

    static void SetBit(int n, int pos) {
        //convert 5 to 7 using Setbit
        int bitmask = 1 << pos;
        int new_number = (bitmask | n);
        System.out.println(new_number);
    }

    static void GetBit(int i, int pos) {
        int bitMask = 1 << pos;
        if ((bitMask & i) == 0)
            System.out.println("Bit Was Zero");
        else
            System.out.println("Bit Was One");

    }
}
