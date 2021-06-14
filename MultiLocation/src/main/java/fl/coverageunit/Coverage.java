package fl.coverageunit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;

public class Coverage {

    public enum Status {
        /**
         * Status flag for no items (value is 0x00).
         */
        EMPTY,
        /**
         * Status flag when all items are not covered (value is 0x01).
         */
        NOT_COVERED,
        /**
         * Status flag when all items are covered (value is 0x02).
         */
        COVERED,
        /**
         * Status flag when items are partly covered (value is 0x03).
         */
        PARTLY_COVERED
    }

    final private String className;
    final private List<Status> statuses;

    /** className : Coverage待定位的类名 statuses : Coverage对所有行测量的结果 classCoverage 覆类盖信息 */
    
    public Coverage(IClassCoverage classCoverage) {
        this.className = classCoverage.getName().replaceAll("/", ".");
        this.statuses = convertClassCoverage(classCoverage);
    }

    /** 把Coverage中储存的覆盖信息转成List<status> 实际上只是在进行enum的形式转变 */
    
    private List<Status> convertClassCoverage(IClassCoverage classCoverage) {
        final List<Coverage.Status> statuses = new ArrayList<>();
        for (int i = 1; i <= classCoverage.getLastLine(); i++) {
            final Coverage.Status status;
            final int s = classCoverage.getLine(i).getStatus();
            //System.out.println(s);
            if (s == ICounter.EMPTY) {
                status = Coverage.Status.EMPTY;
            } else if (s == ICounter.FULLY_COVERED || s == ICounter.PARTLY_COVERED) {
                status = Coverage.Status.COVERED;
            } else if (s == ICounter.NOT_COVERED) {
                status = Coverage.Status.NOT_COVERED;
            } else {
                status = Coverage.Status.EMPTY;
            }
            statuses.add(status);
        }
        return statuses;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final String separator = " ";
        sb.append(className + "\n");
        for (int i = 0; i < statuses.size(); i++) {
            sb.append(String.format("%2d", i + 1));
            sb.append(separator);
        }
        sb.append("\n");
        for (Status status : statuses) {
            sb.append(String.format("%2d", status.ordinal()));
            sb.append(separator);
        }
        return sb.toString();
    }

    /** 用HashMap存储各行的覆盖情况 */
    
    public HashMap<Integer, Integer> getStatusOfLine(){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int k = 1; k <= statuses.size(); k++){
            map.put(k, statuses.get(k-1).ordinal());
        }
        return map;                
    }

    /** 获取测试源代码的类名 */
    
    public String getName(){ 
        return className;
    }

    /** 获取测试源代码的行数 */
    
    public int getLength(){
        return statuses.size();
    }
}
