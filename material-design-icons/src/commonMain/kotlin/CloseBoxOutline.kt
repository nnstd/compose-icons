package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseBoxOutline: ImageVector
    get() {
        if (_CloseBoxOutline != null) {
            return _CloseBoxOutline!!
        }
        _CloseBoxOutline = ImageVector.Builder(
            name = "CloseBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(17f, 8.4f)
                lineTo(13.4f, 12f)
                lineTo(17f, 15.6f)
                lineTo(15.6f, 17f)
                lineTo(12f, 13.4f)
                lineTo(8.4f, 17f)
                lineTo(7f, 15.6f)
                lineTo(10.6f, 12f)
                lineTo(7f, 8.4f)
                lineTo(8.4f, 7f)
                lineTo(12f, 10.6f)
                lineTo(15.6f, 7f)
                lineTo(17f, 8.4f)
                close()
            }
        }.build()

        return _CloseBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloseBoxOutline: ImageVector? = null
