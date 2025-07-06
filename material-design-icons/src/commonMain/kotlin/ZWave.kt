package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZWave: ImageVector
    get() {
        if (_ZWave != null) {
            return _ZWave!!
        }
        _ZWave = ImageVector.Builder(
            name = "ZWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.3f, 10.58f)
                curveTo(13.14f, 10.58f, 10.6f, 13.13f, 10.6f, 16.28f)
                curveTo(10.6f, 19.43f, 13.15f, 22f, 16.3f, 22f)
                curveTo(19.45f, 22f, 22f, 19.43f, 22f, 16.28f)
                curveTo(22f, 13.13f, 19.45f, 10.58f, 16.3f, 10.58f)
                moveTo(18f, 19.08f)
                horizontalLineTo(13.19f)
                lineTo(15.81f, 15f)
                horizontalLineTo(13.31f)
                lineTo(14.4f, 13.23f)
                horizontalLineTo(19.18f)
                lineTo(16.63f, 17.28f)
                horizontalLineTo(19.18f)
                lineTo(18f, 19.08f)
                moveTo(16.3f, 3.93f)
                verticalLineTo(2f)
                curveTo(8.41f, 2f, 2f, 8.42f, 2f, 16.31f)
                horizontalLineTo(3.92f)
                curveTo(3.94f, 9.46f, 9.5f, 3.93f, 16.3f, 3.93f)
                moveTo(16.3f, 7.74f)
                verticalLineTo(5.82f)
                curveTo(10.5f, 5.82f, 5.81f, 10.53f, 5.81f, 16.31f)
                horizontalLineTo(7.73f)
                curveTo(7.75f, 11.58f, 11.59f, 7.74f, 16.3f, 7.74f)
            }
        }.build()

        return _ZWave!!
    }

@Suppress("ObjectPropertyName")
private var _ZWave: ImageVector? = null
