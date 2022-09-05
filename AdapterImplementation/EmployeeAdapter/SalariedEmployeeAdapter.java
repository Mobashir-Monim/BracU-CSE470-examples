interface SalariedEmployeeAdapter extends SalariedEmployee {

    calculatePayment (Fin calculatable) {
        return super.calculateSalary(calculatable.salary, calculatable.leaves, calculatable.bonues);
    }
}