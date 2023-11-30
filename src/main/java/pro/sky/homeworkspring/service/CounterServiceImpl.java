package pro.sky.homeworkspring.service;

import org.springframework.stereotype.Service;
import pro.sky.homeworkspring.service.CounterService;

@Service
public class CounterServiceImpl implements CounterService {
    private int counter;

    @Override
    public int getRequestCount() {
        return ++counter;
    }
}
