package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GuitarElectric: ImageVector
    get() {
        if (_GuitarElectric != null) {
            return _GuitarElectric!!
        }
        _GuitarElectric = ImageVector.Builder(
            name = "GuitarElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.59f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(20.41f)
                lineTo(15.12f, 10.29f)
                lineTo(13.71f, 8.9f)
                lineTo(19.59f, 3f)
                moveTo(12f, 9f)
                curveTo(12.26f, 9f, 12.5f, 9.1f, 12.71f, 9.3f)
                lineTo(14.71f, 11.3f)
                curveTo(14.89f, 11.5f, 15f, 11.73f, 15f, 12f)
                lineTo(14.9f, 12.4f)
                lineTo(10.9f, 20.4f)
                curveTo(10.71f, 20.75f, 10.36f, 20.93f, 10f, 20.93f)
                curveTo(9.65f, 20.93f, 9.29f, 20.75f, 9.11f, 20.4f)
                lineTo(7.25f, 16.7f)
                lineTo(3.55f, 14.9f)
                curveTo(3.18f, 14.7f, 3f, 14.35f, 3f, 14f)
                curveTo(3f, 13.65f, 3.18f, 13.3f, 3.55f, 13.1f)
                lineTo(11.55f, 9.1f)
                curveTo(11.69f, 9f, 11.84f, 9f, 12f, 9f)
                moveTo(9.35f, 11.82f)
                lineTo(8.65f, 12.5f)
                lineTo(11.5f, 15.35f)
                lineTo(12.18f, 14.65f)
                lineTo(9.35f, 11.82f)
                moveTo(7.94f, 13.23f)
                lineTo(7.23f, 13.94f)
                lineTo(10.06f, 16.77f)
                lineTo(10.77f, 16.06f)
                lineTo(7.94f, 13.23f)
                close()
            }
        }.build()

        return _GuitarElectric!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarElectric: ImageVector? = null
