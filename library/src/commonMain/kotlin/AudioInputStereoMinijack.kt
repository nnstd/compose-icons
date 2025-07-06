package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AudioInputStereoMinijack: ImageVector
    get() {
        if (_AudioInputStereoMinijack != null) {
            return _AudioInputStereoMinijack!!
        }
        _AudioInputStereoMinijack = ImageVector.Builder(
            name = "AudioInputStereoMinijack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                verticalLineTo(3f)
                curveTo(11f, 2.45f, 11.45f, 2f, 12f, 2f)
                reflectiveCurveTo(13f, 2.45f, 13f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                moveTo(13f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                curveTo(9f, 16.3f, 9.84f, 17.4f, 11f, 17.82f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(17.82f)
                curveTo(14.16f, 17.4f, 15f, 16.3f, 15f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _AudioInputStereoMinijack!!
    }

@Suppress("ObjectPropertyName")
private var _AudioInputStereoMinijack: ImageVector? = null
