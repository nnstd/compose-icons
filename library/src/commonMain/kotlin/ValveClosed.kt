package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ValveClosed: ImageVector
    get() {
        if (_ValveClosed != null) {
            return _ValveClosed!!
        }
        _ValveClosed = ImageVector.Builder(
            name = "ValveClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(14.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.18f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(9.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.82f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _ValveClosed!!
    }

@Suppress("ObjectPropertyName")
private var _ValveClosed: ImageVector? = null
