package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbCflOff: ImageVector
    get() {
        if (_LightbulbCflOff != null) {
            return _LightbulbCflOff!!
        }
        _LightbulbCflOff = ImageVector.Builder(
            name = "LightbulbCflOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 4.47f)
                curveTo(14f, 3.56f, 13.63f, 2.7f, 13f, 2.05f)
                curveTo(13.17f, 2f, 13.33f, 2f, 13.5f, 2f)
                curveTo(14.88f, 2f, 16f, 3.12f, 16f, 4.5f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(15.18f)
                lineTo(14f, 12.18f)
                verticalLineTo(4.5f)
                lineTo(14f, 4.47f)
                moveTo(10f, 4.5f)
                curveTo(10f, 4.22f, 10.22f, 4f, 10.5f, 4f)
                reflectiveCurveTo(11f, 4.22f, 11f, 4.5f)
                verticalLineTo(9.18f)
                lineTo(13f, 11.18f)
                verticalLineTo(4.5f)
                curveTo(13f, 3.12f, 11.88f, 2f, 10.5f, 2f)
                reflectiveCurveTo(8f, 3.12f, 8f, 4.5f)
                verticalLineTo(6.18f)
                lineTo(10f, 8.18f)
                verticalLineTo(4.5f)
                moveTo(9f, 21f)
                curveTo(9f, 21.55f, 9.45f, 22f, 10f, 22f)
                horizontalLineTo(14f)
                curveTo(14.55f, 22f, 15f, 21.55f, 15f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                moveTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(14.73f, 18f)
                horizontalLineTo(8f)
                curveTo(7.45f, 18f, 7f, 17.55f, 7f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(11.27f)
                lineTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                close()
            }
        }.build()

        return _LightbulbCflOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbCflOff: ImageVector? = null
