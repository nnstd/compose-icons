package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkiWater: ImageVector
    get() {
        if (_SkiWater != null) {
            return _SkiWater!!
        }
        _SkiWater = ImageVector.Builder(
            name = "SkiWater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.2f, 3.5f)
                curveTo(4.2f, 2.7f, 4.9f, 1.9f, 5.8f, 1.9f)
                curveTo(6.7f, 1.9f, 7.4f, 2.6f, 7.4f, 3.5f)
                reflectiveCurveTo(6.6f, 5f, 5.8f, 5f)
                reflectiveCurveTo(4.2f, 4.3f, 4.2f, 3.5f)
                moveTo(22f, 3.9f)
                lineTo(21.5f, 3f)
                lineTo(13.5f, 7.1f)
                lineTo(14f, 8f)
                lineTo(22f, 3.9f)
                moveTo(20.8f, 20.3f)
                lineTo(21.7f, 21.2f)
                curveTo(21.1f, 21.8f, 20.5f, 22.2f, 19.8f, 22.5f)
                reflectiveCurveTo(18.3f, 23f, 17.5f, 23f)
                horizontalLineTo(2f)
                verticalLineTo(21.7f)
                horizontalLineTo(4.7f)
                lineTo(6.8f, 18.2f)
                lineTo(4.5f, 15f)
                lineTo(3.7f, 7.2f)
                curveTo(3.7f, 6.3f, 4.5f, 5.5f, 5.4f, 5.5f)
                curveTo(5.7f, 5.5f, 6f, 5.6f, 6.2f, 5.7f)
                lineTo(9.7f, 8.3f)
                lineTo(12f, 7.5f)
                lineTo(12.8f, 9.1f)
                lineTo(9.3f, 10.6f)
                curveTo(9.2f, 10.5f, 7.7f, 9.4f, 6.6f, 8.5f)
                lineTo(7f, 12f)
                lineTo(12.3f, 16.5f)
                lineTo(14f, 21.7f)
                horizontalLineTo(17.5f)
                curveTo(18.1f, 21.7f, 18.7f, 21.6f, 19.3f, 21.3f)
                curveTo(19.9f, 21.1f, 20.4f, 20.7f, 20.8f, 20.3f)
                moveTo(7f, 21.7f)
                horizontalLineTo(12f)
                lineTo(10.4f, 17.8f)
                lineTo(8.1f, 15.9f)
                lineTo(9.3f, 18.4f)
                lineTo(7f, 21.7f)
                close()
            }
        }.build()

        return _SkiWater!!
    }

@Suppress("ObjectPropertyName")
private var _SkiWater: ImageVector? = null
