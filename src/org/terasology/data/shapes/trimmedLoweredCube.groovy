package org.terasology.data.shapes

shape {
    Top {
        vertices = [[-0.500000, 0.400000, 0.500000], [0.500000, 0.400000, 0.500000], [0.500000, 0.400000, -0.500000], [-0.500000, 0.400000, -0.500000]]
        normals = [[-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000]]
        texcoords = [[0.000000, 1.000000], [1.000000, 1.000000], [1.000000, 0.000000], [0.000000, 0.000000]]
        faces = [
                [0, 1, 2, 3]
        ]
        fullSide = true
    }
    Bottom {
        vertices = [[-0.500000, -0.500000, 0.500000], [-0.500000, -0.500000, -0.500000], [0.500000, -0.500000, -0.500000], [0.500000, -0.500000, 0.500000]]
        normals = [[-0.000000, -0.999969, 0.000000], [-0.000000, -1.000000, 0.000000], [-0.000000, -1.000000, 0.000000], [-0.000000, -0.999969, 0.000000]]
        texcoords = [[1.000000, 1.000000], [1.000000, 0.000000], [0.000000, 0.000000], [0.000000, 1.000000]]
        faces = [
                [0, 1, 2, 3]
        ]
        fullSide = true
    }
    Front {
        vertices = [[-0.500000, -0.500000, -0.500000], [-0.500000, 0.400000, -0.500000], [0.500000, 0.400000, -0.500000], [0.500000, -0.500000, -0.500000]]
        normals = [[-0.000000, 0.000000, -1.000000], [-0.000000, 0.000000, -1.000000], [-0.000000, 0.000000, -1.000000], [-0.000000, 0.000000, -0.999969]]
        texcoords = [[1.000000, 0.906250], [1.000000, 0.006250], [0.000000, 0.006250], [0.000000, 0.906250]]
        faces = [
                [0, 1, 2, 3]
        ]
        fullSide = true
    }
    Back {
        vertices = [[-0.500000, 0.400000, 0.500000], [-0.500000, -0.500000, 0.500000], [0.500000, -0.500000, 0.500000], [0.500000, 0.400000, 0.500000]]
        normals = [[-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 0.999969], [-0.000000, 0.000000, 1.000000]]
        texcoords = [[0.000000, 0.006250], [0.000000, 0.906250], [1.000000, 0.906250], [1.000000, 0.006250]]
        faces = [
                [0, 1, 2, 3]
        ]
        fullSide = true
    }
    Left {
        vertices = [[-0.500000, -0.500000, 0.500000], [-0.500000, 0.400000, 0.500000], [-0.500000, 0.400000, -0.500000], [-0.500000, -0.500000, -0.500000]]
        normals = [[-1.000000, 0.000000, 0.000000], [-1.000000, 0.000000, 0.000000], [-0.999969, 0.000000, 0.000000], [-1.000000, 0.000000, 0.000000]]
        texcoords = [[1.000000, 0.906250], [1.000000, 0.006250], [0.000000, 0.006250], [0.000000, 0.906250]]
        faces = [
                [0, 1, 2, 3]
        ]
        fullSide = true
    }
    Right {
        vertices = [[0.500000, -0.500000, -0.500000], [0.500000, 0.400000, -0.500000], [0.500000, 0.400000, 0.500000], [0.500000, -0.500000, 0.500000]]
        normals = [[1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000]]
        texcoords = [[1.000000, 0.906250], [1.000000, 0.006250], [0.000000, 0.006250], [0.000000, 0.906250]]
        faces = [
                [0, 1, 2, 3]
        ]
        fullSide = true
    }
}
