package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DotNet: ImageVector
    get() {
        if (_DotNet != null) {
            return _DotNet!!
        }
        _DotNet = ImageVector.Builder(
            name = "DotNet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                moveTo(21f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                moveTo(16f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                moveTo(11f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                lineTo(6f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                lineTo(9f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _DotNet!!
    }

@Suppress("ObjectPropertyName")
private var _DotNet: ImageVector? = null
