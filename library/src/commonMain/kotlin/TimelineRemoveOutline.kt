package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimelineRemoveOutline: ImageVector
    get() {
        if (_TimelineRemoveOutline != null) {
            return _TimelineRemoveOutline!!
        }
        _TimelineRemoveOutline = ImageVector.Builder(
            name = "TimelineRemoveOutline",
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
                moveTo(13.88f, 15.54f)
                lineTo(16f, 13.41f)
                lineTo(18.12f, 15.53f)
                lineTo(19.53f, 14.12f)
                lineTo(17.41f, 12f)
                lineTo(19.53f, 9.88f)
                lineTo(18.12f, 8.47f)
                lineTo(16f, 10.59f)
                lineTo(13.88f, 8.47f)
                lineTo(12.47f, 9.88f)
                lineTo(14.59f, 12f)
                lineTo(12.47f, 14.12f)
                lineTo(13.88f, 15.54f)
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
                moveTo(22f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _TimelineRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimelineRemoveOutline: ImageVector? = null
