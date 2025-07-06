package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimelineCheck: ImageVector
    get() {
        if (_TimelineCheck != null) {
            return _TimelineCheck!!
        }
        _TimelineCheck = ImageVector.Builder(
            name = "TimelineCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(2f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                moveTo(3f, 10f)
                curveTo(1.9f, 10f, 1f, 10.9f, 1f, 12f)
                curveTo(1f, 13.11f, 1.9f, 14f, 3f, 14f)
                curveTo(4.11f, 14f, 5f, 13.11f, 5f, 12f)
                curveTo(5f, 10.9f, 4.11f, 10f, 3f, 10f)
                moveTo(24f, 6f)
                verticalLineTo(18f)
                curveTo(24f, 19.11f, 23.11f, 20f, 22f, 20f)
                horizontalLineTo(10f)
                curveTo(8.9f, 20f, 8f, 19.11f, 8f, 18f)
                verticalLineTo(14f)
                lineTo(6f, 12f)
                lineTo(8f, 10f)
                verticalLineTo(6f)
                curveTo(8f, 4.89f, 8.9f, 4f, 10f, 4f)
                horizontalLineTo(22f)
                curveTo(23.11f, 4f, 24f, 4.89f, 24f, 6f)
                moveTo(19.75f, 10.33f)
                lineTo(18.59f, 8.92f)
                lineTo(15f, 12.5f)
                lineTo(13.41f, 10.92f)
                lineTo(12.25f, 12.08f)
                lineTo(15f, 15.08f)
                lineTo(19.75f, 10.33f)
                close()
            }
        }.build()

        return _TimelineCheck!!
    }

@Suppress("ObjectPropertyName")
private var _TimelineCheck: ImageVector? = null
