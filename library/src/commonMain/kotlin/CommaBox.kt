package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommaBox: ImageVector
    get() {
        if (_CommaBox != null) {
            return _CommaBox!!
        }
        _CommaBox = ImageVector.Builder(
            name = "CommaBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(15f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                lineTo(10f, 17f)
                horizontalLineTo(13f)
                lineTo(15f, 13f)
                close()
            }
        }.build()

        return _CommaBox!!
    }

@Suppress("ObjectPropertyName")
private var _CommaBox: ImageVector? = null
