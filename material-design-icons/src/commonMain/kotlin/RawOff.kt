package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RawOff: ImageVector
    get() {
        if (_RawOff != null) {
            return _RawOff!!
        }
        _RawOff = ImageVector.Builder(
            name = "RawOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.15f, 14.32f)
                lineTo(14.72f, 11.9f)
                lineTo(14f, 9f)
                horizontalLineTo(15.5f)
                lineTo(16.24f, 12f)
                lineTo(17f, 9f)
                horizontalLineTo(18.5f)
                lineTo(19.24f, 12f)
                lineTo(20f, 9f)
                horizontalLineTo(21.5f)
                lineTo(20f, 15f)
                horizontalLineTo(18.5f)
                lineTo(17.74f, 11.96f)
                lineTo(17.15f, 14.32f)
                moveTo(1.39f, 4.22f)
                lineTo(2.81f, 2.81f)
                lineTo(21.19f, 21.2f)
                lineTo(19.78f, 22.61f)
                lineTo(10.67f, 13.5f)
                horizontalLineTo(10.63f)
                lineTo(10.25f, 15f)
                horizontalLineTo(8.75f)
                lineTo(9.43f, 12.26f)
                lineTo(8f, 10.83f)
                verticalLineTo(11.5f)
                curveTo(8f, 12.1f, 7.6f, 12.6f, 7.1f, 12.9f)
                lineTo(8f, 15f)
                horizontalLineTo(6.5f)
                lineTo(5.6f, 13f)
                horizontalLineTo(4.5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(6.17f)
                lineTo(1.39f, 4.22f)
                moveTo(6.5f, 11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()

        return _RawOff!!
    }

@Suppress("ObjectPropertyName")
private var _RawOff: ImageVector? = null
