package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBrakeAlert: ImageVector
    get() {
        if (_CarBrakeAlert != null) {
            return _CarBrakeAlert!!
        }
        _CarBrakeAlert = ImageVector.Builder(
            name = "CarBrakeAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(12f, 3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(12f, 19f)
                curveTo(8.14f, 19f, 5f, 15.86f, 5f, 12f)
                curveTo(5f, 8.14f, 8.14f, 5f, 12f, 5f)
                curveTo(15.86f, 5f, 19f, 8.14f, 19f, 12f)
                curveTo(19f, 15.86f, 15.86f, 19f, 12f, 19f)
                moveTo(20.5f, 20.5f)
                curveTo(22.66f, 18.31f, 24f, 15.31f, 24f, 12f)
                curveTo(24f, 8.69f, 22.66f, 5.69f, 20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(21.32f, 6.5f, 22.5f, 9.11f, 22.5f, 12f)
                curveTo(22.5f, 14.9f, 21.32f, 17.5f, 19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                moveTo(4.58f, 19.42f)
                curveTo(2.68f, 17.5f, 1.5f, 14.9f, 1.5f, 12f)
                curveTo(1.5f, 9.11f, 2.68f, 6.5f, 4.58f, 4.58f)
                lineTo(3.5f, 3.5f)
                curveTo(1.34f, 5.69f, 0f, 8.69f, 0f, 12f)
                curveTo(0f, 15.31f, 1.34f, 18.31f, 3.5f, 20.5f)
                lineTo(4.58f, 19.42f)
                close()
            }
        }.build()

        return _CarBrakeAlert!!
    }

@Suppress("ObjectPropertyName")
private var _CarBrakeAlert: ImageVector? = null
