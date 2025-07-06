package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeGreaterThan: ImageVector
    get() {
        if (_CodeGreaterThan != null) {
            return _CodeGreaterThan!!
        }
        _CodeGreaterThan = ImageVector.Builder(
            name = "CodeGreaterThan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.41f, 7.41f)
                lineTo(15f, 12f)
                lineTo(10.41f, 16.6f)
                lineTo(9f, 15.18f)
                lineTo(12.18f, 12f)
                lineTo(9f, 8.82f)
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CodeGreaterThan!!
    }

@Suppress("ObjectPropertyName")
private var _CodeGreaterThan: ImageVector? = null
