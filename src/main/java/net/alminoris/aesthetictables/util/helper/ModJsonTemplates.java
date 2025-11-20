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

    public static String EXTRA_TABLE_BLOCKSTATE_TEMPLATE = """
            {
              "multipart": [
                {
                  "apply": { "model": "aesthetictables:block/NAME_top" }
                },
                {
                  "when": { "single": true },
                  "apply": { "model": "aesthetictables:block/NAME" }
                },
                {
                  "when": { "leg1": true, "single": false },
                  "apply": { "model": "aesthetictables:block/NAME_leg1" }
                },
                {
                  "when": { "leg2": true, "single": false },
                  "apply": { "model": "aesthetictables:block/NAME_leg2" }
                },
                {
                  "when": { "leg3": true, "single": false },
                  "apply": { "model": "aesthetictables:block/NAME_leg3" }
                },
                {
                  "when": { "leg4": true, "single": false },
                  "apply": { "model": "aesthetictables:block/NAME_leg4" }
                },
                {
                  "when": { "leg1": true, "single": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg1" }
                },
                {
                  "when": { "leg2": true, "single": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg2" }
                },
                {
                  "when": { "leg3": true, "single": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg3" }
                },
                {
                  "when": { "leg4": true, "single": true },
                  "apply": { "model": "aesthetictables:block/NAME_leg4" }
                }
              ]
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

    public static String OCTAGONAL_TABLE = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"2": "TOP_NAME",
            		"3": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [4.25, 14, 0.05],
            			"to": [11.75, 16, 15.95],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 7.5, 2], "texture": "#2"},
            				"east": {"uv": [0, 0, 15.9, 2], "texture": "#2"},
            				"south": {"uv": [0, 0, 7.5, 2], "texture": "#2"},
            				"west": {"uv": [0, 0, 15.9, 2], "texture": "#2"},
            				"up": {"uv": [0, 0, 7.5, 15.9], "texture": "#2"},
            				"down": {"uv": [0, 0, 7.5, 15.9], "texture": "#2"}
            			}
            		},
            		{
            			"from": [0.05, 13.975, 4.25],
            			"to": [15.95, 16.025, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 15.9, 2.05], "texture": "#2"},
            				"east": {"uv": [0, 0, 7.5, 2.05], "texture": "#2"},
            				"south": {"uv": [0, 0, 15.9, 2.05], "texture": "#2"},
            				"west": {"uv": [0, 0, 7.5, 2.05], "texture": "#2"},
            				"up": {"uv": [0, 0, 15.9, 7.5], "texture": "#2"},
            				"down": {"uv": [0, 0, 15.9, 7.5], "texture": "#2"}
            			}
            		},
            		{
            			"from": [-0.25, 14.025, 5],
            			"to": [16.25, 15.975, 11],
            			"rotation": {"angle": -45, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1.95], "texture": "#2"},
            				"east": {"uv": [0, 0, 6, 1.95], "texture": "#2"},
            				"south": {"uv": [0, 0, 16, 1.95], "texture": "#2"},
            				"west": {"uv": [0, 0, 6, 1.95], "texture": "#2"},
            				"up": {"uv": [0, 0, 16, 6], "texture": "#2"},
            				"down": {"uv": [0, 0, 16, 6], "texture": "#2"}
            			}
            		},
            		{
            			"from": [5, 14.025, -0.25],
            			"to": [11, 15.975, 16.25],
            			"rotation": {"angle": -45, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 1.95], "texture": "#2"},
            				"east": {"uv": [0, 0, 16, 1.95], "texture": "#2"},
            				"south": {"uv": [0, 0, 6, 1.95], "texture": "#2"},
            				"west": {"uv": [0, 0, 16, 1.95], "texture": "#2"},
            				"up": {"uv": [0, 0, 16, 6], "rotation": 90, "texture": "#2"},
            				"down": {"uv": [0, 0, 16, 6], "rotation": 270, "texture": "#2"}
            			}
            		},
            		{
            			"from": [6, 1, 6],
            			"to": [10, 14, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 13], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 13], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 13], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 13], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [4.5, 0, 4.5],
            			"to": [11.5, 1, 11.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 0.5, 8]},
            			"faces": {
            				"north": {"uv": [4, 4, 11, 5], "texture": "#3"},
            				"east": {"uv": [4, 4, 11, 5], "texture": "#3"},
            				"south": {"uv": [4, 4, 11, 5], "texture": "#3"},
            				"west": {"uv": [4, 4, 11, 5], "texture": "#3"},
            				"up": {"uv": [4, 4, 11, 11], "texture": "#3"},
            				"down": {"uv": [4, 4, 11, 11], "texture": "#3"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1, 1.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1, 1.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [25, 60, 0],
            			"translation": [0, -1, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 0.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DINING_TABLE = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [4.5, 0, 4.5],
            			"to": [11.5, 3, 11.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 7, 7], "texture": "#0"},
            				"down": {"uv": [0, 0, 7, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5.5, 3, 5.5],
            			"to": [10.5, 9, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 9, 6],
            			"to": [10, 13.25, 10],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11.125, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3, 13.25, 3],
            			"to": [13, 14, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.625, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"east": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"south": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"west": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"up": {"uv": [0, 0, 10, 10], "texture": "#2"},
            				"down": {"uv": [0, 0, 10, 10], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DINING_TABLE_TOP = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"1": "TOP_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DINING_TABLE_LEG2 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [8.5, 0, 8.5],
            			"to": [15.5, 3, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 7, 7], "texture": "#0"},
            				"down": {"uv": [0, 0, 7, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9.5, 3, 9.5],
            			"to": [14.5, 9, 14.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 6, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [10, 9, 10],
            			"to": [14, 13.25, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 11.125, 12]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"up": {"uv": [0, 0, 4, 4], "texture": "#0"},
            				"down": {"uv": [0, 0, 4, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 13.25, 5],
            			"to": [15, 14, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 13.625, 10]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"east": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"south": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"west": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"up": {"uv": [0, 0, 10, 10], "texture": "#2"},
            				"down": {"uv": [0, 0, 10, 10], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DINING_TABLE_LEG1 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [8.5, 0, 0.5],
            			"to": [15.5, 3, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 1.5, 4]},
            			"faces": {
            				"north": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"east": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"south": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"west": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"up": {"uv": [0, 7, 7, 0], "texture": "#0"},
            				"down": {"uv": [0, 7, 7, 0], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9.5, 3, 1.5],
            			"to": [14.5, 9, 6.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 6, 4]},
            			"faces": {
            				"north": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"east": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"south": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"west": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"up": {"uv": [0, 5, 5, 0], "texture": "#0"},
            				"down": {"uv": [0, 5, 5, 0], "texture": "#0"}
            			}
            		},
            		{
            			"from": [10, 9, 2],
            			"to": [14, 13.25, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 11.125, 4]},
            			"faces": {
            				"north": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"east": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"south": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"west": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"up": {"uv": [0, 4, 4, 0], "texture": "#0"},
            				"down": {"uv": [0, 4, 4, 0], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 13.25, 1],
            			"to": [15, 14, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 13.625, 6]},
            			"faces": {
            				"north": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"east": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"south": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"west": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"up": {"uv": [0, 10, 10, 0], "texture": "#2"},
            				"down": {"uv": [0, 10, 10, 0], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DINING_TABLE_LEG4 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0.5, 0, 0.5],
            			"to": [7.5, 3, 7.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 1.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 7, 3], "texture": "#0"},
            				"up": {"uv": [7, 7, 0, 0], "texture": "#0"},
            				"down": {"uv": [7, 7, 0, 0], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 3, 1.5],
            			"to": [6.5, 9, 6.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 6, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 6], "texture": "#0"},
            				"up": {"uv": [5, 5, 0, 0], "texture": "#0"},
            				"down": {"uv": [5, 5, 0, 0], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 9, 2],
            			"to": [6, 13.25, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.125, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 4, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 4, 0, 0], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 13.25, 1],
            			"to": [11, 14, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [6, 13.625, 6]},
            			"faces": {
            				"north": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"east": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"south": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"west": {"uv": [0, 0, 10, 0.75], "texture": "#2"},
            				"up": {"uv": [10, 10, 0, 0], "texture": "#2"},
            				"down": {"uv": [10, 10, 0, 0], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DINING_TABLE_LEG3 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0.5, 0, 8.5],
            			"to": [7.5, 3, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 1.5, 12]},
            			"faces": {
            				"north": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"east": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"south": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"west": {"uv": [7, 0, 0, 3], "texture": "#0"},
            				"up": {"uv": [7, 0, 0, 7], "texture": "#0"},
            				"down": {"uv": [7, 0, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.5, 3, 9.5],
            			"to": [6.5, 9, 14.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 6, 12]},
            			"faces": {
            				"north": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"east": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"south": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"west": {"uv": [5, 0, 0, 6], "texture": "#0"},
            				"up": {"uv": [5, 0, 0, 5], "texture": "#0"},
            				"down": {"uv": [5, 0, 0, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 9, 10],
            			"to": [6, 13.25, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 11.125, 12]},
            			"faces": {
            				"north": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"east": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"south": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"west": {"uv": [4, 0, 0, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 0, 0, 4], "texture": "#0"},
            				"down": {"uv": [4, 0, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 13.25, 5],
            			"to": [11, 14, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [6, 13.625, 10]},
            			"faces": {
            				"north": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"east": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"south": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"west": {"uv": [10, 0, 0, 0.75], "texture": "#2"},
            				"up": {"uv": [10, 0, 0, 10], "texture": "#2"},
            				"down": {"uv": [10, 0, 0, 10], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [30, 0, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String DESK_TABLE = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "BOTTOM_NAME",
            		"2": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0.75, 0, 0.5],
            			"to": [1.75, 14.5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.25, 7.25, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 14.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 14.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 14.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.25, 0, 0.5],
            			"to": [15.25, 14.5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.75, 7.25, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 14.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 14.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 14.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 14.5, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.25, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.75, 8.5, 1],
            			"to": [14.25, 14.5, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 12.5, 6], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 6], "texture": "#2"},
            				"south": {"uv": [0, 0, 12.5, 6], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 6], "texture": "#2"},
            				"up": {"uv": [0, 0, 12.5, 1], "texture": "#2"},
            				"down": {"uv": [0, 0, 12.5, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1.75, 12, 14],
            			"to": [14.25, 14.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.25, 14.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 12.5, 2.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 12.5, 2.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 12.5, 1], "texture": "#2"},
            				"down": {"uv": [0, 0, 12.5, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -3.25],
            			"scale": [0.45, 0.45, 0.45]
            		}
            	}
            }
            """;

    public static String DESK_TABLE_LEFT = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "BOTTOM_NAME",
            		"2": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0.75, 0, 0.5],
            			"to": [1.75, 14.5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1.25, 7.25, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 14.5], "texture": "#1"},
            				"east": {"uv": [0, 0, 15, 14.5], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 14.5], "texture": "#1"},
            				"west": {"uv": [0, 0, 15, 14.5], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 14.5, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.25, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.75, 8.5, 1],
            			"to": [16, 14.5, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 6], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 6], "texture": "#2"},
            				"south": {"uv": [0, 0, 16, 6], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 6], "texture": "#2"},
            				"up": {"uv": [0, 0, 16, 1], "texture": "#2"},
            				"down": {"uv": [0, 0, 16, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1.75, 12, 14],
            			"to": [16, 14.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.25, 14.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2.5], "texture": "#2"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#2"},
            				"south": {"uv": [0, 0, 16, 2.5], "texture": "#2"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#2"},
            				"up": {"uv": [0, 0, 16, 1], "texture": "#2"},
            				"down": {"uv": [0, 0, 16, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -3.25],
            			"scale": [0.45, 0.45, 0.45]
            		}
            	}
            }
            """;

    public static String DESK_TABLE_RIGHT = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"1": "BOTTOM_NAME",
            		"2": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [14.25, 0, 0.5],
            			"to": [15.25, 14.5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14.75, 7.25, 8]},
            			"faces": {
            				"north": {"uv": [1, 0, 0, 14.5], "texture": "#1"},
            				"east": {"uv": [15, 0, 0, 14.5], "texture": "#1"},
            				"south": {"uv": [1, 0, 0, 14.5], "texture": "#1"},
            				"west": {"uv": [15, 0, 0, 14.5], "texture": "#1"},
            				"up": {"uv": [1, 0, 0, 15], "texture": "#1"},
            				"down": {"uv": [1, 0, 0, 15], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 14.5, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.25, 8]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"east": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"south": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"up": {"uv": [16, 0, 0, 16], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8.5, 1],
            			"to": [14.25, 14.5, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11.5, 1.5]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 6], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 6], "texture": "#2"},
            				"south": {"uv": [16, 0, 0, 6], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 6], "texture": "#2"},
            				"up": {"uv": [16, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [16, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [0, 12, 14],
            			"to": [14.25, 14.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.25, 14.5]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 2.5], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 2.5], "texture": "#2"},
            				"south": {"uv": [16, 0, 0, 2.5], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 2.5], "texture": "#2"},
            				"up": {"uv": [16, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [16, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -3.25],
            			"scale": [0.45, 0.45, 0.45]
            		}
            	}
            }
            """;

    public static String DESK_TABLE_CENTER = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "TOP_NAME",
            		"2": "LEG_NAME",
            		"particle": "TOP_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14.5, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.25, 8]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"east": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"south": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"west": {"uv": [16, 0, 0, 1.5], "texture": "#0"},
            				"up": {"uv": [16, 0, 0, 16], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8.5, 1],
            			"to": [16, 14.5, 2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11.5, 1.5]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 6], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 6], "texture": "#2"},
            				"south": {"uv": [16, 0, 0, 6], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 6], "texture": "#2"},
            				"up": {"uv": [16, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [16, 0, 0, 1], "texture": "#2"}
            			}
            		},
            		{
            			"from": [0, 12, 14],
            			"to": [16, 14.5, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 13.25, 14.5]},
            			"faces": {
            				"north": {"uv": [16, 0, 0, 2.5], "texture": "#2"},
            				"east": {"uv": [1, 0, 0, 2.5], "texture": "#2"},
            				"south": {"uv": [16, 0, 0, 2.5], "texture": "#2"},
            				"west": {"uv": [1, 0, 0, 2.5], "texture": "#2"},
            				"up": {"uv": [16, 0, 0, 1], "texture": "#2"},
            				"down": {"uv": [16, 0, 0, 1], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [26.5, 0, 0],
            			"translation": [2.25, 1, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.45, 0.45, 0.45]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -3.25],
            			"scale": [0.45, 0.45, 0.45]
            		}
            	}
            }
            """;

    public static String KITCHEN_TABLE = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "TOP_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.5, 0, 0.5],
            			"to": [3.5, 5, 3.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 2.5, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1.25, 5, 1.25],
            			"to": [4.25, 10, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.75, 7.5, 2.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [2, 10, 2],
            			"to": [5, 14, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 12, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [0.5, 0, 12.5],
            			"to": [3.5, 5, 15.5],
            			"rotation": {"angle": 0, "axis": "z", "origin": [2, 2.5, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1.25, 5, 11.75],
            			"to": [4.25, 10, 14.75],
            			"rotation": {"angle": 0, "axis": "z", "origin": [2.75, 7.5, 13.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [2, 10, 11],
            			"to": [5, 14, 14],
            			"rotation": {"angle": 0, "axis": "z", "origin": [3.5, 12, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [12.5, 0, 12.5],
            			"to": [15.5, 5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 2.5, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11.75, 5, 11.75],
            			"to": [14.75, 10, 14.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 7.5, 13.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11, 10, 11],
            			"to": [14, 14, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 12, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [12.5, 0, 0.5],
            			"to": [15.5, 5, 3.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 2.5, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11.75, 5, 1.25],
            			"to": [14.75, 10, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 7.5, 2.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11, 10, 2],
            			"to": [14, 14, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 12, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1, 12, 10],
            			"to": [6, 14, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 13, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 12, 1],
            			"to": [6, 14, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 13, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [10, 12, 1],
            			"to": [15, 14, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 13, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [10, 12, 10],
            			"to": [15, 14, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 13, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -0.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String KITCHEN_TABLE_TOP = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"1": "TOP_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -0.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String KITCHEN_TABLE_LEG2 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "TOP_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12.5, 0, 12.5],
            			"to": [15.5, 5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 2.5, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11.75, 5, 11.75],
            			"to": [14.75, 10, 14.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 7.5, 13.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11, 10, 11],
            			"to": [14, 14, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 12, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [10, 12, 10],
            			"to": [15, 14, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 13, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -0.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String KITCHEN_TABLE_LEG1 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "TOP_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		},
            		{
            			"from": [12.5, 0, 0.5],
            			"to": [15.5, 5, 3.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 2.5, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11.75, 5, 1.25],
            			"to": [14.75, 10, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.25, 7.5, 2.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [11, 10, 2],
            			"to": [14, 14, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 12, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [10, 12, 1],
            			"to": [15, 14, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 13, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -0.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String KITCHEN_TABLE_LEG4 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "TOP_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.5, 0, 0.5],
            			"to": [3.5, 5, 3.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 2.5, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1.25, 5, 1.25],
            			"to": [4.25, 10, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.75, 7.5, 2.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [2, 10, 2],
            			"to": [5, 14, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 12, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1, 12, 1],
            			"to": [6, 14, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 13, 3.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -0.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String KITCHEN_TABLE_LEG3 = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "LEG_NAME",
            		"1": "TOP_NAME",
            		"2": "BOTTOM_NAME",
            		"particle": "LEG_NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 2], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.5, 0, 12.5],
            			"to": [3.5, 5, 15.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 2.5, 14]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1.25, 5, 11.75],
            			"to": [4.25, 10, 14.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.75, 7.5, 13.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 5], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [2, 10, 11],
            			"to": [5, 14, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 12, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"east": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"south": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"west": {"uv": [0, 0, 3, 4], "texture": "#2"},
            				"up": {"uv": [0, 0, 3, 3], "texture": "#2"},
            				"down": {"uv": [0, 0, 3, 3], "texture": "#2"}
            			}
            		},
            		{
            			"from": [1, 12, 10],
            			"to": [6, 14, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 13, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"east": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"south": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"west": {"uv": [0, 0, 5, 2], "texture": "#0"},
            				"up": {"uv": [0, 0, 5, 5], "texture": "#0"},
            				"down": {"uv": [0, 0, 5, 5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2.5, 2.25, -1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [-1.25, 2.5, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 2, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, -0.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"on_shelf": {
            			"translation": [0, 0, -4],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;
}