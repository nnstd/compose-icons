package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOpenMultiple: ImageVector
    get() {
        if (_EmailOpenMultiple != null) {
            return _EmailOpenMultiple!!
        }
        _EmailOpenMultiple = ImageVector.Builder(
            name = "EmailOpenMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                lineTo(14f, 13f)
                lineTo(22f, 8f)
                verticalLineTo(8f)
                lineTo(14f, 3f)
                lineTo(6f, 8f)
                verticalLineTo(8f)
                moveTo(24f, 8f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 20f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 18f)
                verticalLineTo(8f)
                curveTo(4f, 7.27f, 4.39f, 6.64f, 4.97f, 6.29f)
                lineTo(14f, 0.64f)
                lineTo(23.03f, 6.29f)
                curveTo(23.61f, 6.64f, 24f, 7.27f, 24f, 8f)
                moveTo(2f, 8f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _EmailOpenMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOpenMultiple: ImageVector? = null
