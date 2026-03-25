import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] graph;
    
    static Deque<int[]> queue;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            queue = new ArrayDeque<>();
            graph = new boolean[N][M];

            for(int k=0; k<K; k++) {
                st = new StringTokenizer(br.readLine());
                graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
            }

            int answer = 0;
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    if(graph[i][j]) {
                        queue.addLast(new int[]{i,j});
                        bfs();
                        answer++;
                    }
                }
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }

    static void bfs() {
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=M) {
                    continue;
                }

                if(graph[nx][ny]) {
                    graph[nx][ny] = false;
                    queue.addLast(new int[]{nx,ny});
                }
            }
        }
    }
}