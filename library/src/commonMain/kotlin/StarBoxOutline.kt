package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarBoxOutline: ImageVector
    get() {
        if (_StarBoxOutline != null) {
            return _StarBoxOutline!!
        }
        _StarBoxOutline = ImageVector.Builder(
            name = "StarBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.58f, 17f)
                lineTo(12f, 14.84f)
                lineTo(8.42f, 17f)
                lineTo(9.37f, 12.93f)
                lineTo(6.21f, 10.2f)
                lineTo(10.38f, 9.84f)
                lineTo(12f, 6f)
                lineTo(13.62f, 9.83f)
                lineTo(17.79f, 10.19f)
                lineTo(14.63f, 12.92f)
                lineTo(15.58f, 17f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _StarBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarBoxOutline: ImageVector? = null
