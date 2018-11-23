import ru.itaprk.DepositService;

class DepositServiceTest {

    @org.junit.jupiter.api.Test
    void calculateDeposit() {

        {
            DepositService depositService = new DepositService();
            int result = depositService.calculateDeposit(90_000, 3, 7);
            System.out.println(result);
        }

        {
            DepositService depositService = new DepositService();
            int result = depositService.calculateDeposit(1_000_000, 3, 16);
            System.out.println(result);
        }

    }
}