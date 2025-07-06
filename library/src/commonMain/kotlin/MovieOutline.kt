package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOutline: ImageVector
    get() {
        if (_MovieOutline != null) {
            return _MovieOutline!!
        }
        _MovieOutline = ImageVector.Builder(
            name = "MovieOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.76f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(6.47f)
                moveTo(22f, 4f)
                horizontalLineTo(18f)
                lineTo(20f, 8f)
                horizontalLineTo(17f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                lineTo(15f, 8f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(8f)
                lineTo(10f, 8f)
                horizontalLineTo(7f)
                lineTo(5f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MovieOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOutline: ImageVector? = null
