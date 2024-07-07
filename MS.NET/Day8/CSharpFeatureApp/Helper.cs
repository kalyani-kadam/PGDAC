using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatureApp
{
    internal static  class Helper
    {
        public static int Multiply(this MathEngine m,int a, int b)
        { return a * b; }
        public static int Division(this string m, int a, int b)
        { return a / b; }

    }
}
