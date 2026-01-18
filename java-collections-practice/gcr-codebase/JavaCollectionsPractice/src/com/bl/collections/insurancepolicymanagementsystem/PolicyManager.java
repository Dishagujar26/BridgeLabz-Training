package com.bl.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PolicyManager {

	 // Maps for different requirements
    HashMap<String, Policy> policyMap = new HashMap<>(); // fast lookup by policy number
    LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>(); // maintain insertion order
    TreeMap<LocalDate, List<Policy>> expiryDateMap = new TreeMap<>(); // sorted by expiry date

    // Add a new policy
    public void addPolicy(Policy p) {
        policyMap.put(p.policyNumber, p);
        insertionOrderMap.put(p.policyNumber, p);
        expiryDateMap.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
    }

    // Retrieve policy by number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring in next 'days' days
    public List<Policy> listPoliciesExpiringInNextDays(int days) {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate endDate = today.plusDays(days);
        for (Map.Entry<LocalDate, List<Policy>> entry :
                expiryDateMap.subMap(today, true, endDate, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }

    // List policies by policyholder name
    public List<Policy> listPoliciesByPolicyholder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.policyholderName.equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Policy> entry = it.next();
            Policy p = entry.getValue();
            if (p.expiryDate.isBefore(today)) {
                it.remove(); // remove from policyMap
                insertionOrderMap.remove(p.policyNumber); // remove from insertion order
                List<Policy> list = expiryDateMap.get(p.expiryDate);
                list.remove(p);
                if (list.isEmpty()) {
                    expiryDateMap.remove(p.expiryDate);
                }
            }
        }
    }

    // Display all policies in insertion order
    public void displayAllPolicies() {
        for (Policy p : insertionOrderMap.values()) {
            System.out.println(p);
        }
    }
}
