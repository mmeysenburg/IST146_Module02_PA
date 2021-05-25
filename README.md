# IST146_Module02_PA

Now that you have gotten your hands on some Java coding with the Module 2 Hands-On Activity (HOA 2), it is time to put your skills 
to the test in this module's Programming Assignment (PA 2). In this PA, you will implement another O(n^2) sort, the classic 
[BubbleSort](https://en.wikipedia.org/wiki/Bubble_sort) algorithm. Below is pseudocode for BubbleSort. 

```
    procedure bubbleSort(A : list of sortable items)
        n := length(A)
        swapped := true
        while swapped
            swapped := false
            for i := 1 to n-1 inclusive do
                /* if this pair is out of order */
                if A[i-1] > A[i] then
                    /* swap them and remember something changed */
                    swap(A[i-1], A[i])
                    swapped := true
                end if
            end for
        end while
    end procedure
```

In the pseudocode, block structure is indicated with indentation and ended with "end if," "end for," etc. The := notation is the assignment operation.

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. C    lick on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: github.com/mmeysenburg/IST146_Module02_PA
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit`
8. Select the "BubbleSort.java" file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
    * To run the code, click the "Run" button.
    * To execute the unit tests, enter the following command in the "Console" tab: bash test.sh
10. Once you have completed the code correctly, the unit test should pass, and running the code should produce results that make sense.
11. When you are finished, submit your BubbleSort.java file via the PA 2 Canvas assignment.


## Files in the repository

* `BubbleSort.java`: Class encapsulating the BubbleSort algorithm. This is the file you should edit.
* `BubbleSortTest.java`: JUnit4 unit tests for the `BubbleSort` class. These tests are executed when you enter the `bash test.sh`
command.
* `LICENSE`: GNU General Public License v3.0 for these materials.
* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `README.md`: This README file.
* `test.sh`: Bash script to execute the JUnit4 unit tests in `BubbleSortTest.java`.

