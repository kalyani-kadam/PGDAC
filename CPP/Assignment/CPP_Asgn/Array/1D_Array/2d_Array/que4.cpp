/*4. Write a program to perform the following operations on a square matrix. Write 
i) Check if the matrix is symmetric.
ii) Display the trace of the matrix (sum of diagonal elements). 
iii) Check if the matrix is an upper triangular matrix*/

// HomeCC Program - Write a menu driven program to perform the following operations on a square matrix - IProgramX
// C Program - Write a menu driven program to perform the following operations on a square matrix - IProgramX
// by - IProgram X on - June 27, 2018
// Q. Write a menu driven program to perform the following operations on a square matrix. Write separate functions for each option. 
// i) Check if the matrix is symmetric.
// ii) Display the trace of the matrix (sum of diagonal elements).
// iii) Check if the matrix is an upper triangular matrix.
// iv) Check if the matrix is a lower triangular matrix.
// v) Check if it is an identity matrix.

#include<stdio.h>
void sym();
void trace();
void uptri();
void lowtri();
void ide();
int main()
{
 int ch;
 printf("1.Check if the matrix is symmetric\n 2.Display the trace of the matrix (sum of diagonal elements)\n 3.Check if the matrix is an upper triangular matrix\n 4.Check if the matrix is a lower triangular matrix\n 5.Check if it is an identity matrix\n ");
 printf("enter your choice: ");
 scanf("%d",&ch);
 switch(ch)
 {
  case 1:
   sym();
   break;
  case 2:
   trace();
   break;
  case 3:
   uptri();
   break;
  case 4:
   lowtri();
   break;
  case 5:
   ide();
   break;            
 }
}
void sym()
{
 int m, n, c, d, matrix[10][10], transpose[10][10];

  printf("Enter the number of rows and columns of matrix\n");
  scanf("%d%d", &m, &n);
  printf("Enter elements of the matrix\n");

  for (c = 0; c < m; c++)
    for (d = 0; d < n; d++)
      scanf("%d", &matrix[c][d]);

  for (c = 0; c < m; c++)
    for (d = 0; d < n; d++)
      transpose[d][c] = matrix[c][d];

  if (m == n)
  {
    for (c = 0; c < m; c++)
    {
      for (d = 0; d < m; d++)
      {
        if (matrix[c][d] != transpose[c][d])
          break;
      }
      if (d != m)
        break;
    }
    if (c == m)
      printf("The matrix is symmetric.\n");
    else
      printf("The matrix isn't symmetric.\n");
  }
  else
    printf("The matrix isn't symmetric.\n");
}
void trace()
{
 int a[10][10],i,j,sum=0,m,n;
 printf("enter the values of m,n");
 scanf("%d%d",&m,&n);
 printf("enter the elements of matrix a");
 for(i=0;i<m;i++)
  for(j=0;j<n;j++)
   scanf("%d",&a[i][j]);
 for(i=0;i<m;i++)
  for(j=0;j<n;j++)
   if(i==j)
    sum=sum+a[i][j];
 printf("trace of a matrix=%d",sum);
} 
void uptri()
{
    int array[10][10];
    int row, col, isUpper,MAX_COLS,MAX_ROWS;
    printf("enter how many row:(row = col):");
    scanf("%d",&MAX_ROWS);
    MAX_COLS=MAX_ROWS;
 printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &array[row][col]);
        }
    }
    isUpper = 1;
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            if(col<row && array[row][col]!=0)
            {
                isUpper = 0;
            }
        }
    }
    if(isUpper == 1)
    {
        printf("\nThe matrix is Upper triangular matrix.\n");

        for(row=0; row<MAX_ROWS; row++)
        {
            for(col=0; col<MAX_COLS; col++)
            {
                printf("%d ", array[row][col]);
            }

            printf("\n");
        }
    }
    else
    {
        printf("\nThe matrix is not Upper triangular matrix.");
    }
}
void lowtri()
{
   int array[10][10];
    int row, col, isLower,MAX_COLS,MAX_ROWS;
    printf("enter how many row:(row = col):");
    scanf("%d",&MAX_ROWS);
    MAX_COLS=MAX_ROWS;
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS, MAX_COLS);
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            scanf("%d", &array[row][col]);
        }
    }
    isLower = 1;
    for(row=0; row<MAX_ROWS; row++)
    {
        for(col=0; col<MAX_COLS; col++)
        {
            if(col>row && array[row][col]!=0)
            {
                isLower = 0;
            }
        }
    }
    if(isLower == 1)
    {
        printf("\nMatrix is Lower triangular matrix: \n");
        for(row=0; row<MAX_ROWS; row++)
        {
            for(col=0; col<MAX_COLS; col++)
            {
                printf("%d ", array[row][col]);
            }

            printf("\n");
        }
    }
    else
    {
        printf("\nMatrix is not a Lower triangular matrix");
    }
}
void ide()
{

  int i, j, rows, columns, a[10][10], Flag = 1;
 
  printf("\n Please Enter Number of rows and columns  :  ");
  scanf("%d %d", &i, &j);

  printf("\n Please Enter the Matrix Elements \n");
  for(rows = 0; rows < i; rows++)
   {
     for(columns = 0; columns < j; columns++)
     {
        scanf("%d", &a[rows][columns]);
     }
   }
    
  for(rows = 0; rows < i; rows++)
   {
     for(columns = 0; columns < j; columns++)
     {
      if(a[rows][columns] != 1 && a[columns][rows] != 0)
      {
       Flag = 0;
       break;
   }
      }
   }
   if(Flag == 1)
   {
    printf("\n The Matrix that you entered is an Identity Matrix ");
 }
 else
 {
  printf("\n The Matrix that you entered is Not an Identity Matrix ");
 } 
}