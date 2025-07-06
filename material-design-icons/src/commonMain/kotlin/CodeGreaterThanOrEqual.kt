package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeGreaterThanOrEqual: ImageVector
    get() {
        if (_CodeGreaterThanOrEqual != null) {
            return _CodeGreaterThanOrEqual!!
        }
        _CodeGreaterThanOrEqual = ImageVector.Builder(
            name = "CodeGreaterThanOrEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                moveTo(13f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                moveTo(6.91f, 7.41f)
                lineTo(11.5f, 12f)
                lineTo(6.91f, 16.6f)
                lineTo(5.5f, 15.18f)
                lineTo(8.68f, 12f)
                lineTo(5.5f, 8.82f)
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

        return _CodeGreaterThanOrEqual!!
    }

@Suppress("ObjectPropertyName")
private var _CodeGreaterThanOrEqual: ImageVector? = null
