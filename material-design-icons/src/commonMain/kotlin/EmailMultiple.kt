package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailMultiple: ImageVector
    get() {
        if (_EmailMultiple != null) {
            return _EmailMultiple!!
        }
        _EmailMultiple = ImageVector.Builder(
            name = "EmailMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                verticalLineTo(4f)
                lineTo(14f, 9f)
                lineTo(6f, 4f)
                verticalLineTo(6f)
                lineTo(14f, 11f)
                lineTo(22f, 6f)
                moveTo(22f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                horizontalLineTo(6f)
                curveTo(4.89f, 18f, 4f, 17.1f, 4f, 16f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(22f)
                moveTo(2f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _EmailMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _EmailMultiple: ImageVector? = null
