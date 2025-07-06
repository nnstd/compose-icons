package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeLessThan: ImageVector
    get() {
        if (_CodeLessThan != null) {
            return _CodeLessThan!!
        }
        _CodeLessThan = ImageVector.Builder(
            name = "CodeLessThan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.59f, 7.41f)
                lineTo(9f, 12f)
                lineTo(13.59f, 16.6f)
                lineTo(15f, 15.18f)
                lineTo(11.82f, 12f)
                lineTo(15f, 8.82f)
                moveTo(19f, 3f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _CodeLessThan!!
    }

@Suppress("ObjectPropertyName")
private var _CodeLessThan: ImageVector? = null
