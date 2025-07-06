package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ButterflyOutline: ImageVector
    get() {
        if (_ButterflyOutline != null) {
            return _ButterflyOutline!!
        }
        _ButterflyOutline = ImageVector.Builder(
            name = "ButterflyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                lineTo(9.03f, 3.97f)
                lineTo(10f, 3f)
                lineTo(12f, 5f)
                lineTo(14f, 3f)
                lineTo(15f, 4f)
                lineTo(13f, 6f)
                verticalLineTo(21f)
                moveTo(14f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                curveTo(14.84f, 6.37f, 15.88f, 6f, 17f, 6f)
                curveTo(19.76f, 6f, 22f, 8.24f, 22f, 11f)
                curveTo(22f, 12.64f, 21.21f, 14.09f, 20f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                curveTo(20f, 19.21f, 18.21f, 21f, 16f, 21f)
                curveTo(15.27f, 21f, 14.59f, 20.81f, 14f, 20.46f)
                verticalLineTo(18.46f)
                curveTo(14.59f, 18.81f, 15.27f, 19f, 16f, 19f)
                curveTo(17.1f, 19f, 18f, 18.1f, 18f, 17f)
                verticalLineTo(13.83f)
                curveTo(19.17f, 13.42f, 20f, 12.31f, 20f, 11f)
                curveTo(20f, 9.35f, 18.67f, 8f, 17f, 8f)
                horizontalLineTo(17f)
                curveTo(15.88f, 8f, 14.84f, 8.37f, 14f, 9f)
                moveTo(10f, 9f)
                horizontalLineTo(10f)
                curveTo(9.16f, 8.37f, 8.13f, 8f, 7f, 8f)
                horizontalLineTo(7f)
                curveTo(5.33f, 8f, 4f, 9.35f, 4f, 11f)
                curveTo(4f, 12.31f, 4.84f, 13.42f, 6f, 13.83f)
                verticalLineTo(17f)
                curveTo(6f, 18.1f, 6.9f, 19f, 8f, 19f)
                curveTo(8.73f, 19f, 9.41f, 18.81f, 10f, 18.46f)
                verticalLineTo(20.46f)
                curveTo(9.41f, 20.81f, 8.73f, 21f, 8f, 21f)
                curveTo(5.79f, 21f, 4f, 19.21f, 4f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                curveTo(2.79f, 14.09f, 2f, 12.64f, 2f, 11f)
                curveTo(2f, 8.24f, 4.24f, 6f, 7f, 6f)
                curveTo(8.13f, 6f, 9.16f, 6.37f, 10f, 7f)
                verticalLineTo(9f)
                moveTo(9f, 11f)
                lineTo(7.5f, 9.5f)
                lineTo(6f, 11f)
                lineTo(7.5f, 12.5f)
                lineTo(9f, 11f)
                moveTo(18f, 11f)
                lineTo(16.5f, 9.5f)
                lineTo(15f, 11f)
                lineTo(16.5f, 12.5f)
                lineTo(18f, 11f)
                close()
            }
        }.build()

        return _ButterflyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ButterflyOutline: ImageVector? = null
