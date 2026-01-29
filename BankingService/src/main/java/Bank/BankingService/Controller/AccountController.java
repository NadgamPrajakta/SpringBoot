package Bank.BankingService.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.*;

import Bank.BankingService.DTO.AccountDto;
import Bank.BankingService.Entity.Account;


@RestController
@RequestMapping("/account")
public class AccountController {

    List<Account> db = new ArrayList<>();

    @PostMapping("/add")
    public Account addAccount(@RequestBody Account account) {

        if (account != null) {
            db.add(account);
            System.out.println("Account added in Bank: "
                    + account.getBank().getBankName());
        }
        return account;
    }

    @GetMapping("/get-all")
    public List<AccountDto> getAllAccounts() {

        return db.stream().map(a -> {
            AccountDto dto = new AccountDto();
            dto.setAccNo(a.getAccNo());
            dto.setHolderName(a.getHolderName());
            dto.setBankName(a.getBank().getBankName());
            dto.setIfsc(a.getBank().getIfsc());
            return dto;
        }).collect(Collectors.toList());
    }
}
