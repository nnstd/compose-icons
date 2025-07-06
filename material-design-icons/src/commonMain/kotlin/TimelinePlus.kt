package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimelinePlus: ImageVector
    get() {
        if (_TimelinePlus != null) {
            return _TimelinePlus!!
        }
        _TimelinePlus = ImageVector.Builder(
            name = "TimelinePlus",
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
                moveTo(20f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TimelinePlus!!
    }

@Suppress("ObjectPropertyName")
private var _TimelinePlus: ImageVector? = null
