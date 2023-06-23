package Day4;

import java.util.HashMap;
import java.util.Map;

class Election {
    // HashMap lưu trữ thông tin về các ứng cử viên và số lượt vote tương ứng
    private HashMap<String, Integer> candidates;

    public Election() {
        candidates = new HashMap<>();
    }

    public void vote(String name) {
        // Kiểm tra xem ứng cử viên đã tồn tại trong HashMap chưa
        // Nếu chưa, thì thêm ứng cử viên mới và gán số lượt vote là 1
        // Nếu đã tồn tại, thì tăng số lượt vote lên 1
        candidates.put(name, candidates.getOrDefault(name, 0) + 1);
    }

    public String winner() {
        String winnerName = "";
        int maxVotes = 0;

        // Duyệt qua tất cả các ứng cử viên và tìm ứng cử viên có số lượt vote cao nhất
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            String name = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes) {
                maxVotes = votes;
                winnerName = name;
            }
        }

        return winnerName + " - " + maxVotes;
    }
}

