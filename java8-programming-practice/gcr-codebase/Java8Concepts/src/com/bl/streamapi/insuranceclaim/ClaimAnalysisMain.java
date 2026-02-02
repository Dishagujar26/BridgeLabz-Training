package com.bl.streamapi.insuranceclaim;
import java.util.*;
import java.util.stream.*;

public class ClaimAnalysisMain {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Auto", 12000),
            new Claim("Health", 8000),
            new Claim("Auto", 7000),
            new Claim("Life", 15000)
        );

        Map<String, Double> avgClaimByType = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getType, 
                Collectors.averagingDouble(Claim::getAmount)
            ));

        avgClaimByType.forEach((type, avg) -> 
            System.out.println(type + " -> " + avg)
        );
    }
}
