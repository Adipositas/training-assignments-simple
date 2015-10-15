using System;

namespace eu.sig.training.ch04.v3 {

    public static class Accounts {

        public static CheckingAccount findAcctByNumber(string number) {
            return new CheckingAccount();
        }

        // tag::isValid[]
        public static bool isValid(string number) {
            int sum = 0;
            for (int i = 0; i < number.Length; i++) {
                sum = sum + (9 - i) * (int)Char.GetNumericValue(number[i]);
            }
            return sum % 11 == 0;
        }
        // end::isValid[]
    }

}