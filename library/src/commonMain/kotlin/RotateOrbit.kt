package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RotateOrbit: ImageVector
    get() {
        if (_RotateOrbit != null) {
            return _RotateOrbit!!
        }
        _RotateOrbit = ImageVector.Builder(
            name = "RotateOrbit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14.25f)
                lineTo(4.75f, 11f)
                horizontalLineTo(7f)
                curveTo(7.25f, 5.39f, 9.39f, 1f, 12f, 1f)
                curveTo(14f, 1f, 15.77f, 3.64f, 16.55f, 7.45f)
                curveTo(20.36f, 8.23f, 23f, 10f, 23f, 12f)
                curveTo(23f, 13.83f, 20.83f, 15.43f, 17.6f, 16.3f)
                lineTo(17.89f, 14.27f)
                curveTo(19.8f, 13.72f, 21f, 12.91f, 21f, 12f)
                curveTo(21f, 10.94f, 19.35f, 10f, 16.87f, 9.5f)
                curveTo(16.95f, 10.29f, 17f, 11.13f, 17f, 12f)
                curveTo(17f, 18.08f, 14.76f, 23f, 12f, 23f)
                curveTo(10.17f, 23f, 8.57f, 20.83f, 7.7f, 17.6f)
                lineTo(9.73f, 17.89f)
                curveTo(10.28f, 19.8f, 11.09f, 21f, 12f, 21f)
                curveTo(13.66f, 21f, 15f, 16.97f, 15f, 12f)
                curveTo(15f, 11f, 14.95f, 10.05f, 14.85f, 9.15f)
                curveTo(13.95f, 9.05f, 13f, 9f, 12f, 9f)
                lineTo(10.14f, 9.06f)
                lineTo(10.43f, 7.05f)
                lineTo(12f, 7f)
                curveTo(12.87f, 7f, 13.71f, 7.05f, 14.5f, 7.13f)
                curveTo(14f, 4.65f, 13.06f, 3f, 12f, 3f)
                curveTo(10.46f, 3f, 9.18f, 6.5f, 9f, 11f)
                horizontalLineTo(11.25f)
                lineTo(8f, 14.25f)
                moveTo(14.25f, 16f)
                lineTo(11f, 19.25f)
                verticalLineTo(17f)
                curveTo(5.39f, 16.75f, 1f, 14.61f, 1f, 12f)
                curveTo(1f, 10.17f, 3.17f, 8.57f, 6.4f, 7.7f)
                lineTo(6.11f, 9.73f)
                curveTo(4.2f, 10.28f, 3f, 11.09f, 3f, 12f)
                curveTo(3f, 13.54f, 6.5f, 14.82f, 11f, 15f)
                verticalLineTo(12.75f)
                lineTo(14.25f, 16f)
                close()
            }
        }.build()

        return _RotateOrbit!!
    }

@Suppress("ObjectPropertyName")
private var _RotateOrbit: ImageVector? = null
