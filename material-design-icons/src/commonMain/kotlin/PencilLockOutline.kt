package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilLockOutline: ImageVector
    get() {
        if (_PencilLockOutline != null) {
            return _PencilLockOutline!!
        }
        _PencilLockOutline = ImageVector.Builder(
            name = "PencilLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.1f, 9f)
                lineTo(17f, 9.9f)
                lineTo(7.9f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(18.1f)
                lineTo(16.1f, 9f)
                moveTo(19.7f, 3f)
                curveTo(19.5f, 3f, 19.2f, 3.1f, 19f, 3.3f)
                lineTo(17.2f, 5.1f)
                lineTo(20.9f, 8.9f)
                lineTo(22.7f, 7f)
                curveTo(23.1f, 6.6f, 23.1f, 6f, 22.7f, 5.6f)
                lineTo(20.4f, 3.3f)
                curveTo(20.2f, 3.1f, 19.9f, 3f, 19.7f, 3f)
                moveTo(16.1f, 6.2f)
                lineTo(5f, 17.2f)
                verticalLineTo(21f)
                horizontalLineTo(8.8f)
                lineTo(19.8f, 9.9f)
                lineTo(16.1f, 6.2f)
                moveTo(8f, 5f)
                verticalLineTo(4.5f)
                curveTo(8f, 3.1f, 6.9f, 2f, 5.5f, 2f)
                curveTo(4.1f, 2f, 3f, 3.1f, 3f, 4.5f)
                verticalLineTo(5f)
                curveTo(2.4f, 5f, 2f, 5.4f, 2f, 6f)
                verticalLineTo(10f)
                curveTo(2f, 10.6f, 2.4f, 11f, 3f, 11f)
                horizontalLineTo(8f)
                curveTo(8.6f, 11f, 9f, 10.6f, 9f, 10f)
                verticalLineTo(6f)
                curveTo(9f, 5.4f, 8.6f, 5f, 8f, 5f)
                moveTo(7f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(4.5f)
                curveTo(4f, 3.7f, 4.7f, 3f, 5.5f, 3f)
                curveTo(6.3f, 3f, 7f, 3.7f, 7f, 4.5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _PencilLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilLockOutline: ImageVector? = null
