package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeEqual: ImageVector
    get() {
        if (_CodeEqual != null) {
            return _CodeEqual!!
        }
        _CodeEqual = ImageVector.Builder(
            name = "CodeEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                moveTo(13f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                moveTo(13f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                moveTo(6f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
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

        return _CodeEqual!!
    }

@Suppress("ObjectPropertyName")
private var _CodeEqual: ImageVector? = null
