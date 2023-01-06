package uusi.kolokvijumi.kol_02.zad_04;

import uusi.kolokvijumi.kol_01.zad_03.Array;
import uusi.kolokvijumi.kol_01.zad_04.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Graf graf = new Graf();
		graf.ReadGraphFromFile("Graph1.gr");
		//graf.printGraph();

		Vector<Integer> dfsr = graf.DFSRekurzivno(4);
		System.out.println("DFS Rekurzivno: " + dfsr.toString());
		
		Vector<Integer> dfsnr = graf.DFSNerekurzivno(4);
		System.out.println("DFS Rekurzivno: " + dfsnr.toString());
		*/
		//Vector<Integer> bfs = graf.Bfs(1);
		//System.out.println("BFS :" + bfs.toString());

		//Vector<Integer> dijsktra = graf.Dijkstra(1);
		//System.out.println("Dijkstra :" + dijsktra.toString());

		//Vector<Edge> mstK = graf.mstKruskal();
		//System.out.println(mstK);

		//Vector<Edge> mstP = graf.mstPrim(1);
		//System.out.println(mstP);
		zad_04();
	}

	public static void zad_04(){
		int mat[][]={
				{4, 2, 2},
				{6, 3, 6},
				{6, 4, 2}
		};
		int n = 3;
		int m = 3;

		int numNodes = 0;
		HashMap<Pair, Integer> pairInNode = new HashMap<Pair, Integer>();
		for(int i = 0; i<n;i++){
			for(int j = 0; j<m; j++){
				numNodes++;
				pairInNode.put(new Pair(i,j), numNodes);
			}
		}

		Graf graf = new Graf(numNodes);

		for(int i =0; i<n; i++){
			for(int j = 0; j<m; j++){
				for(int k = 0; k<n; k++){
					for(int l = 0; l<m; l++){
						if((Math.abs(i - j) + Math.abs(k - l)) <= 2){
							if(((mat[i][j]%2 == 0) && (mat[k][l]%2 != 0)) || ((mat[i][j]%2 != 0) && (mat[k][l]%2 == 0))){
								if((Math.abs(i - k) + Math.abs(j - l)) == (Math.abs(mat[i][j] - mat[k][l]))){
									graf.addEdgeInNonOrientedGraph(
											pairInNode.get(new Pair(i,j)),
											pairInNode.get(new Pair(k,l)),
											Math.abs(mat[i][j] - mat[k][l])
									);
								}
							}
						}
					}
				}
			}
		}
		graf.printGraph();
	}

}
