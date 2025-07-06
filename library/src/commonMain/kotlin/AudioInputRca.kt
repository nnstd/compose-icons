package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AudioInputRca: ImageVector
    get() {
        if (_AudioInputRca != null) {
            return _AudioInputRca!!
        }
        _AudioInputRca = ImageVector.Builder(
            name = "AudioInputRca",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                curveTo(7f, 1.45f, 7.45f, 1f, 8f, 1f)
                reflectiveCurveTo(9f, 1.45f, 9f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(5f, 14f)
                verticalLineTo(16f)
                curveTo(5f, 17.3f, 5.84f, 18.4f, 7f, 18.82f)
                verticalLineTo(23f)
                horizontalLineTo(9f)
                verticalLineTo(18.82f)
                curveTo(10.16f, 18.4f, 11f, 17.3f, 11f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                moveTo(17f, 6f)
                verticalLineTo(2f)
                curveTo(17f, 1.45f, 16.55f, 1f, 16f, 1f)
                reflectiveCurveTo(15f, 1.45f, 15f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                moveTo(13f, 14f)
                verticalLineTo(16f)
                curveTo(13f, 17.3f, 13.84f, 18.4f, 15f, 18.82f)
                verticalLineTo(23f)
                horizontalLineTo(17f)
                verticalLineTo(18.82f)
                curveTo(18.16f, 18.4f, 19f, 17.3f, 19f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _AudioInputRca!!
    }

@Suppress("ObjectPropertyName")
private var _AudioInputRca: ImageVector? = null
