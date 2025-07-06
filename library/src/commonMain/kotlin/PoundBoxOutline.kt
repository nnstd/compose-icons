package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PoundBoxOutline: ImageVector
    get() {
        if (_PoundBoxOutline != null) {
            return _PoundBoxOutline!!
        }
        _PoundBoxOutline = ImageVector.Builder(
            name = "PoundBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(7f, 9f)
                horizontalLineTo(9.31f)
                lineTo(9.63f, 6f)
                horizontalLineTo(11.63f)
                lineTo(11.31f, 9f)
                horizontalLineTo(13.31f)
                lineTo(13.63f, 6f)
                horizontalLineTo(15.63f)
                lineTo(15.31f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15.1f)
                lineTo(14.9f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(14.69f)
                lineTo(14.37f, 18f)
                horizontalLineTo(12.37f)
                lineTo(12.69f, 15f)
                horizontalLineTo(10.69f)
                lineTo(10.37f, 18f)
                horizontalLineTo(8.37f)
                lineTo(8.69f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(8.9f)
                lineTo(9.1f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(11.1f, 11f)
                lineTo(10.9f, 13f)
                horizontalLineTo(12.9f)
                lineTo(13.1f, 11f)
                close()
            }
        }.build()

        return _PoundBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PoundBoxOutline: ImageVector? = null
