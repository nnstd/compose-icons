package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vpn: ImageVector
    get() {
        if (_Vpn != null) {
            return _Vpn!!
        }
        _Vpn = ImageVector.Builder(
            name = "Vpn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                horizontalLineTo(15f)
                lineTo(12f, 8f)
                lineTo(9f, 5f)
                moveTo(10.5f, 14.66f)
                curveTo(10.2f, 15f, 10f, 15.5f, 10f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16f)
                curveTo(14f, 15.45f, 13.78f, 14.95f, 13.41f, 14.59f)
                lineTo(14.83f, 13.17f)
                curveTo(15.55f, 13.9f, 16f, 14.9f, 16f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                curveTo(8f, 14.93f, 8.42f, 13.96f, 9.1f, 13.25f)
                lineTo(9.09f, 13.24f)
                lineTo(16.17f, 6.17f)
                verticalLineTo(6.17f)
                curveTo(16.89f, 5.45f, 17.89f, 5f, 19f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                curveTo(17.9f, 13f, 16.9f, 12.55f, 16.17f, 11.83f)
                lineTo(17.59f, 10.41f)
                curveTo(17.95f, 10.78f, 18.45f, 11f, 19f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
                curveTo(18.45f, 7f, 17.95f, 7.22f, 17.59f, 7.59f)
                lineTo(10.5f, 14.66f)
                moveTo(6.41f, 7.59f)
                curveTo(6.05f, 7.22f, 5.55f, 7f, 5f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 11f)
                curveTo(5.55f, 11f, 6.05f, 10.78f, 6.41f, 10.41f)
                lineTo(7.83f, 11.83f)
                curveTo(7.1f, 12.55f, 6.1f, 13f, 5f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                curveTo(6.11f, 5f, 7.11f, 5.45f, 7.83f, 6.17f)
                verticalLineTo(6.17f)
                lineTo(10.59f, 8.93f)
                lineTo(9.17f, 10.35f)
                lineTo(6.41f, 7.59f)
                close()
            }
        }.build()

        return _Vpn!!
    }

@Suppress("ObjectPropertyName")
private var _Vpn: ImageVector? = null
