package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatReclineExtra: ImageVector
    get() {
        if (_SeatReclineExtra != null) {
            return _SeatReclineExtra!!
        }
        _SeatReclineExtra = ImageVector.Builder(
            name = "SeatReclineExtra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.35f, 5.64f)
                curveTo(4.45f, 5f, 4.23f, 3.76f, 4.86f, 2.85f)
                curveTo(5.5f, 1.95f, 6.74f, 1.73f, 7.65f, 2.36f)
                curveTo(8.55f, 3f, 8.77f, 4.24f, 8.14f, 5.15f)
                curveTo(7.5f, 6.05f, 6.26f, 6.27f, 5.35f, 5.64f)
                moveTo(16f, 19f)
                horizontalLineTo(8.93f)
                curveTo(7.45f, 19f, 6.19f, 17.92f, 5.97f, 16.46f)
                lineTo(4f, 7f)
                horizontalLineTo(2f)
                lineTo(4f, 16.76f)
                curveTo(4.37f, 19.2f, 6.47f, 21f, 8.94f, 21f)
                horizontalLineTo(16f)
                moveTo(16.23f, 15f)
                horizontalLineTo(11.35f)
                lineTo(10.32f, 10.9f)
                curveTo(11.9f, 11.79f, 13.6f, 12.44f, 15.47f, 12.12f)
                verticalLineTo(10f)
                curveTo(13.84f, 10.3f, 12.03f, 9.72f, 10.78f, 8.74f)
                lineTo(9.14f, 7.47f)
                curveTo(8.91f, 7.29f, 8.65f, 7.17f, 8.38f, 7.09f)
                curveTo(8.06f, 7f, 7.72f, 6.97f, 7.39f, 7.03f)
                horizontalLineTo(7.37f)
                curveTo(6.14f, 7.25f, 5.32f, 8.42f, 5.53f, 9.64f)
                lineTo(6.88f, 15.56f)
                curveTo(7.16f, 17f, 8.39f, 18f, 9.83f, 18f)
                horizontalLineTo(16.68f)
                lineTo(20.5f, 21f)
                lineTo(22f, 19.5f)
            }
        }.build()

        return _SeatReclineExtra!!
    }

@Suppress("ObjectPropertyName")
private var _SeatReclineExtra: ImageVector? = null
