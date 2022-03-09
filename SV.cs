using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace buoi_4
{
    class SV
    {
        public int MSSV { get; set; }
        public string Name { get; set; }
        public SV()
        {

        }
        public override string ToString()
        {
            return "MSSV = " + MSSV + ", Name = " + Name;
        }
        public static bool CompareMSSV(object o1, object o2)
        {
            return ((SV)o1).MSSV > ((SV)o2).MSSV;
        }
        public static bool CompareName(object o1, object o2)
        {
            return String.Compare(((SV)o1).Name, ((SV)o2).Name) > 0;
        }
        public SV(int MSSV, string NAME)
        {
            this.MSSV = MSSV;
            this.Name = NAME;
        }
    }
}
