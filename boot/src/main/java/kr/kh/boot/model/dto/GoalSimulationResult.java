package kr.kh.boot.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoalSimulationResult {
    private int years;        // 몇 년 걸렸는지
    private long finalAmount; // 도달 시점의 총 자산
    private double actualReturnRate; // 세금 계산
    private List<Long> yearlyAssets; // 연도별 그래프 추적
    private List<Long> cumulativeProfits; //  누적 수익 필드 추가
    private List<Long> yearlyProfits; // 년도별 수익 비교

}
