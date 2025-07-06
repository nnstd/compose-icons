package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HvacOff: ImageVector
    get() {
        if (_HvacOff != null) {
            return _HvacOff!!
        }
        _HvacOff = ImageVector.Builder(
            name = "HvacOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.89f)
                verticalLineTo(21f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 18f)
                curveTo(8.67f, 18f, 6f, 15.33f, 6f, 12f)
                curveTo(6f, 10.82f, 6.34f, 9.73f, 6.92f, 8.81f)
                lineTo(8.43f, 10.32f)
                curveTo(8.24f, 10.69f, 8.1f, 11.09f, 8.06f, 11.5f)
                horizontalLineTo(9.61f)
                lineTo(10.61f, 12.5f)
                horizontalLineTo(8.06f)
                curveTo(8.11f, 13.03f, 8.3f, 13.55f, 8.58f, 14f)
                horizontalLineTo(12.11f)
                lineTo(13.11f, 15f)
                horizontalLineTo(9.38f)
                curveTo(10.08f, 15.61f, 10.97f, 16f, 12f, 16f)
                curveTo(12.63f, 16f, 13.19f, 15.84f, 13.7f, 15.59f)
                lineTo(15.19f, 17.08f)
                curveTo(14.27f, 17.66f, 13.18f, 18f, 12f, 18f)
                moveTo(12f, 8f)
                curveTo(13.03f, 8f, 13.92f, 8.39f, 14.63f, 9f)
                horizontalLineTo(12.2f)
                lineTo(11.27f, 8.07f)
                curveTo(11.5f, 8.03f, 11.75f, 8f, 12f, 8f)
                moveTo(9.67f, 6.47f)
                lineTo(6.2f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(17.8f)
                lineTo(17.53f, 14.33f)
                curveTo(17.83f, 13.62f, 18f, 12.83f, 18f, 12f)
                curveTo(18f, 8.67f, 15.33f, 6f, 12f, 6f)
                curveTo(11.17f, 6f, 10.38f, 6.17f, 9.67f, 6.47f)
                moveTo(15.94f, 11.5f)
                horizontalLineTo(14.7f)
                lineTo(13.2f, 10f)
                horizontalLineTo(15.42f)
                curveTo(15.7f, 10.45f, 15.89f, 10.97f, 15.94f, 11.5f)
                close()
            }
        }.build()

        return _HvacOff!!
    }

@Suppress("ObjectPropertyName")
private var _HvacOff: ImageVector? = null
