package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Boombox: ImageVector
    get() {
        if (_Boombox != null) {
            return _Boombox!!
        }
        _Boombox = ImageVector.Builder(
            name = "Boombox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                lineTo(5f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                lineTo(17f, 5f)
                horizontalLineTo(7f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10f)
                horizontalLineTo(11f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                moveTo(7.5f, 10.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 13.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 16.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 13.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 10.5f)
                moveTo(16.5f, 10.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 13.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 16.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 13.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 10.5f)
                moveTo(7.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 12f)
                moveTo(16.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 12f)
                close()
            }
        }.build()

        return _Boombox!!
    }

@Suppress("ObjectPropertyName")
private var _Boombox: ImageVector? = null
