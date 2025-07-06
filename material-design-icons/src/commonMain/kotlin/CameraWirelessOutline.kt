package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraWirelessOutline: ImageVector
    get() {
        if (_CameraWirelessOutline != null) {
            return _CameraWirelessOutline!!
        }
        _CameraWirelessOutline = ImageVector.Builder(
            name = "CameraWirelessOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(8.05f)
                lineTo(9.88f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                lineTo(7.17f, 6f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                moveTo(20.67f, 8f)
                horizontalLineTo(22f)
                curveTo(22f, 4.68f, 19.31f, 2f, 16f, 2f)
                verticalLineTo(3.33f)
                curveTo(18.58f, 3.33f, 20.66f, 5.41f, 20.67f, 8f)
                moveTo(18f, 8f)
                horizontalLineTo(19.33f)
                curveTo(19.32f, 6.15f, 17.84f, 4.67f, 16f, 4.67f)
                verticalLineTo(6f)
                curveTo(17.11f, 6f, 18f, 6.89f, 18f, 8f)
                moveTo(7f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 14f)
                moveTo(15f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 14f)
                close()
            }
        }.build()

        return _CameraWirelessOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraWirelessOutline: ImageVector? = null
