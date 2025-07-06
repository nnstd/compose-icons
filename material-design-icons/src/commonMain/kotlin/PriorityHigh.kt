package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PriorityHigh: ImageVector
    get() {
        if (_PriorityHigh != null) {
            return _PriorityHigh!!
        }
        _PriorityHigh = ImageVector.Builder(
            name = "PriorityHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                moveTo(14f, 13.5f)
                horizontalLineTo(22f)
                verticalLineTo(11.5f)
                horizontalLineTo(14f)
                verticalLineTo(13.5f)
                moveTo(14f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                moveTo(2f, 12.5f)
                curveTo(2f, 8.92f, 4.92f, 6f, 8.5f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                lineTo(12f, 7f)
                lineTo(9f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(8.5f)
                curveTo(6f, 8f, 4f, 10f, 4f, 12.5f)
                curveTo(4f, 15f, 6f, 17f, 8.5f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                horizontalLineTo(8.5f)
                curveTo(4.92f, 19f, 2f, 16.08f, 2f, 12.5f)
                close()
            }
        }.build()

        return _PriorityHigh!!
    }

@Suppress("ObjectPropertyName")
private var _PriorityHigh: ImageVector? = null
