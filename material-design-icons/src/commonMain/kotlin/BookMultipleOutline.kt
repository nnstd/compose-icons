package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookMultipleOutline: ImageVector
    get() {
        if (_BookMultipleOutline != null) {
            return _BookMultipleOutline!!
        }
        _BookMultipleOutline = ImageVector.Builder(
            name = "BookMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                horizontalLineTo(19f)
                moveTo(19f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                lineTo(13.5f, 7.75f)
                lineTo(11f, 10f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                moveTo(3f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _BookMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookMultipleOutline: ImageVector? = null
