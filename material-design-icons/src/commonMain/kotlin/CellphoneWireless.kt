package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneWireless: ImageVector
    get() {
        if (_CellphoneWireless != null) {
            return _CellphoneWireless!!
        }
        _CellphoneWireless = ImageVector.Builder(
            name = "CellphoneWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.07f, 4.93f)
                curveTo(21.88f, 6.74f, 23f, 9.24f, 23f, 12f)
                curveTo(23f, 14.76f, 21.88f, 17.26f, 20.07f, 19.07f)
                lineTo(18.66f, 17.66f)
                curveTo(20.11f, 16.22f, 21f, 14.22f, 21f, 12f)
                curveTo(21f, 9.79f, 20.11f, 7.78f, 18.66f, 6.34f)
                lineTo(20.07f, 4.93f)
                moveTo(17.24f, 7.76f)
                curveTo(18.33f, 8.85f, 19f, 10.35f, 19f, 12f)
                curveTo(19f, 13.65f, 18.33f, 15.15f, 17.24f, 16.24f)
                lineTo(15.83f, 14.83f)
                curveTo(16.55f, 14.11f, 17f, 13.11f, 17f, 12f)
                curveTo(17f, 10.89f, 16.55f, 9.89f, 15.83f, 9.17f)
                lineTo(17.24f, 7.76f)
                moveTo(13f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10f)
                moveTo(11.5f, 1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3.5f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(20.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 23f)
                horizontalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 20.5f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 1f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _CellphoneWireless!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneWireless: ImageVector? = null
