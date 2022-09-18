package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class StreamRank {
    List<Integer> rankList;
    public StreamRank() {

    }

    public void track(int x) {
        if (rankList == null) {
            rankList = new ArrayList<>();
            rankList.add(x);
        } else {
            int left = 0;
            int right = rankList.size() - 1;
            int insertIdx = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (rankList.get(mid) > x) {
                    right = mid - 1;
                } else if (rankList.get(mid) < x) {
                    left = mid + 1;
                    insertIdx = left;
                } else {
                    insertIdx = mid;
                    break;
                }
            }
            rankList.add(insertIdx, x);
        }
    }

    public int getRankOfNumber(int x) {
        if (rankList == null || rankList.size() == 0) {
            return 0;
        }
        int left = 0;
        int right = rankList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (rankList.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public static void main(String[] args) {
        StreamRank streamRank = new StreamRank();
        System.out.println(streamRank.getRankOfNumber(8));
        System.out.println(streamRank.getRankOfNumber(6));
        System.out.println(streamRank.getRankOfNumber(8));
        streamRank.track(6);
        System.out.println(streamRank.getRankOfNumber(7));
        streamRank.track(1);
        streamRank.track(8);
        System.out.println(streamRank.getRankOfNumber(0));
        streamRank.track(0);
        streamRank.track(7);
        System.out.println(streamRank.getRankOfNumber(2));
        System.out.println(streamRank.getRankOfNumber(2));
        streamRank.track(6);
        System.out.println(streamRank.getRankOfNumber(5));
        System.out.println(streamRank.getRankOfNumber(8));
        System.out.println(streamRank.getRankOfNumber(1));
        System.out.println(streamRank.getRankOfNumber(4));
        streamRank.track(7);
        streamRank.track(6);
        streamRank.track(1);
    }
}
