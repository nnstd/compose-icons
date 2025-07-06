package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Multicast: ImageVector
    get() {
        if (_Multicast != null) {
            return _Multicast!!
        }
        _Multicast = ImageVector.Builder(
            name = "Multicast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                curveTo(10.9f, 4f, 10f, 4.89f, 10f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                lineTo(20f, 5f)
                lineTo(17f, 2f)
                moveTo(17f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(6.73f)
                curveTo(6.37f, 10.38f, 5.71f, 10f, 5f, 10f)
                curveTo(3.9f, 10f, 3f, 10.9f, 3f, 12f)
                reflectiveCurveTo(3.9f, 14f, 5f, 14f)
                curveTo(5.71f, 14f, 6.37f, 13.62f, 6.73f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                lineTo(20f, 12f)
                lineTo(17f, 9f)
                moveTo(10f, 15f)
                verticalLineTo(18f)
                curveTo(10f, 19.11f, 10.9f, 20f, 12f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                lineTo(20f, 19f)
                lineTo(17f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Multicast!!
    }

@Suppress("ObjectPropertyName")
private var _Multicast: ImageVector? = null
