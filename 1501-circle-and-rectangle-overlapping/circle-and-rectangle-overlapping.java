class Solution 
{
    static boolean corner(int r, int xc, int yc, int x, int y)
    {
        return Math.sqrt((x-xc)*(x-xc)+(y-yc)*(y-yc))<=r;
    }
    static boolean edge(int hx, int hy1, int hy2, int vy, int vx1, int vx2)
    {
        return vy>=hy1 && vy<=hy2 && hx>=vx1 && hx<=vx2;
    }
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) 
    {
        int x3 = x2, y3 = y1, x4 = x1, y4 = y2;
        if(corner(r,xc,yc,x1,y1) || corner(r,xc,yc,x2,y2) || corner(r,xc,yc,x3,y3) || corner(r,xc,yc,x4,y4))
            return true; 
        if(edge(xc,yc-r,yc+r,y1,x1,x3) || edge(x3,y3,y2,yc,xc-r,xc+r) || edge(xc,yc-r,yc+r,y2,x4,x2) || edge(x1,y1,y4,yc,xc-r,xc+r))
            return true; 
        if(xc>=x1 && xc<=x3 && yc>=y1 && yc<=y4)   
            return true;
             
        return false;   
    }
}