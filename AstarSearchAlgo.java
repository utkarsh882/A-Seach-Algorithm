import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AstarSearchAlgo{


        //h scores is the stright-line distance from the current city to Bucharest
        public static void main(String[] args){
                
                System.out.print("Enter the Starting node: ");
                Scanner sc = new Scanner(System.in);
                String target = sc.nextLine();
                    
                System.out.print("Enter the end node: ");
                String end = sc.nextLine();
                
               
            
                System.out.println("Enter Straightline Distances :");
                
                System.out.print("Distance between Arad and "+end+": ");
                int Ate = sc.nextInt();
                
                System.out.print("Distance between Zerind and "+end+": ");
                int Zte = sc.nextInt();
                
                System.out.print("Distance between Oradea and "+end+": ");
                int Ote = sc.nextInt();
                
                System.out.print("Distance between Sibiu and "+end+": ");
                int Ste = sc.nextInt();
                
                System.out.print("Distance between Fagaras and "+end+": ");
                int Fte = sc.nextInt();
                
                System.out.print("Distance between Rimnicu Vilcea and "+end+": ");
                int RVte = sc.nextInt();
                
                System.out.print("Distance between Pitesti and "+end+": ");
                int Pte = sc.nextInt();
                
                System.out.print("Distance between Timisoara and "+end+": ");
                int Tte = sc.nextInt();
                
                System.out.print("Distance between Lugoj and "+end+": ");
                int Lte = sc.nextInt();
                
                System.out.print("Distance between Mehadia and "+end+": ");
                int Mte = sc.nextInt();
                
                System.out.print("Distance between Dobreta and "+end+": ");
                int Dte = sc.nextInt();
                
                System.out.print("Distance between Craiova and "+end+": ");
                int Cte = sc.nextInt();
                
                System.out.print("Distance between Bucharest and "+end+": ");
                int Bte = sc.nextInt();
                
                System.out.print("Distance between Giurgiu and "+end+": ");
                int Gte = sc.nextInt();
                
                //initialize the graph base on the Romania map
//                Node n1 = new Node("Arad",366);
                Node n1 = new Node("Arad",Ate);
//                Node n2 = new Node("Zerind",374);
                Node n2 = new Node("Zerind",Zte);
//                Node n3 = new Node("Oradea",380);
                Node n3 = new Node("Oradea",Ote);
//                Node n4 = new Node("Sibiu",253);
                Node n4 = new Node("Sibiu",Ste);
//                Node n5 = new Node("Fagaras",178);
                Node n5 = new Node("Fagaras",Fte);
//                Node n6 = new Node("Rimnicu Vilcea",193);
                Node n6 = new Node("Rimnicu Vilcea",RVte);
//                Node n7 = new Node("Pitesti",98);
                Node n7 = new Node("Pitesti",Pte);
//                Node n8 = new Node("Timisoara",329);
                Node n8 = new Node("Timisoara",Tte);
//                Node n9 = new Node("Lugoj",244);
                Node n9 = new Node("Lugoj",Lte);
//                Node n10 = new Node("Mehadia",241);
                Node n10 = new Node("Mehadia",Mte);
//                Node n11 = new Node("Drobeta",242);
                Node n11 = new Node("Dobreta",Dte);
//                Node n12 = new Node("Craiova",160);
                Node n12 = new Node("Craiova",Cte);
//                Node n13 = new Node("Bucharest",0);
                Node n13 = new Node("Bucharest",Bte);
//                Node n14 = new Node("Giurgiu",77);
                Node n14 = new Node("Giurgiu",Gte);
 
                


                //initialize the edges

                //Arad
                n1.adjacencies = new Edge[]{
                        new Edge(n2,75),
                        new Edge(n4,140),
                        new Edge(n8,118)
                };
                 
                 //Zerind
                n2.adjacencies = new Edge[]{
                        new Edge(n1,75),
                        new Edge(n3,71)
                };
                 

                 //Oradea
                n3.adjacencies = new Edge[]{
                        new Edge(n2,71),
                        new Edge(n4,151)
                };
                 
                 //Sibiu
                n4.adjacencies = new Edge[]{
                        new Edge(n1,140),
                        new Edge(n5,99),
                        new Edge(n3,151),
                        new Edge(n6,80),
                };
                 

                 //Fagaras
                n5.adjacencies = new Edge[]{
                        new Edge(n4,99),

                        //178
                        new Edge(n13,211)
                };
                 
                 //Rimnicu Vilcea
                n6.adjacencies = new Edge[]{
                        new Edge(n4,80),
                        new Edge(n7,97),
                        new Edge(n12,146)
                };
                 
                 //Pitesti
                n7.adjacencies = new Edge[]{
                        new Edge(n6,97),
                        new Edge(n13,101),
                        new Edge(n12,138)
                };
                 
                 //Timisoara
                n8.adjacencies = new Edge[]{
                        new Edge(n1,118),
                        new Edge(n9,111)
                };
                 
                 //Lugoj
                n9.adjacencies = new Edge[]{
                        new Edge(n8,111),
                        new Edge(n10,70)
                };

                 //Mehadia
                n10.adjacencies = new Edge[]{
                        new Edge(n9,70),
                        new Edge(n11,75)
                };
                 
                 //Dobreta
                n11.adjacencies = new Edge[]{
                        new Edge(n10,75),
                        new Edge(n12,120)
                };

                 //Craiova
                n12.adjacencies = new Edge[]{
                        new Edge(n11,120),
                        new Edge(n6,146),
                        new Edge(n7,138)
                };

                //Bucharest
                n13.adjacencies = new Edge[]{
                        new Edge(n7,101),
                        new Edge(n14,90),
                        new Edge(n5,211)
                };
                 
                 //Giurgiu
                n14.adjacencies = new Edge[]{
                        new Edge(n13,90)
                };
                
                
                if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n1,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n2,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n1,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n3,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n1,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n4,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n1,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n5,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n1,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n6,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n1,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n7,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n1,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n8,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n1,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n9,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n1,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n10,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n1,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n11,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n1,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n12,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n1,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n13,n1);
                }
                
                else if(target.equalsIgnoreCase("Arad") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n1,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Arad")){
                AstarSearch(n14,n1);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n2,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n3,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n2,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n4,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n2,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n5,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n2,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n6,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n2,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n7,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n2,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n8,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n2,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n9,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n2,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n10,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n2,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n11,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n2,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n12,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n2,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n13,n2);
                }
                
                else if(target.equalsIgnoreCase("Zerind") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n2,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Zerind")){
                AstarSearch(n14,n2);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n3,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n4,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n3,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n5,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n3,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n6,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n3,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n7,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n3,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n8,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n3,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n9,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n3,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n10,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n3,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n11,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n3,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n12,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n3,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n13,n3);
                }
                
                else if(target.equalsIgnoreCase("Oradea") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n3,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Oradea")){
                AstarSearch(n14,n3);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n4,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n5,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n4,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n6,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n4,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n7,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n4,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n8,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n4,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n9,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n4,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n10,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n4,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n11,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n4,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n12,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n4,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n13,n4);
                }
                
                else if(target.equalsIgnoreCase("Sibiu") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n4,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Sibiu")){
                AstarSearch(n14,n4);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n5,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n6,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n5,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n7,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n5,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n8,n5);
                }
                
                else if(target.equalsIgnoreCase("Fagaras") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n5,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Fagaras")){
                AstarSearch(n9,n5);
                }
                
                else if(target.equalsIgnoreCase("Faragas") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n5,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Faragas")){
                AstarSearch(n10,n5);
                }
                
                else if(target.equalsIgnoreCase("Faragas") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n5,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Faragas")){
                AstarSearch(n11,n5);
                }
                
                else if(target.equalsIgnoreCase("Faragas") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n5,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Faragas")){
                AstarSearch(n12,n5);
                }
                
                else if(target.equalsIgnoreCase("Faragas") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n5,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Faragas")){
                AstarSearch(n13,n5);
                }
                
                else if(target.equalsIgnoreCase("Faragas") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n5,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Faragas")){
                AstarSearch(n14,n5);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n6,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n7,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n6,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n8,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n6,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n9,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n6,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n10,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n6,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n11,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n6,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n12,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n6,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n13,n6);
                }
                
                else if(target.equalsIgnoreCase("Rimnicu Vilcea") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n6,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Rimnicu Vilcea")){
                AstarSearch(n14,n6);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n7,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n8,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n7,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n9,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n7,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n10,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n7,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n11,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n7,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n12,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n7,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n13,n7);
                }
                
                else if(target.equalsIgnoreCase("Pitesti") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n7,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Pitesti")){
                AstarSearch(n14,n7);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n8,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n9,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n8,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n10,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n8,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n11,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n8,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n12,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n8,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n13,n8);
                }
                
                else if(target.equalsIgnoreCase("Timisoara") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n8,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Timisoara")){
                AstarSearch(n14,n8);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n9,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n10,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n9,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n11,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n9,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n12,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n9,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n13,n9);
                }
                
                else if(target.equalsIgnoreCase("Lugoj") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n9,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Lugoj")){
                AstarSearch(n14,n9);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n10,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n11,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n10,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n12,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n10,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n13,n10);
                }
                
                else if(target.equalsIgnoreCase("Mehadia") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n10,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Mehadia")){
                AstarSearch(n14,n10);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n11,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n12,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n11,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n13,n11);
                }
                
                else if(target.equalsIgnoreCase("Dobreta") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n11,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Dobreta")){
                AstarSearch(n14,n11);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n12,n13);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n13,n12);
                }
                
                else if(target.equalsIgnoreCase("Craiova") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n12,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Craiova")){
                AstarSearch(n14,n12);
                }
                
                else if(target.equalsIgnoreCase("Bucharest") && end.equalsIgnoreCase("Giurgiu")){
                AstarSearch(n13,n14);
                }
                
                else if(target.equalsIgnoreCase("Giurgiu") && end.equalsIgnoreCase("Bucharest")){
                AstarSearch(n14,n13);
                }
                
                else{
                System.out.println("You have entered a wrong Start or Destination place.");
                }
                
                
                if(end.equalsIgnoreCase("Arad")){
                
                List<Node> path = printPath(n1);
                System.out.println("Path: " + path);    
                    
                }
                
                else if(end.equalsIgnoreCase("Zerind")){
                
                List<Node> path = printPath(n2);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Oradea")){
                
                List<Node> path = printPath(n3);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Sibiu")){
                
                List<Node> path = printPath(n4);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Faragas")){
                
                List<Node> path = printPath(n5);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Rimnicu Vilcea")){
                
                List<Node> path = printPath(n6);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Pitesti")){
                
                List<Node> path = printPath(n7);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Timisoara")){
                
                List<Node> path = printPath(n8);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Lugoj")){
                
                List<Node> path = printPath(n9);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Mehadia")){
                
                List<Node> path = printPath(n10);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Dobreta")){
                
                List<Node> path = printPath(n11);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Craiova")){
                
                List<Node> path = printPath(n12);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Bucharest")){
                
                List<Node> path = printPath(n13);
                System.out.println("Path: " + path);    
                    
                }
                
                if(end.equalsIgnoreCase("Giurgiu")){
                
                List<Node> path = printPath(n14);
                System.out.println("Path: " + path);    
                    
                }

                
