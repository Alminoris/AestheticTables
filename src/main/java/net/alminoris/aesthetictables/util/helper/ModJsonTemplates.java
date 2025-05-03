package net.alminoris.aesthetictables.util.helper;

public class ModJsonTemplates
{
    public static String YAXIS_ROTATED_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north": { "model": "aesthetictables:block/NAME" },
                "facing=south": { "model": "aesthetictables:block/NAME", "y": 180 },
                "facing=west": { "model": "aesthetictables:block/NAME", "y": 270 },
                "facing=east": { "model": "aesthetictables:block/NAME", "y": 90 }
              }
            }
            """;

    public static String SIMPLE_TABLE_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north,variant=normal": { "model": "aesthetictables:block/NAME" },
                "facing=south,variant=normal": { "model": "aesthetictables:block/NAME", "y": 180 },
                "facing=west,variant=normal": { "model": "aesthetictables:block/NAME", "y": 270 },
                "facing=east,variant=normal": { "model": "aesthetictables:block/NAME", "y": 90 },
                "facing=north,variant=center": { "model": "aesthetictables:block/NAME_center" },
                "facing=south,variant=center": { "model": "aesthetictables:block/NAME_center", "y": 180 },
                "facing=west,variant=center": { "model": "aesthetictables:block/NAME_center", "y": 270 },
                "facing=east,variant=center": { "model": "aesthetictables:block/NAME_center", "y": 90 },
                "facing=north,variant=left": { "model": "aesthetictables:block/NAME_left" },
                "facing=south,variant=left": { "model": "aesthetictables:block/NAME_left", "y": 180 },
                "facing=west,variant=left": { "model": "aesthetictables:block/NAME_left", "y": 270 },
                "facing=east,variant=left": { "model": "aesthetictables:block/NAME_left", "y": 90 },
                "facing=north,variant=right": { "model": "aesthetictables:block/NAME_right" },
                "facing=south,variant=right": { "model": "aesthetictables:block/NAME_right", "y": 180 },
                "facing=west,variant=right": { "model": "aesthetictables:block/NAME_right", "y": 270 },
                "facing=east,variant=right": { "model": "aesthetictables:block/NAME_right", "y": 90 }
              }
            }
            """;

    public static String TABLE_BLOCKSTATE_TEMPLATE = """
            {
              "multipart": [
                {
                  "apply": { "model": "aesthetictables:block/NAME_top" }
                },
                {
                  "when": { "leg1": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg1" }
                },
                {
                  "when": { "leg2": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg2" }
                },
                {
                  "when": { "leg3": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg3" }
                },
                {
                  "when": { "leg4": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg4" }
                }
              ]
            }
            """;

    public static String GARDEN_TABLE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, -2.14645, 6.85355],
            			"to": [3, 17.85355, 8.85355],
            			"rotation": {"angle": 45, "axis": "x", "origin": [2, 7.85355, 7.85355]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.9, -2.14645, 7.14645],
            			"to": [2.9, 17.85355, 9.14645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [1.9, 7.85355, 8.14645]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"up": {"uv": [0, 2, 2, 4], "texture": "#1"},
            				"down": {"uv": [0, 2, 2, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.1, -2.14645, 7.14645],
            			"to": [15.1, 17.85355, 9.14645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [14.1, 7.85355, 8.14645]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"up": {"uv": [0, 2, 2, 4], "texture": "#1"},
            				"down": {"uv": [0, 2, 2, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, -2.14645, 6.85355],
            			"to": [15, 17.85355, 8.85355],
            			"rotation": {"angle": 45, "axis": "x", "origin": [14, 7.85355, 7.85355]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2.5, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2.5, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, -90, 180],
            			"translation": [0, 0, 2.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String GARDEN_TABLE_CENTER = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String GARDEN_TABLE_LEFT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, -2.14645, 6.85355],
            			"to": [3, 17.85355, 8.85355],
            			"rotation": {"angle": 45, "axis": "x", "origin": [2, 7.85355, 7.85355]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.9, -2.14645, 7.14645],
            			"to": [2.9, 17.85355, 9.14645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [1.9, 7.85355, 8.14645]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"up": {"uv": [0, 2, 2, 4], "texture": "#1"},
            				"down": {"uv": [0, 2, 2, 4], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String GARDEN_TABLE_RIGHT = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.1, -2.14645, 7.14645],
            			"to": [15.1, 17.85355, 9.14645],
            			"rotation": {"angle": -45, "axis": "x", "origin": [14.1, 7.85355, 8.14645]},
            			"faces": {
            				"north": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"east": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"south": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"west": {"uv": [2, 0, 4, 16], "texture": "#1"},
            				"up": {"uv": [0, 2, 2, 4], "texture": "#1"},
            				"down": {"uv": [0, 2, 2, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13, -2.14645, 6.85355],
            			"to": [15, 17.85355, 8.85355],
            			"rotation": {"angle": 45, "axis": "x", "origin": [14, 7.85355, 7.85355]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#1"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String TABLE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "BOTTOM_NAME",
            		"2": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 13.5, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 13, 0]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 0, 1],
            			"to": [3, 13.5, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 0, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1, 0, 13],
            			"to": [3, 13.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 0, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		},
            		{
            			"from": [13, 0, 13],
            			"to": [15, 13.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 0, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		},
            		{
            			"from": [13, 0, 1],
            			"to": [15, 13.5, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 0, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 0, -1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 0, -1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2.5, 0, -1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2.5, 0, -1.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 2.5],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String TABLE_TOP = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "TOP_NAME",
             		"1": "BOTTOM_NAME",
             		"particle": "TOP_NAME"
             	},
             	"elements": [
             		{
             			"from": [0, 13.5, 0],
             			"to": [16, 16, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 13, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
             			}
             		}
             	]
             }
            """;

    public static String TABLE_LEG1 = """
            {
             	"credit": "Made with Blockbench",
             	"textures": {
             		"2": "LEG_NAME"
             	},
             	"elements": [
             		{
             			"from": [13, 0, 1],
             			"to": [15, 13.5, 3],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 0, 1]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
             				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
             				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
             				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
             				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
             				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
             			}
             		}
             	]
            }
            """;

    public static String TABLE_LEG2 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"2": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [13, 0, 13],
            			"to": [15, 13.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 0, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		}
            	]
            }
            """;

    public static String TABLE_LEG3 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"2": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 0, 13],
            			"to": [3, 13.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 0, 13]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		}
            	]
            }
            """;

    public static String TABLE_LEG4 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"2": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 0, 1],
            			"to": [3, 13.5, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 0, 1]},
            			"faces": {
            				"north": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 2, 13.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 2, 2], "texture": "#2"},
            				"down": {"uv": [0, 0, 2, 2], "texture": "#2"}
            			}
            		}
            	]
            }
            """;

    public static String COFFEE_TABLE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "BOTTOM_NAME",
            		"2": "TOP_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [3, 6, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 3, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13, 0, 0],
            			"to": [16, 6, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 3, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13, 0, 13],
            			"to": [16, 6, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 3, 14.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 13],
            			"to": [3, 6, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 3, 14.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 6, 12],
            			"to": [4, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 6, 0],
            			"to": [4, 8, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 6, 12],
            			"to": [16, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 6, 0],
            			"to": [16, 8, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 6, 4],
            			"to": [4, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 8]},
            			"faces": {
            				"north": {"uv": [12, 9, 16, 11], "texture": "#2"},
            				"east": {"uv": [1, 13, 9, 15], "texture": "#2"},
            				"south": {"uv": [0, 9, 4, 11], "texture": "#2"},
            				"west": {"uv": [0, 11, 1, 12], "texture": "#2"},
            				"up": {"uv": [0, 5, 4, 13], "texture": "#2"},
            				"down": {"uv": [0, 5, 4, 13], "texture": "#2"}
            			}
            		},
            		{
            			"from": [12, 6, 4],
            			"to": [16, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 4, 12], "texture": "#2"},
            				"east": {"uv": [0, 9, 1, 10], "texture": "#2"},
            				"south": {"uv": [12, 10, 16, 12], "texture": "#2"},
            				"west": {"uv": [1, 13, 9, 15], "texture": "#2"},
            				"up": {"uv": [12, 2, 16, 10], "texture": "#2"},
            				"down": {"uv": [12, 2, 16, 10], "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 6, 0],
            			"to": [12, 8, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 1, 11], "texture": "#2"},
            				"east": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"south": {"uv": [9, 8, 15, 10], "texture": "#2"},
            				"west": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"up": {"uv": [6, 0, 14, 4], "texture": "#2"},
            				"down": {"uv": [3, 12, 11, 16], "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 6, 12],
            			"to": [12, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 14]},
            			"faces": {
            				"north": {"uv": [9, 8, 15, 10], "texture": "#2"},
            				"east": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"south": {"uv": [0, 9, 1, 10], "texture": "#2"},
            				"west": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"up": {"uv": [6, 0, 14, 4], "rotation": 180, "texture": "#2"},
            				"down": {"uv": [3, 12, 11, 16], "rotation": 180, "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 6, 4],
            			"to": [12, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
            			"faces": {
            				"north": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"east": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"south": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"west": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"up": {"uv": [4, 4, 12, 12], "texture": "#1"},
            				"down": {"uv": [4, 4, 12, 12], "texture": "#1"}
            			}
            		}
            	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [2.5, 1.5, -1],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"thirdperson_lefthand": {
              			"translation": [2.5, 1.5, -1],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_righthand": {
              			"translation": [2.5, 1.5, -1],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"firstperson_lefthand": {
              			"translation": [2.5, 1.5, -1],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"ground": {
              			"translation": [0, 1.75, 0],
              			"scale": [0.5, 0.5, 0.5]
              		},
              		"gui": {
              			"rotation": [20, 45, 0],
              			"translation": [0, 1.5, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"translation": [0, 3, 1],
              			"scale": [0.5, 0.5, 0.5]
              		}
              	}
            }
            """;

    public static String COFFEE_TABLE_TOP = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"1": "BOTTOM_NAME",
            		"2": "TOP_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 6, 12],
            			"to": [4, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 6, 0],
            			"to": [4, 8, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 6, 12],
            			"to": [16, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12, 6, 0],
            			"to": [16, 8, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 4, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#1"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 6, 4],
            			"to": [4, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 7, 8]},
            			"faces": {
            				"north": {"uv": [12, 9, 16, 11], "texture": "#2"},
            				"east": {"uv": [1, 13, 9, 15], "texture": "#2"},
            				"south": {"uv": [0, 9, 4, 11], "texture": "#2"},
            				"west": {"uv": [0, 11, 1, 12], "texture": "#2"},
            				"up": {"uv": [0, 5, 4, 13], "texture": "#2"},
            				"down": {"uv": [0, 5, 4, 13], "texture": "#2"}
            			}
            		},
            		{
            			"from": [12, 6, 4],
            			"to": [16, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 7, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 4, 12], "texture": "#2"},
            				"east": {"uv": [0, 9, 1, 10], "texture": "#2"},
            				"south": {"uv": [12, 10, 16, 12], "texture": "#2"},
            				"west": {"uv": [1, 13, 9, 15], "texture": "#2"},
            				"up": {"uv": [12, 2, 16, 10], "texture": "#2"},
            				"down": {"uv": [12, 2, 16, 10], "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 6, 0],
            			"to": [12, 8, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
            			"faces": {
            				"north": {"uv": [0, 10, 1, 11], "texture": "#2"},
            				"east": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"south": {"uv": [9, 8, 15, 10], "texture": "#2"},
            				"west": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"up": {"uv": [6, 0, 14, 4], "texture": "#2"},
            				"down": {"uv": [3, 12, 11, 16], "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 6, 12],
            			"to": [12, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 14]},
            			"faces": {
            				"north": {"uv": [9, 8, 15, 10], "texture": "#2"},
            				"east": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"south": {"uv": [0, 9, 1, 10], "texture": "#2"},
            				"west": {"uv": [0, 6, 16, 8], "texture": "#2"},
            				"up": {"uv": [6, 0, 14, 4], "rotation": 180, "texture": "#2"},
            				"down": {"uv": [3, 12, 11, 16], "rotation": 180, "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 6, 4],
            			"to": [12, 8, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7, 8]},
            			"faces": {
            				"north": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"east": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"south": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"west": {"uv": [4, 7, 12, 9], "texture": "#1"},
            				"up": {"uv": [4, 4, 12, 12], "texture": "#1"},
            				"down": {"uv": [4, 4, 12, 12], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String COFFEE_TABLE_LEG1 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [13, 0, 0],
            			"to": [16, 6, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 3, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String COFFEE_TABLE_LEG2 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [13, 0, 13],
            			"to": [16, 6, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 3, 14.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String COFFEE_TABLE_LEG3 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 13],
            			"to": [3, 6, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 3, 14.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String COFFEE_TABLE_LEG4 = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [3, 6, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 3, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 3, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#0"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String STONECUTTING_RECIPE = """
            {
              "type": "minecraft:stonecutting",
              "ingredient": {
                "item": "INGREDIENT_NAME"
              },
              "result": {
                "count": COUNT,
                "id": "aesthetictables:OUTPUT_NAME"
              }
            }
            """;
}