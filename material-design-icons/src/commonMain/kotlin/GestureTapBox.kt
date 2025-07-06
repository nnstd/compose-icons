package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureTapBox: ImageVector
    get() {
        if (_GestureTapBox != null) {
            return _GestureTapBox!!
        }
        _GestureTapBox = ImageVector.Builder(
            name = "GestureTapBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.11f, 2f, 20f, 2f)
                moveTo(11f, 4f)
                curveTo(13.21f, 4f, 15f, 5.79f, 15f, 8f)
                curveTo(15f, 9.5f, 14.2f, 10.77f, 13f, 11.46f)
                verticalLineTo(10.24f)
                curveTo(13.61f, 9.69f, 14f, 8.89f, 14f, 8f)
                curveTo(14f, 6.34f, 12.66f, 5f, 11f, 5f)
                reflectiveCurveTo(8f, 6.34f, 8f, 8f)
                curveTo(8f, 8.89f, 8.39f, 9.69f, 9f, 10.24f)
                verticalLineTo(11.46f)
                curveTo(7.8f, 10.77f, 7f, 9.5f, 7f, 8f)
                curveTo(7f, 5.79f, 8.79f, 4f, 11f, 4f)
                moveTo(18f, 18.5f)
                curveTo(17.97f, 19.32f, 17.32f, 19.97f, 16.5f, 20f)
                horizontalLineTo(11f)
                curveTo(10.62f, 20f, 10.26f, 19.85f, 10f, 19.57f)
                lineTo(6f, 15.37f)
                lineTo(6.74f, 14.6f)
                curveTo(6.93f, 14.39f, 7.2f, 14.28f, 7.5f, 14.28f)
                horizontalLineTo(7.7f)
                lineTo(10f, 16f)
                verticalLineTo(8f)
                curveTo(10f, 7.45f, 10.45f, 7f, 11f, 7f)
                reflectiveCurveTo(12f, 7.45f, 12f, 8f)
                verticalLineTo(12.47f)
                lineTo(13.21f, 12.6f)
                lineTo(17.15f, 14.79f)
                curveTo(17.68f, 15.03f, 18f, 15.56f, 18f, 16.14f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _GestureTapBox!!
    }

@Suppress("ObjectPropertyName")
private var _GestureTapBox: ImageVector? = null
