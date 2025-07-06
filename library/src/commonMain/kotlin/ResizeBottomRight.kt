package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ResizeBottomRight: ImageVector
    get() {
        if (_ResizeBottomRight != null) {
            return _ResizeBottomRight!!
        }
        _ResizeBottomRight = ImageVector.Builder(
            name = "ResizeBottomRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(22f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                moveTo(18f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                moveTo(18f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                moveTo(14f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                moveTo(22f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _ResizeBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeBottomRight: ImageVector? = null
