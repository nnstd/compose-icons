package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD6: ImageVector
    get() {
        if (_DiceD6 != null) {
            return _DiceD6!!
        }
        _DiceD6 = ImageVector.Builder(
            name = "DiceD6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.05f, 13.5f)
                curveTo(13.05f, 14.27f, 12.61f, 14.83f, 12f, 14.83f)
                reflectiveCurveTo(10.85f, 14.27f, 10.85f, 13.5f)
                lineTo(10.83f, 12.78f)
                curveTo(10.83f, 12.78f, 11.21f, 12f, 11.95f, 12.1f)
                curveTo(12.56f, 12.1f, 13.05f, 12.73f, 13.05f, 13.5f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                moveTo(14.55f, 13.41f)
                curveTo(14.5f, 11.45f, 13.19f, 10.87f, 12.53f, 10.87f)
                curveTo(11.41f, 10.87f, 10.86f, 11.53f, 10.86f, 11.53f)
                reflectiveCurveTo(10.89f, 9.5f, 13.39f, 9.53f)
                verticalLineTo(8.33f)
                curveTo(13.39f, 8.33f, 9.33f, 7.94f, 9.3f, 12.66f)
                curveTo(9.27f, 16.86f, 12.77f, 16f, 12.77f, 16f)
                reflectiveCurveTo(14.61f, 15.47f, 14.55f, 13.41f)
                close()
            }
        }.build()

        return _DiceD6!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD6: ImageVector? = null
