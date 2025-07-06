package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeSource: ImageVector
    get() {
        if (_VolumeSource != null) {
            return _VolumeSource!!
        }
        _VolumeSource = ImageVector.Builder(
            name = "VolumeSource",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                lineTo(12f, 20f)
                verticalLineTo(4f)
                lineTo(7f, 9f)
                horizontalLineTo(3f)
                moveTo(16f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(20f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _VolumeSource!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeSource: ImageVector? = null
