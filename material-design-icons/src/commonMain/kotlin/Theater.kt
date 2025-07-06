package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Theater: ImageVector
    get() {
        if (_Theater != null) {
            return _Theater!!
        }
        _Theater = ImageVector.Builder(
            name = "Theater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 15f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(23f)
                verticalLineTo(22f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                moveTo(11f, 7f)
                lineTo(15f, 10f)
                lineTo(11f, 13f)
                verticalLineTo(7f)
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(13.54f)
                curveTo(21.41f, 13.19f, 20.73f, 13f, 20f, 13f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                curveTo(3.27f, 13f, 2.59f, 13.19f, 2f, 13.54f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                close()
            }
        }.build()

        return _Theater!!
    }

@Suppress("ObjectPropertyName")
private var _Theater: ImageVector? = null
