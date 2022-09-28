package exe2;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Boi extends BankingSystem {
    BankingSystem b = new BankingSystem();
    int withdrawn = 0;
    int dep = 0;
    int prev_transaction;
    String tran_Status;

    int deposite(int money) {
        dep = b.getsalary() + money;
        return dep;
    }

    int withDrawl(int money) {
        withdrawn = dep - money;
        try {
            if (withdrawn < 0) {
                System.out.println("Deposite can not be negative..");
                tran_Status = "TRANSACTION FAIL";
                return withdrawn;
            } else {
                tran_Status = "TRANSACTION PASS!";
                return withdrawn;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("TRANSACTION FAILURE!!");
        }
        return 0;
    }

    void log() {

        System.out.print("Time of transaction : ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("User Account Number: " + b.getAccountNo());

        System.out.println("Amount withdrawn: " + withdrawn);
        System.out.println("Amount before withdrawn: " + dep);
        System.out.println("Amount After withdrawn: " + withdrawn);
        System.out.println("Amount After withdrawn: " + tran_Status);
    }

    void exit() {
        System.exit(0);
    }

}