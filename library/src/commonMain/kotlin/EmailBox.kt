package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailBox: ImageVector
    get() {
        if (_EmailBox != null) {
            return _EmailBox!!
        }
        _EmailBox = ImageVector.Builder(
            name = "EmailBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(6.4f, 6.5f)
                horizontalLineTo(17.6f)
                curveTo(18.37f, 6.5f, 19f, 7.12f, 19f, 7.9f)
                verticalLineTo(16.1f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, 17.5f)
                horizontalLineTo(6.4f)
                curveTo(5.63f, 17.5f, 5f, 16.87f, 5f, 16.1f)
                verticalLineTo(7.9f)
                curveTo(5f, 7.12f, 5.62f, 6.5f, 6.4f, 6.5f)
                moveTo(6f, 8f)
                verticalLineTo(10f)
                lineTo(12f, 14f)
                lineTo(18f, 10f)
                verticalLineTo(8f)
                lineTo(12f, 12f)
                lineTo(6f, 8f)
                close()
            }
        }.build()

        return _EmailBox!!
    }

@Suppress("ObjectPropertyName")
private var _EmailBox: ImageVector? = null
