package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GiftOff: ImageVector
    get() {
        if (_GiftOff != null) {
            return _GiftOff!!
        }
        _GiftOff = ImageVector.Builder(
            name = "GiftOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.11f, 3f)
                lineTo(4.14f, 6.04f)
                horizontalLineTo(3f)
                curveTo(1.9f, 6.04f, 1f, 6.93f, 1f, 8.04f)
                verticalLineTo(10.04f)
                curveTo(1f, 10.59f, 1.45f, 11.04f, 2f, 11.04f)
                horizontalLineTo(9.15f)
                lineTo(10.15f, 12.04f)
                horizontalLineTo(2f)
                verticalLineTo(20.04f)
                curveTo(2f, 21.14f, 2.9f, 22.04f, 4f, 22.04f)
                horizontalLineTo(20f)
                curveTo(20.05f, 22.04f, 20.09f, 22.03f, 20.13f, 22f)
                lineTo(21.56f, 23.45f)
                lineTo(22.83f, 22.18f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                moveTo(11f, 12.89f)
                lineTo(13f, 14.89f)
                verticalLineTo(20.04f)
                horizontalLineTo(11f)
                verticalLineTo(12.89f)
                moveTo(22f, 12.04f)
                verticalLineTo(18.8f)
                lineTo(15.24f, 12.04f)
                horizontalLineTo(22f)
                moveTo(21f, 6.04f)
                horizontalLineTo(17.83f)
                curveTo(19f, 2.77f, 14.6f, 0.455f, 12.57f, 3.28f)
                lineTo(12f, 4.04f)
                lineTo(11.43f, 3.26f)
                curveTo(10.8f, 2.37f, 9.93f, 2f, 9.06f, 1.97f)
                curveTo(8.06f, 1.96f, 7.08f, 2.5f, 6.5f, 3.3f)
                lineTo(8.04f, 4.84f)
                curveTo(8.13f, 4.38f, 8.5f, 4.04f, 9f, 4.04f)
                curveTo(9.89f, 4.04f, 10.34f, 5.12f, 9.71f, 5.75f)
                curveTo(9.56f, 5.89f, 9.39f, 6f, 9.21f, 6f)
                lineTo(11.24f, 8.04f)
                horizontalLineTo(13f)
                verticalLineTo(9.8f)
                lineTo(14.24f, 11.04f)
                horizontalLineTo(22f)
                curveTo(22.55f, 11.04f, 23f, 10.59f, 23f, 10.04f)
                verticalLineTo(8.04f)
                curveTo(23f, 6.93f, 22.11f, 6.04f, 21f, 6.04f)
                moveTo(15.71f, 5.75f)
                curveTo(15.08f, 6.38f, 14f, 5.93f, 14f, 5.04f)
                curveTo(14f, 4.5f, 14.45f, 4.04f, 15f, 4.04f)
                curveTo(15.89f, 4.04f, 16.34f, 5.12f, 15.71f, 5.75f)
                close()
            }
        }.build()

        return _GiftOff!!
    }

@Suppress("ObjectPropertyName")
private var _GiftOff: ImageVector? = null
