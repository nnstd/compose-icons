package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoneOff: ImageVector
    get() {
        if (_BoneOff != null) {
            return _BoneOff!!
        }
        _BoneOff = ImageVector.Builder(
            name = "BoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5.1f, 7f)
                horizontalLineTo(5f)
                curveTo(3.3f, 7f, 2f, 8.3f, 2f, 10f)
                curveTo(2f, 10.8f, 2.3f, 11.5f, 2.8f, 12f)
                curveTo(2.3f, 12.5f, 2f, 13.2f, 2f, 14f)
                curveTo(2f, 15.7f, 3.3f, 17f, 5f, 17f)
                reflectiveCurveTo(8f, 15.7f, 8f, 14f)
                curveTo(9.3f, 13.9f, 10.6f, 13.8f, 11.9f, 13.8f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(20f, 16.8f)
                lineTo(13.3f, 10.1f)
                curveTo(14.2f, 10.1f, 15.1f, 10f, 16f, 10f)
                curveTo(16f, 8.3f, 17.3f, 7f, 19f, 7f)
                reflectiveCurveTo(22f, 8.3f, 22f, 10f)
                curveTo(22f, 10.8f, 21.7f, 11.5f, 21.2f, 12f)
                curveTo(21.7f, 12.5f, 22f, 13.2f, 22f, 14f)
                curveTo(22f, 15.3f, 21.2f, 16.4f, 20f, 16.8f)
                close()
            }
        }.build()

        return _BoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _BoneOff: ImageVector? = null
