using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace buoi_4
{
    
    class Program

    {
        
        public delegate bool Compare(SV s1, SV s2);

        static void Sort(SV[] arr)
        {
            for(int i = 0; i < arr.Length; i++)
            {
                for( int j = i + 1; j < arr.Length; j++)
                {
                    if (arr[i].MSSV > arr[j].MSSV)
                    {
                        SV t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }  
            }
        }
        //delehgate chỉ dùng được với các hàm cùng datatype
        //public delegate void MyDel(int i, int j);
        //static void Add(int a, int b)
        //{
        //    Console.WriteLine (a + b);
        //}
        //static void Sub(int a, int b)
        //{
        //    Console.WriteLine(a - b);
        //}
        //static void TT(int a, int b, MyDel d)
        //{
        //    d(a, b);
        //}
        static void Main(string[] args)
        {
            // Quy trình tạo sự kiện
            // khai báo kiểu dữ liệu sự kiện
            //
            // đăng ký lớp publisher
            // đăng ký subcriber
            Clock c = new Clock();
            AnaLogClock ac = new AnaLogClock();
            DigitalClock dc = new DigitalClock();
            c.OnSecondchange += new SecondHandler(ac.ShowAC);
            c.OnSecondchange += new SecondHandler(dc.ShowDC);

            c.run();
           //MyDel d1 = new MyDel(Add);// tham chiếu hàm
            //d1 += new MyDel(Sub);// Tham chiếu hàm nào trước thì chạy hàm đó trc
            //d1 += new MyDel(Sub);//
            //d1 -= new MyDel(Sub);
            //d1(2, 1);

         




            //List<SV> l1 = new List<SV>();
            //SV s = new SV { MSSV = 1, Name = "NVA" };
            //l1.Add(s);
            //l1.AddRange(new SV[]
            //{
            //    new SV {MSSV =2, Name = "NVB"},
            //    new SV {MSSV =3, Name = "NVC"},

            //});
            //Console.WriteLine(l1.IndexOf(s));
            //foreach(SV i in l1)
            //{
            //    Console.WriteLine(l1.ToString());
            //}




        }
    }
}
