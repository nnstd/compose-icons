package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookMultiple: ImageVector
    get() {
        if (_BookMultiple != null) {
            return _BookMultiple!!
        }
        _BookMultiple = ImageVector.Builder(
            name = "BookMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                lineTo(12f, 5.5f)
                lineTo(14f, 7f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                moveTo(17f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BookMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BookMultiple: ImageVector? = null
