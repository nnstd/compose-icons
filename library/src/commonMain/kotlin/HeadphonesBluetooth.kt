package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadphonesBluetooth: ImageVector
    get() {
        if (_HeadphonesBluetooth != null) {
            return _HeadphonesBluetooth!!
        }
        _HeadphonesBluetooth = ImageVector.Builder(
            name = "HeadphonesBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                verticalLineTo(16.8f)
                curveTo(2f, 17.46f, 2.54f, 18f, 3.2f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(12.8f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.8f)
                verticalLineTo(12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6f)
                moveTo(19f, 7f)
                verticalLineTo(10.79f)
                lineTo(16.71f, 8.5f)
                lineTo(16f, 9.21f)
                lineTo(18.79f, 12f)
                lineTo(16f, 14.79f)
                lineTo(16.71f, 15.5f)
                lineTo(19f, 13.21f)
                verticalLineTo(17f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 14.14f)
                lineTo(20.21f, 12f)
                lineTo(22.35f, 9.85f)
                lineTo(19.5f, 7f)
                horizontalLineTo(19f)
                moveTo(20f, 8.91f)
                lineTo(20.94f, 9.85f)
                lineTo(20f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(20f, 13.21f)
                lineTo(20.94f, 14.14f)
                lineTo(20f, 15.08f)
                verticalLineTo(13.21f)
                close()
            }
        }.build()

        return _HeadphonesBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesBluetooth: ImageVector? = null
