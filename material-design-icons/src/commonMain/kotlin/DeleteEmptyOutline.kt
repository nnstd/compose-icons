package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteEmptyOutline: ImageVector
    get() {
        if (_DeleteEmptyOutline != null) {
            return _DeleteEmptyOutline!!
        }
        _DeleteEmptyOutline = ImageVector.Builder(
            name = "DeleteEmptyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.37f, 8.91f)
                lineTo(19.37f, 10.64f)
                lineTo(7.24f, 3.64f)
                lineTo(8.24f, 1.91f)
                lineTo(11.28f, 3.66f)
                lineTo(12.64f, 3.29f)
                lineTo(16.97f, 5.79f)
                lineTo(17.34f, 7.16f)
                lineTo(20.37f, 8.91f)
                moveTo(6f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(11.07f)
                lineTo(18f, 11f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                moveTo(8f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(12.2f)
                lineTo(10.46f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _DeleteEmptyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteEmptyOutline: ImageVector? = null
