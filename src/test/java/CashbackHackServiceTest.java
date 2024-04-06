import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldTestCashbackHackService () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldTestRemainCashbackHackService () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void shouldTestRemainCashbackHackService2 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldTestRemainCashbackHackService3 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldTestRemainCashbackHackService4 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldTestRemainCashbackHackService5 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldTestRemainCashbackHackService6 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

}
