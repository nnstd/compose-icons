package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeVariantOff: ImageVector
    get() {
        if (_VolumeVariantOff != null) {
            return _VolumeVariantOff!!
        }
        _VolumeVariantOff = ImageVector.Builder(
            name = "VolumeVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.64f, 3.64f)
                lineTo(21.36f, 19.36f)
                lineTo(19.95f, 20.78f)
                lineTo(16f, 16.83f)
                verticalLineTo(20f)
                lineTo(11f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(8.17f)
                lineTo(4.22f, 5.05f)
                lineTo(5.64f, 3.64f)
                moveTo(16f, 4f)
                verticalLineTo(11.17f)
                lineTo(12.41f, 7.58f)
                lineTo(16f, 4f)
                close()
            }
        }.build()

        return _VolumeVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeVariantOff: ImageVector? = null
