package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DominoMask: ImageVector
    get() {
        if (_DominoMask != null) {
            return _DominoMask!!
        }
        _DominoMask = ImageVector.Builder(
            name = "DominoMask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.83f, 9.81f)
                curveTo(14.7f, 9.7f, 13.69f, 10.38f, 13.46f, 11.5f)
                curveTo(13.46f, 11.84f, 14.81f, 12.29f, 16.05f, 12.29f)
                curveTo(17.29f, 12.29f, 18.41f, 11.5f, 18.41f, 11.28f)
                curveTo(18.41f, 11.05f, 17.63f, 9.93f, 15.83f, 9.81f)
                moveTo(8.18f, 9.81f)
                curveTo(6.38f, 9.93f, 5.59f, 10.94f, 5.59f, 11.27f)
                curveTo(5.59f, 11.5f, 6.82f, 12.29f, 7.95f, 12.29f)
                reflectiveCurveTo(10.54f, 11.84f, 10.54f, 11.5f)
                curveTo(10.31f, 10.38f, 9.19f, 9.7f, 8.18f, 9.81f)
                moveTo(16.95f, 16f)
                curveTo(15.04f, 16f, 13.8f, 13.75f, 12f, 13.75f)
                reflectiveCurveTo(8.85f, 16f, 7.05f, 16f)
                curveTo(4.69f, 16f, 3f, 13.86f, 3f, 10.04f)
                curveTo(3f, 7.68f, 3.68f, 7f, 6.71f, 7f)
                reflectiveCurveTo(10.54f, 8.24f, 12f, 8.24f)
                reflectiveCurveTo(14.36f, 7f, 17.29f, 7f)
                reflectiveCurveTo(21f, 7.79f, 21f, 10.04f)
                curveTo(21f, 13.86f, 19.31f, 16f, 16.95f, 16f)
                close()
            }
        }.build()

        return _DominoMask!!
    }

@Suppress("ObjectPropertyName")
private var _DominoMask: ImageVector? = null
