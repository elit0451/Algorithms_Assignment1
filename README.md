# Base Algorithms for sorting 𝒮ℋ𝒜𝒦ℰ𝒮𝒫ℰ𝒜ℛℰ  's work 

The following solution provides implementation for 3 Base algorithms, which sort Shakespeare's work from a text file.

## Features
- Read Shakespeare's work from a text file. 📖
  - Process the text to **lower case** and **without any punctuation**.
- Algorithms used: 🧮
  - Insertion Sort
  - Selection Sort
  - Merge Sort
- Outputting the time consumption ⏱ for each algorithm and an alphabetically sorted word array 

### Starting the program ▶️
- Clone the project through `git clone https://github.com/davi7725/Algorithms_Assignment1.git` or just download it as a ZIP file
- Open the project into an IDE that supports   <img src="./java.png" height="50">    applications
- Change file path in [Main.java](https://github.com/davi7725/Algorithms_Assignment1/blob/9fdd4a3a62e0165d0f6c28384cf797044385c813/src/main/java/com/cphbusiness/basicalgorithms/Main.java#L31) to the path of your [dataset](https://raw.githubusercontent.com/datsoftlyngby/soft2019spring-algorithms/master/Weeklies/Week_05/Assignment_01/Shakespeare_Complete_Works.txt)
- Start the application by running the *Main* file

_NB❗️ you can download the Shakespeare's works from the hyperlink attached to the word **dataset**_

_⚠️ Be aware that it will take some time to load the full dataset, therefore coffee ☕️ or tea 🍵 break is advisable_

___
| Algorithm  | Complexity  | Results /microseconds/ |
| :------------ |:---------------:| -----:|
| Insertion sort      | Best case - O(N) <br/> **Average case - O(N^2)** <br/> Worst case - O(N^2) |  500ln - 74 065 μs <br/> 1000ln - 352 803 μs|
| Selection sort      | Best case - O(N^2) <br/> **Average case - O(N^2)** <br/> Worst case - O(N^2)        | 500ln - 101 116 μs <br/> 1000ln - 221 485 μs |
| Merge sort | Best case - O(N logN) <br/> **Average case - O(N logN)** <br/> Worst case - O(N logN)        | 500ln - 10 284  μs <br/> 1000ln - 12 065 μs   |


From the results demonstrated can be concluded that **Merge sort** would the most favourable for sorting large amounts of data. Supporting this decision is the argument that duplicating the dataset, doesn't result on prolonging the time twice as long.  
___
> #### Assignment made by:   
`David Alves 👨🏻‍💻 ` :octocat: [Github](https://github.com/davi7725) <br />
`Elitsa Marinovska 👩🏻‍💻 ` :octocat: [Github](https://github.com/elit0451) <br />
> Attending "Algorithms and Data Structures" course of Software Development bachelor's degree
