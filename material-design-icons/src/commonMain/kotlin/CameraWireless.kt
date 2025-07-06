package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraWireless: ImageVector
    get() {
        if (_CameraWireless != null) {
            return _CameraWireless!!
        }
        _CameraWireless = ImageVector.Builder(
            name = "CameraWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.8f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.2f, 14f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17.2f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.8f, 14f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.8f)
                moveTo(16f, 3.33f)
                verticalLineTo(2f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                horizontalLineTo(20.67f)
                curveTo(20.67f, 5.42f, 18.58f, 3.33f, 16f, 3.33f)
                moveTo(16f, 6f)
                verticalLineTo(4.67f)
                curveTo(17.84f, 4.67f, 19.33f, 6.16f, 19.33f, 8f)
                horizontalLineTo(18f)
                curveTo(18f, 6.89f, 17.11f, 6f, 16f, 6f)
                moveTo(17f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                horizontalLineTo(7.17f)
                lineTo(9f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                curveTo(16.11f, 7f, 17f, 7.89f, 17f, 9f)
                moveTo(12f, 19f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                close()
            }
        }.build()

        return _CameraWireless!!
    }

@Suppress("ObjectPropertyName")
private var _CameraWireless: ImageVector? = null