//                List<Node> path = printPath(n13);
//                System.out.println("Path: " + path);


        }

        public static List<Node> printPath(Node target){
                List<Node> path = new ArrayList<Node>();
        
        for(Node node = target; node!=null; node = node.parent){
            path.add(node);
        }

        Collections.reverse(path);

        return path;
        }

        public static void AstarSearch(Node source, Node goal){

                Set<Node> explored = new HashSet<Node>();

                PriorityQueue<Node> queue = new PriorityQueue<Node>(20, 
                        new Comparator<Node>(){
                                 //override compare method
                 public int compare(Node i, Node j){
                    if(i.f_scores > j.f_scores){
                        return 1;
                    }

                    else if (i.f_scores < j.f_scores){
                        return -1;
                    }

                    else{
                        return 0;
                    }
                 }

                        }
                        );

                //cost from start
                source.g_scores = 0;

                queue.add(source);

                boolean found = false;

                while((!queue.isEmpty())&&(!found)){

                        //the node in having the lowest f_score value
                        Node current = queue.poll();

                        explored.add(current);

                        //goal found
                        if(current.value.equals(goal.value)){
                                found = true;
                        }

                        //check every child of current node
                        for(Edge e : current.adjacencies){
                                Node child = e.target;
                                double cost = e.cost;
                                double temp_g_scores = current.g_scores + cost;
                                double temp_f_scores = temp_g_scores + child.h_scores;


                                /*if child node has been evaluated and 
                                the newer f_score is higher, skip*/
                                
                                if((explored.contains(child)) && 
                                        (temp_f_scores >= child.f_scores)){
                                        continue;
                                }

                                /*else if child node is not in queue or 
                                newer f_score is lower*/
                                
                                else if((!queue.contains(child)) || 
                                        (temp_f_scores < child.f_scores)){

                                        child.parent = current;
                                        child.g_scores = temp_g_scores;
                                        child.f_scores = temp_f_scores;

                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }

                                        queue.add(child);

                                }

                        }

                }

        }
        
}

class Node{

        public final String value;
        public double g_scores;
        public final double h_scores;
        public double f_scores = 0;
        public Edge[] adjacencies;
        public Node parent;

        public Node(String val, double hVal){
                value = val;
                h_scores = hVal;
        }

        public String toString(){
                return value;
        }

}

class Edge{
        public final double cost;
        public final Node target;

        public Edge(Node targetNode, double costVal){
                target = targetNode;
                cost = costVal;
        }
}