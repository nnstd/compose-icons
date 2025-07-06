package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchVibrateOff: ImageVector
    get() {
        if (_WatchVibrateOff != null) {
            return _WatchVibrateOff!!
        }
        _WatchVibrateOff = ImageVector.Builder(
            name = "WatchVibrateOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                moveTo(12f, 7.5f)
                curveTo(14.47f, 7.5f, 16.47f, 9.53f, 16.46f, 12f)
                curveTo(16.45f, 12.38f, 16.4f, 12.76f, 16.3f, 13.13f)
                lineTo(17.5f, 14.31f)
                curveTo(17.81f, 13.58f, 18f, 12.8f, 18f, 12f)
                curveTo(18f, 10.17f, 17.16f, 8.44f, 15.72f, 7.31f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(8.59f, 5.39f)
                lineTo(10.86f, 7.66f)
                curveTo(11.23f, 7.55f, 11.61f, 7.5f, 12f, 7.5f)
                moveTo(21f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(20.2f, 17f)
                horizontalLineTo(21f)
                moveTo(16.5f, 15.86f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(15.55f, 17.44f)
                lineTo(15f, 21f)
                horizontalLineTo(9f)
                lineTo(8.27f, 16.72f)
                curveTo(5.85f, 14.82f, 5.27f, 11.4f, 6.91f, 8.8f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(8.09f, 7.44f)
                lineTo(9.17f, 8.5f)
                lineTo(15.44f, 14.79f)
                lineTo(16.5f, 15.86f)
                moveTo(14.05f, 15.94f)
                lineTo(8.05f, 9.94f)
                curveTo(7.7f, 10.57f, 7.5f, 11.28f, 7.5f, 12f)
                curveTo(7.5f, 14.47f, 9.53f, 16.47f, 12f, 16.46f)
                curveTo(12.72f, 16.46f, 13.42f, 16.28f, 14.05f, 15.94f)
                moveTo(22f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(24f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                moveTo(3f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _WatchVibrateOff!!
    }

@Suppress("ObjectPropertyName")
private var _WatchVibrateOff: ImageVector? = null
