package in.bushansirgur.expensetrackerapi.service;

import in.bushansirgur.expensetrackerapi.entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ExpenseService {
   Page<Expense> getAllExpenses(Pageable page);
   Expense getExpenseById(Long id);
   void deleteExpenseById(Long id);
   Expense saveExpenseDetailes(Expense expense);
   Expense updateExpenseDetails(Long id, Expense expense);
}
