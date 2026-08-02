package ryan_brincadeiras.api.Grade;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GradeService {
    
    public Double getAverage(List<Double> grades) {
        if (grades.size() == 0) return 0.0;

        Double sum = 0.0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / grades.size();
    }
}
