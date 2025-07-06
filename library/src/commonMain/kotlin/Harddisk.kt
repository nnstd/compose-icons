package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Harddisk: ImageVector
    get() {
        if (_Harddisk != null) {
            return _Harddisk!!
        }
        _Harddisk = ImageVector.Builder(
            name = "Harddisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                moveTo(12f, 4f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                curveTo(6f, 13.31f, 8.69f, 16f, 12.1f, 16f)
                lineTo(11.22f, 13.77f)
                curveTo(10.95f, 13.29f, 11.11f, 12.68f, 11.59f, 12.4f)
                lineTo(12.45f, 11.9f)
                curveTo(12.93f, 11.63f, 13.54f, 11.79f, 13.82f, 12.27f)
                lineTo(15.74f, 14.69f)
                curveTo(17.12f, 13.59f, 18f, 11.9f, 18f, 10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(7f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                moveTo(12.09f, 13.27f)
                lineTo(14.58f, 19.58f)
                lineTo(17.17f, 18.08f)
                lineTo(12.95f, 12.77f)
                lineTo(12.09f, 13.27f)
                close()
            }
        }.build()

        return _Harddisk!!
    }

@Suppress("ObjectPropertyName")
private var _Harddisk: ImageVector? = null
