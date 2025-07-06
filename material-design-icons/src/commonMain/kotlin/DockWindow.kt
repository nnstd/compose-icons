package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DockWindow: ImageVector
    get() {
        if (_DockWindow != null) {
            return _DockWindow!!
        }
        _DockWindow = ImageVector.Builder(
            name = "DockWindow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                moveTo(22f, 6f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                moveTo(20f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _DockWindow!!
    }

@Suppress("ObjectPropertyName")
private var _DockWindow: ImageVector? = null
