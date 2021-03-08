class foo {
    private:
        int pvar;
    protected:
        int provar;
    public:
        foo();
        void setPvar(int i);
        int getPvar;
        int var;
        virtual void algo();
};



class bar : foo {
    public:
        bar();
};



