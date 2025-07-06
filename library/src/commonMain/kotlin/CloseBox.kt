package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseBox: ImageVector
    get() {
        if (_CloseBox != null) {
            return _CloseBox!!
        }
        _CloseBox = ImageVector.Builder(
            name = "CloseBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(16.3f)
                horizontalLineTo(7.7f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(7.7f)
                verticalLineTo(16.4f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(7.7f)
                horizontalLineTo(16.4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(16.3f)
                verticalLineTo(7.7f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(15.6f, 17f)
                lineTo(12f, 13.4f)
                lineTo(8.4f, 17f)
                lineTo(7f, 15.6f)
                lineTo(10.6f, 12f)
                lineTo(7f, 8.4f)
                lineTo(8.4f, 7f)
                lineTo(12f, 10.6f)
                lineTo(15.6f, 7f)
                lineTo(17f, 8.4f)
                lineTo(13.4f, 12f)
                lineTo(17f, 15.6f)
                lineTo(15.6f, 17f)
                close()
            }
        }.build()

        return _CloseBox!!
    }

@Suppress("ObjectPropertyName")
private var _CloseBox: ImageVector? = null
