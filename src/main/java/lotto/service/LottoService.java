package lotto.service;

import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

import static lotto.view.InputView.*;

public class LottoService {
    public static void lottoService() {
        int money, bonus;
        Lotto inputLottoNumber;
        try {
            money = inputMoney();
            inputLottoNumber = inputLottoNumber();
            bonus = inputBonusNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return;
        }
    }

    public static List<Integer> stringToIntList(String input) {
        String[] splitInput = input.split(",");
        List<Integer> output = new ArrayList<>();

        for (String e : splitInput) {
            output.add(Integer.parseInt(e));
        }
        return output;
    }
}
