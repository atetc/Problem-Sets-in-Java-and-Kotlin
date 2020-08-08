package com.atetc.chap07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Imagine you have a call center with three levels of employees: fresher, technical lead (TL), product manager (PM).
 * There can be multiple employees, but only one TL or PM. An incoming telephone call must be allocated to a fresher who is free.
 * If a fresher can’t handle the call, he or she must escalate the call to technical lead.
 * If the TL is not free or not able to handle it, then the call should be escalated to PM. Design the classes and data structures for this problem.
 * Implement a method getCallHandler().
 */

public class Q2 {

    static final int LEVELS = 3;

    private ArrayList<Employee>[] mEmployeeLevels = new ArrayList[LEVELS];
    private Queue<Employee>[] mHandlersQueues = new LinkedList[LEVELS];

    public Q2() {

    }

    public Q2(int f) {
        mEmployeeLevels[0] = new ArrayList<>();
        mEmployeeLevels[1] = new ArrayList<>();
        mEmployeeLevels[2] = new ArrayList<>();

        mHandlersQueues[0] = new LinkedList<>();
        mHandlersQueues[1] = new LinkedList<>();
        mHandlersQueues[2] = new LinkedList<>();

        for (int i = 0; i < f; i++) {
            mEmployeeLevels[0].add(new Fresher());
        }

        mEmployeeLevels[1].add(new TechLead());
        mEmployeeLevels[2].add(new ProductManager());
    }

    public Call call() {
        Employee callHandler = getCallHandler();
        mHandlersQueues[callHandler.rank].add(callHandler);
        if (callHandler != null) {
            return new Call(callHandler, this);
        }

        return null;
    }

    public Employee getCallHandler() {
        for (int level = 0; level < LEVELS; level++) {
            if (mHandlersQueues[level].size() < mEmployeeLevels[level].size()) {
                for (Employee employee : mEmployeeLevels[level]) {
                    if (!mHandlersQueues[level].contains(employee)) {
                        return employee;
                    }
                }
            }
        }

        return null;
    }

    public class Call {
        private final Q2 mCallCentre;
        public Employee mCallHandler;

        public Call(Employee employee, Q2 callCentre) {
            mCallHandler = employee;
            mCallCentre = callCentre;
        }

        public void handled() {
            mCallCentre.rid(mCallHandler);
        }
    }

    private void rid(Employee callHandler) {
        mHandlersQueues[callHandler.rank].remove(callHandler);
    }

    public class Employee {
        int rank; // 0- fresher, 1 - technical lead, 2 - product manager

        public Employee(int rank) {
            this.rank = rank;
        }
    }

    public class Fresher extends Employee {
        public Fresher() { super(0); }
    }

    public class TechLead extends Employee {
        public TechLead() { super(1); }
    }

    public class ProductManager extends Employee {
        public ProductManager() { super(2); }
    }
}