/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developer.turing.com;

import java.util.*;
import java.lang.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 *
 * @author Dell
 */

/**
 * @param args the command line arguments
 */
    //Compiler version 1.8.0_111
class Solution {

    /**
     * @param {string[][]} travel_time
     * @param {string[][]} points
     * @param {string} start_token
     * @return Result = {Int, []} = {total, path}
     */

    public static Result distance_path(String[][] travel_time, String[][] points, String start_token) {
        Result res = new Result();
        int total = 0;
        String[] path = null;
        // Put your code here to calculate total and path

        // Return the result, do not change the structure
        res.total = total;
        if (path == null) {
            path = new String[]{};
        }
        res.path = path;
        return res;
    }
}

class Result {

    int total;
    String[] path;
}

class DeveloperTuringCom {

    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,
                StandardCharsets.UTF_8));
        List<String> lines
                = br.lines().collect(Collectors.toList());

        int time_section_count = 0;

        int total_lines = lines.size();

        while (lines.get(time_section_count)
                != null && !lines.get(time_section_count).isEmpty()) {
            time_section_count++;
        }
        String[][] travel_time = new String[time_section_count][];
        String[][] points = new String[total_lines - time_section_count - 1][];

        for (int index = 0; index < time_section_count; index++) {
            travel_time[index] = lines.get(index).split(" ");
        }
        for (int index = time_section_count + 1; index < total_lines; index++) {
            points[index - time_section_count - 1] = lines.get(index).split(" ");
        }

        String start_token = "START";
        Result res = Solution.distance_path(travel_time, points, start_token);
        System.out.println(String.valueOf(res.total) + " " + String.join(",", res.path));
    }
}
