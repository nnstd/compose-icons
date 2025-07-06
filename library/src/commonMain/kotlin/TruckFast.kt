package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckFast: ImageVector
    get() {
        if (_TruckFast != null) {
            return _TruckFast!!
        }
        _TruckFast = ImageVector.Builder(
            name = "TruckFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13.5f)
                lineTo(2.25f, 12f)
                horizontalLineTo(7.5f)
                lineTo(6.9f, 10.5f)
                horizontalLineTo(2f)
                lineTo(1.25f, 9f)
                horizontalLineTo(9.05f)
                lineTo(8.45f, 7.5f)
                horizontalLineTo(1.11f)
                lineTo(0.25f, 6f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                lineTo(24f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                horizontalLineTo(12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(13.5f)
                horizontalLineTo(3f)
                moveTo(19f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18.5f)
                moveTo(20.5f, 9.5f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(22.46f)
                lineTo(20.5f, 9.5f)
                moveTo(9f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18.5f)
                close()
            }
        }.build()

        return _TruckFast!!
    }

@Suppress("ObjectPropertyName")
private var _TruckFast: ImageVector? = null
