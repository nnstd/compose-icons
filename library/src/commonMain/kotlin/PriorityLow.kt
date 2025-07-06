package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PriorityLow: ImageVector
    get() {
        if (_PriorityLow != null) {
            return _PriorityLow!!
        }
        _PriorityLow = ImageVector.Builder(
            name = "PriorityLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                moveTo(14f, 10.5f)
                horizontalLineTo(22f)
                verticalLineTo(12.5f)
                horizontalLineTo(14f)
                verticalLineTo(10.5f)
                moveTo(14f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                moveTo(2f, 11.5f)
                curveTo(2f, 15.08f, 4.92f, 18f, 8.5f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                lineTo(12f, 17f)
                lineTo(9f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(8.5f)
                curveTo(6f, 16f, 4f, 14f, 4f, 11.5f)
                curveTo(4f, 9f, 6f, 7f, 8.5f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(8.5f)
                curveTo(4.92f, 5f, 2f, 7.92f, 2f, 11.5f)
                close()
            }
        }.build()

        return _PriorityLow!!
    }

@Suppress("ObjectPropertyName")
private var _PriorityLow: ImageVector? = null
