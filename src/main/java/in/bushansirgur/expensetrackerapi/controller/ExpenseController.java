package in.bushansirgur.expensetrackerapi.controller;

import in.bushansirgur.expensetrackerapi.entity.Expense;
import in.bushansirgur.expensetrackerapi.service.ExpenseService;
import jakarta.validation.Valid;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ExpenseController {

@Autowired
private ExpenseService expenseService;
    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(Pageable page){
        int number = 1;
        calculateFactorial(number);
return  expenseService.getAllExpenses(page).toList();
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable Long id){
       return expenseService.getExpenseById(id);

    }
    @ResponseStatus(value =HttpStatus.NO_CONTENT)
    @DeleteMapping("/expenses")
    public void deleteExpenseById(@RequestParam Long id) {
        expenseService.deleteExpenseById(id);
    }
    @ResponseStatus(value= HttpStatus.CREATED)
    @PostMapping("/expenses")
    public Expense saveExpenseDetails(@Valid @RequestBody Expense expense){
       return expenseService.saveExpenseDetailes(expense);
    }
    @PutMapping("/expenses/{id}")
    public Expense updateExpenseDetails(@RequestBody Expense expense,@PathVariable Long id ){
       return expenseService.updateExpenseDetails(id, expense);
    }

    public int calculateFactorial(int number){
        return number * calculateFactorial(number - 1);
    }
}
