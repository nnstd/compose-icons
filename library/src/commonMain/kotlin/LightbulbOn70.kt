package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbOn70: ImageVector
    get() {
        if (_LightbulbOn70 != null) {
            return _LightbulbOn70!!
        }
        _LightbulbOn70 = ImageVector.Builder(
            name = "LightbulbOn70",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5.6f)
                lineTo(5.6f, 7f)
                lineTo(3.5f, 4.9f)
                lineTo(4.9f, 3.5f)
                lineTo(7f, 5.6f)
                moveTo(13f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                moveTo(1f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                moveTo(10f, 22f)
                curveTo(10f, 22.6f, 10.4f, 23f, 11f, 23f)
                horizontalLineTo(13f)
                curveTo(13.6f, 23f, 14f, 22.6f, 14f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                moveTo(19.1f, 3.5f)
                lineTo(17f, 5.6f)
                lineTo(18.4f, 7f)
                lineTo(20.5f, 4.9f)
                lineTo(19.1f, 3.5f)
                moveTo(18f, 12f)
                curveTo(18f, 14.2f, 16.8f, 16.2f, 15f, 17.2f)
                verticalLineTo(19f)
                curveTo(15f, 19.6f, 14.6f, 20f, 14f, 20f)
                horizontalLineTo(10f)
                curveTo(9.4f, 20f, 9f, 19.6f, 9f, 19f)
                verticalLineTo(17.2f)
                curveTo(7.2f, 16.2f, 6f, 14.2f, 6f, 12f)
                curveTo(6f, 8.7f, 8.7f, 6f, 12f, 6f)
                reflectiveCurveTo(18f, 8.7f, 18f, 12f)
                moveTo(8.14f, 11f)
                horizontalLineTo(15.86f)
                curveTo(15.41f, 9.28f, 13.86f, 8f, 12f, 8f)
                reflectiveCurveTo(8.59f, 9.28f, 8.14f, 11f)
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _LightbulbOn70!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOn70: ImageVector? = null
