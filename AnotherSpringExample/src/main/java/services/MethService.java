package services;

import org.springframework.stereotype.Service;
@Service

public class MethService
    implements MethServicable{

    @Override
    public double power(int a, int x) {
        return Math.pow(a,x);
    }

    @Override
    public double add(int a, int b) {
        return a + b;
    }
}
