package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimelineClock: ImageVector
    get() {
        if (_TimelineClock != null) {
            return _TimelineClock!!
        }
        _TimelineClock = ImageVector.Builder(
            name = "TimelineClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(2f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                moveTo(5f, 12f)
                curveTo(5f, 13.11f, 4.11f, 14f, 3f, 14f)
                curveTo(1.9f, 14f, 1f, 13.11f, 1f, 12f)
                curveTo(1f, 10.9f, 1.9f, 10f, 3f, 10f)
                curveTo(4.11f, 10f, 5f, 10.9f, 5f, 12f)
                moveTo(16f, 4f)
                curveTo(20.42f, 4f, 24f, 7.58f, 24f, 12f)
                curveTo(24f, 16.42f, 20.42f, 20f, 16f, 20f)
                curveTo(12.4f, 20f, 9.36f, 17.62f, 8.35f, 14.35f)
                lineTo(6f, 12f)
                lineTo(8.35f, 9.65f)
                curveTo(9.36f, 6.38f, 12.4f, 4f, 16f, 4f)
                moveTo(15f, 13f)
                lineTo(19.53f, 15.79f)
                lineTo(20.33f, 14.5f)
                lineTo(16.5f, 12.2f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _TimelineClock!!
    }

@Suppress("ObjectPropertyName")
private var _TimelineClock: ImageVector? = null
