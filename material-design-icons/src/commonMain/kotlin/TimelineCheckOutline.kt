package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimelineCheckOutline: ImageVector
    get() {
        if (_TimelineCheckOutline != null) {
            return _TimelineCheckOutline!!
        }
        _TimelineCheckOutline = ImageVector.Builder(
            name = "TimelineCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                horizontalLineTo(10f)
                curveTo(8.9f, 4f, 8f, 4.89f, 8f, 6f)
                verticalLineTo(10f)
                lineTo(6f, 12f)
                lineTo(8f, 14f)
                verticalLineTo(18f)
                curveTo(8f, 19.11f, 8.9f, 20f, 10f, 20f)
                horizontalLineTo(22f)
                curveTo(23.11f, 20f, 24f, 19.11f, 24f, 18f)
                verticalLineTo(6f)
                curveTo(24f, 4.89f, 23.11f, 4f, 22f, 4f)
                moveTo(22f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                moveTo(4f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(2f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                moveTo(5f, 12f)
                curveTo(5f, 13.11f, 4.11f, 14f, 3f, 14f)
                curveTo(1.9f, 14f, 1f, 13.11f, 1f, 12f)
                curveTo(1f, 10.9f, 1.9f, 10f, 3f, 10f)
                curveTo(4.11f, 10f, 5f, 10.9f, 5f, 12f)
                moveTo(15f, 15.08f)
                lineTo(12.25f, 12.08f)
                lineTo(13.41f, 10.92f)
                lineTo(15f, 12.5f)
                lineTo(18.59f, 8.92f)
                lineTo(19.75f, 10.33f)
                lineTo(15f, 15.08f)
                close()
            }
        }.build()

        return _TimelineCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimelineCheckOutline: ImageVector? = null
