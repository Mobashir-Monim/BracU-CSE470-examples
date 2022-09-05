interface HourlyEmployeeAdapter extends HourlyEmployee {

    calculatePayment (Fin calculatable) {
        return super.calculatePayable(calculatable.hours, calculatable.rate);
    }
}