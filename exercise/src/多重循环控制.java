import java.util.Scanner;

public class 多重循环控制 {
    /**
     * 统计3个班的成绩情况
     * 每个班有5名同学
     * 求各个班级的平均分和所有班级的平均分
     * @param args
     */
    public static void main(String[] args) {
        double class_score_avg = 0.0;
        double all_class_score_avg = 0.0;
        double score = 0.0;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.printf("请输入第%d个班级,第%d个学生成绩:",i,j);
                score = sc.nextDouble();
                class_score_avg += score;
            }
            System.out.printf("第%d个班级的总分是%.2f,平均分=%.2f\n",i,class_score_avg,(class_score_avg/5));
            //循环结束一个班级就将分数清零，否则会将前面班级的分数加到当前班级
            class_score_avg = 0;
            all_class_score_avg += class_score_avg;


        }
        System.out.printf("所有班级的总成绩是%.2f,平均成绩=%.2f",all_class_score_avg,(all_class_score_avg)/3);
    }
}
