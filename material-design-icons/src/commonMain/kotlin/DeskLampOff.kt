package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeskLampOff: ImageVector
    get() {
        if (_DeskLampOff != null) {
            return _DeskLampOff!!
        }
        _DeskLampOff = ImageVector.Builder(
            name = "DeskLampOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10.87f)
                lineTo(8.8f, 11.13f)
                curveTo(8.93f, 11.4f, 9f, 11.7f, 9f, 12f)
                curveTo(9f, 12.47f, 8.83f, 12.92f, 8.53f, 13.28f)
                lineTo(13f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(10.62f)
                lineTo(6.58f, 13.95f)
                curveTo(5.66f, 13.75f, 5f, 12.94f, 5f, 12f)
                curveTo(5f, 10.9f, 5.9f, 10f, 7f, 10f)
                horizontalLineTo(7.14f)
                lineTo(7.53f, 9.42f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(9f, 10.87f)
                moveTo(18.33f, 7f)
                lineTo(16.67f, 9.5f)
                curveTo(17.35f, 9.95f, 18.29f, 9.77f, 18.75f, 9.08f)
                reflectiveCurveTo(19f, 7.46f, 18.33f, 7f)
                moveTo(9.57f, 6.37f)
                lineTo(11f, 7.82f)
                lineTo(12f, 6.37f)
                curveTo(11.78f, 8.05f, 12.75f, 9.89f, 14.45f, 11f)
                lineTo(18.89f, 4.37f)
                curveTo(17.2f, 3.24f, 15.12f, 3.04f, 13.65f, 3.87f)
                lineTo(10.85f, 2f)
                lineTo(9.18f, 4.5f)
                lineTo(10.32f, 5.25f)
                lineTo(9.57f, 6.37f)
                close()
            }
        }.build()

        return _DeskLampOff!!
    }

@Suppress("ObjectPropertyName")
private var _DeskLampOff: ImageVector? = null
