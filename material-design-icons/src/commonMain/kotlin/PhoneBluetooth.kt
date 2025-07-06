package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneBluetooth: ImageVector
    get() {
        if (_PhoneBluetooth != null) {
            return _PhoneBluetooth!!
        }
        _PhoneBluetooth = ImageVector.Builder(
            name = "PhoneBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.18f)
                lineTo(13.21f, 17.38f)
                curveTo(10.38f, 15.94f, 8.06f, 13.62f, 6.62f, 10.79f)
                lineTo(8.82f, 8.59f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 3f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                moveTo(18f, 7.21f)
                lineTo(18.94f, 8.14f)
                lineTo(18f, 9.08f)
                moveTo(18f, 2.91f)
                lineTo(18.94f, 3.85f)
                lineTo(18f, 4.79f)
                moveTo(14.71f, 9.5f)
                lineTo(17f, 7.21f)
                verticalLineTo(11f)
                horizontalLineTo(17.5f)
                lineTo(20.35f, 8.14f)
                lineTo(18.21f, 6f)
                lineTo(20.35f, 3.85f)
                lineTo(17.5f, 1f)
                horizontalLineTo(17f)
                verticalLineTo(4.79f)
                lineTo(14.71f, 2.5f)
                lineTo(14f, 3.21f)
                lineTo(16.79f, 6f)
                lineTo(14f, 8.79f)
                lineTo(14.71f, 9.5f)
                close()
            }
        }.build()

        return _PhoneBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneBluetooth: ImageVector? = null
