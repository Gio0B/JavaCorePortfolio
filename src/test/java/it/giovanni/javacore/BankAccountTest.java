
package it.giovanni.javacore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    // CONSTRUCTOR TESTS

    @Test
    void shouldCreateBankAccountWithValidValues() {
        BankAccount account = new BankAccount("John", 100.0);

        assertNotNull(account);
        assertEquals("John", account.getOwner());
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void shouldCreateBankAccountWithZeroBalance() {
        BankAccount account = new BankAccount("John", 0.0);

        assertEquals(0.0, account.getBalance());
    }

    @Test
    void shouldThrowExceptionWhenOwnerIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount(null, 100.0));
    }

    @Test
    void shouldThrowExceptionWhenOwnerIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("", 100.0));
    }

    @Test
    void shouldThrowExceptionWhenOwnerIsBlank() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("   ", 100.0));
    }

    @Test
    void shouldThrowExceptionWhenInitialBalanceIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("John", -10.0));
    }

    @Test
    void shouldThrowExceptionWhenInitialBalanceIsInfinite() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("John", Double.POSITIVE_INFINITY));
    }

    @Test
    void shouldThrowExceptionWhenInitialBalanceIsNaN() {
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("John", Double.NaN));
    }

    // DEPOSIT TESTS

    @Test
    void shouldDepositMoneySuccessfully() {
        BankAccount account = new BankAccount("John", 100.0);

        assertTrue(account.deposit(50.0));
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void shouldDepositMoneyIntoZeroBalance() {
        BankAccount account = new BankAccount("John", 0.0);

        account.deposit(50.0);

        assertEquals(50.0, account.getBalance());
    }

    @Test
    void shouldThrowExceptionWhenDepositIsZero() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(0.0));
    }

    @Test
    void shouldThrowExceptionWhenDepositIsNegative() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-10.0));
    }

    @Test
    void shouldThrowExceptionWhenDepositIsInfinite() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(Double.POSITIVE_INFINITY));
    }

    @Test
    void shouldThrowExceptionWhenDepositIsNaN() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(Double.NaN));
    }

    @Test
    void shouldThrowExceptionWhenDepositExceedsMaximumBalance() {
        BankAccount account = new BankAccount("John", Double.MAX_VALUE);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(Double.MAX_VALUE));
    }

    // WITHDRAW TESTS

    @Test
    void shouldWithdrawMoneySuccessfully() {
        BankAccount account = new BankAccount("John", 100.0);

        assertTrue(account.withdraw(40.0));
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void shouldWithdrawTheEntireBalance() {
        BankAccount account = new BankAccount("John", 100.0);

        account.withdraw(100.0);

        assertEquals(0.0, account.getBalance());
    }

    @Test
    void shouldThrowExceptionWhenWithdrawIsZero() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(0.0));
    }

    @Test
    void shouldThrowExceptionWhenWithdrawIsNegative() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(-10.0));
    }

    @Test
    void shouldThrowExceptionWhenWithdrawIsInfinite() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(Double.POSITIVE_INFINITY));
    }

    @Test
    void shouldThrowExceptionWhenWithdrawIsNaN() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(Double.NaN));
    }

    @Test
    void shouldThrowExceptionWhenWithdrawExceedsBalance() {
        BankAccount account = new BankAccount("John", 100.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(150.0));
    }

    @Test
    void shouldThrowExceptionWhenWithdrawFromZeroBalance() {
        BankAccount account = new BankAccount("John", 0.0);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(10.0));
    }

    // GETTER AND TOSTRING TESTS

    @Test
    void shouldReturnCorrectOwner() {
        BankAccount account = new BankAccount("John", 100.0);

        assertEquals("John", account.getOwner());
    }

    @Test
    void shouldReturnCorrectBalance() {
        BankAccount account = new BankAccount("John", 250.0);

        assertEquals(250.0, account.getBalance());
    }

    @Test
    void shouldReturnCorrectStringRepresentation() {
        BankAccount account = new BankAccount("John", 100.0);

        assertEquals(
                "BankAccount [owner=John, balance=100.0]",
                account.toString()
        );
    }
}
