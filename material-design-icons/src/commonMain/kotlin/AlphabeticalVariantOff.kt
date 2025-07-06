package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabeticalVariantOff: ImageVector
    get() {
        if (_AlphabeticalVariantOff != null) {
            return _AlphabeticalVariantOff!!
        }
        _AlphabeticalVariantOff = ImageVector.Builder(
            name = "AlphabeticalVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.2f, 9f)
                lineTo(10.2f, 7f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                verticalLineTo(10.5f)
                arcTo(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.64f, 11.44f)
                lineTo(13f, 9.8f)
                verticalLineTo(9f)
                moveTo(23f, 10f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9f)
                verticalLineTo(13.8f)
                lineTo(20.2f, 17f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(15f, 14.35f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(14.46f, 16.35f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(10.89f)
                lineTo(7f, 8.89f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                horizontalLineTo(5.12f)
                lineTo(1.12f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(9f, 8.34f)
                lineTo(11f, 10.34f)
                lineTo(11.66f, 11f)
                lineTo(15f, 14.34f)
                moveTo(5f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(13f, 14.89f)
                lineTo(11.11f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _AlphabeticalVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabeticalVariantOff: ImageVector? = null
