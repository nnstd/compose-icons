package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusSign: ImageVector
    get() {
        if (_BusSign != null) {
            return _BusSign!!
        }
        _BusSign = ImageVector.Builder(
            name = "BusSign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                horizontalLineTo(11.07f)
                curveTo(10.39f, 12.18f, 10f, 13.54f, 10f, 15f)
                curveTo(10f, 16.46f, 10.39f, 17.82f, 11.07f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                curveTo(6f, 20.27f, 5.9f, 20.5f, 5.71f, 20.71f)
                curveTo(5.5f, 20.9f, 5.27f, 21f, 5f, 21f)
                horizontalLineTo(4f)
                curveTo(3.74f, 21f, 3.5f, 20.9f, 3.29f, 20.71f)
                curveTo(3.11f, 20.5f, 3f, 20.27f, 3f, 20f)
                verticalLineTo(18.22f)
                curveTo(2.39f, 17.67f, 2f, 16.88f, 2f, 16f)
                verticalLineTo(6f)
                curveTo(2f, 2.5f, 5.58f, 2f, 10f, 2f)
                curveTo(14.42f, 2f, 18f, 2.5f, 18f, 6f)
                verticalLineTo(7f)
                curveTo(17.31f, 7f, 16.64f, 7.09f, 16f, 7.25f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                moveTo(5.5f, 17f)
                curveTo(5.9f, 17f, 6.28f, 16.84f, 6.56f, 16.56f)
                curveTo(6.84f, 16.28f, 7f, 15.9f, 7f, 15.5f)
                curveTo(7f, 15.1f, 6.84f, 14.72f, 6.56f, 14.44f)
                curveTo(6.28f, 14.16f, 5.9f, 14f, 5.5f, 14f)
                curveTo(5.1f, 14f, 4.72f, 14.16f, 4.44f, 14.44f)
                curveTo(4.16f, 14.72f, 4f, 15.1f, 4f, 15.5f)
                curveTo(4f, 15.9f, 4.16f, 16.28f, 4.44f, 16.56f)
                curveTo(4.72f, 16.84f, 5.1f, 17f, 5.5f, 17f)
                moveTo(15f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                curveTo(21f, 19.45f, 20.55f, 19f, 20f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                lineTo(23f, 12f)
                lineTo(21f, 10f)
                horizontalLineTo(13f)
                lineTo(15f, 12f)
                lineTo(13f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                curveTo(15.45f, 19f, 15f, 19.45f, 15f, 20f)
                close()
            }
        }.build()

        return _BusSign!!
    }

@Suppress("ObjectPropertyName")
private var _BusSign: ImageVector? = null
