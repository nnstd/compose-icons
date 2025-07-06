package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeMute: ImageVector
    get() {
        if (_VolumeMute != null) {
            return _VolumeMute!!
        }
        _VolumeMute = ImageVector.Builder(
            name = "VolumeMute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                horizontalLineTo(7f)
                lineTo(12f, 4f)
                verticalLineTo(20f)
                lineTo(7f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                moveTo(16.59f, 12f)
                lineTo(14f, 9.41f)
                lineTo(15.41f, 8f)
                lineTo(18f, 10.59f)
                lineTo(20.59f, 8f)
                lineTo(22f, 9.41f)
                lineTo(19.41f, 12f)
                lineTo(22f, 14.59f)
                lineTo(20.59f, 16f)
                lineTo(18f, 13.41f)
                lineTo(15.41f, 16f)
                lineTo(14f, 14.59f)
                lineTo(16.59f, 12f)
                close()
            }
        }.build()

        return _VolumeMute!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMute: ImageVector? = null
