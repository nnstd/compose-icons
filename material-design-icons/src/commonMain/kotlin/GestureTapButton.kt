package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureTapButton: ImageVector
    get() {
        if (_GestureTapButton != null) {
            return _GestureTapButton!!
        }
        _GestureTapButton = ImageVector.Builder(
            name = "GestureTapButton",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 5f)
                curveTo(15.21f, 5f, 17f, 6.79f, 17f, 9f)
                curveTo(17f, 10.5f, 16.2f, 11.77f, 15f, 12.46f)
                verticalLineTo(11.24f)
                curveTo(15.61f, 10.69f, 16f, 9.89f, 16f, 9f)
                curveTo(16f, 7.34f, 14.66f, 6f, 13f, 6f)
                reflectiveCurveTo(10f, 7.34f, 10f, 9f)
                curveTo(10f, 9.89f, 10.39f, 10.69f, 11f, 11.24f)
                verticalLineTo(12.46f)
                curveTo(9.8f, 11.77f, 9f, 10.5f, 9f, 9f)
                curveTo(9f, 6.79f, 10.79f, 5f, 13f, 5f)
                moveTo(20f, 20.5f)
                curveTo(19.97f, 21.32f, 19.32f, 21.97f, 18.5f, 22f)
                horizontalLineTo(13f)
                curveTo(12.62f, 22f, 12.26f, 21.85f, 12f, 21.57f)
                lineTo(8f, 17.37f)
                lineTo(8.74f, 16.6f)
                curveTo(8.93f, 16.39f, 9.2f, 16.28f, 9.5f, 16.28f)
                horizontalLineTo(9.7f)
                lineTo(12f, 18f)
                verticalLineTo(9f)
                curveTo(12f, 8.45f, 12.45f, 8f, 13f, 8f)
                reflectiveCurveTo(14f, 8.45f, 14f, 9f)
                verticalLineTo(13.47f)
                lineTo(15.21f, 13.6f)
                lineTo(19.15f, 15.79f)
                curveTo(19.68f, 16.03f, 20f, 16.56f, 20f, 17.14f)
                verticalLineTo(20.5f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(12f)
                curveTo(2f, 13.11f, 2.9f, 14f, 4f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                lineTo(4f, 12f)
                lineTo(4f, 4f)
                horizontalLineTo(20f)
                lineTo(20f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(13.96f)
                lineTo(20.04f, 14f)
                curveTo(21.13f, 14f, 22f, 13.09f, 22f, 12f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _GestureTapButton!!
    }

@Suppress("ObjectPropertyName")
private var _GestureTapButton: ImageVector? = null
