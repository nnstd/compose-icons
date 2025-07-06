package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarInfo: ImageVector
    get() {
        if (_CarInfo != null) {
            return _CarInfo!!
        }
        _CarInfo = ImageVector.Builder(
            name = "CarInfo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(20f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                moveTo(18.92f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 4f)
                horizontalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.08f, 5f)
                lineTo(3f, 11f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                arcTo(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.68f)
                verticalLineTo(11f)
                moveTo(6.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 15f)
                moveTo(5f, 10f)
                lineTo(6.5f, 5.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 10f)
                close()
            }
        }.build()

        return _CarInfo!!
    }

@Suppress("ObjectPropertyName")
private var _CarInfo: ImageVector? = null
