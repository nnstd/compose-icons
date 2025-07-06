package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoStandardDefinition: ImageVector
    get() {
        if (_VideoStandardDefinition != null) {
            return _VideoStandardDefinition!!
        }
        _VideoStandardDefinition = ImageVector.Builder(
            name = "VideoStandardDefinition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14f)
                verticalLineTo(10f)
                curveTo(14f, 9.7f, 13.8f, 9.5f, 13.5f, 9.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(13.5f)
                curveTo(13.8f, 14.5f, 14f, 14.3f, 14f, 14f)
                moveTo(17f, 7f)
                verticalLineTo(10.5f)
                lineTo(21f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17f, 13.5f)
                verticalLineTo(17f)
                curveTo(17f, 17.6f, 16.6f, 18f, 16f, 18f)
                horizontalLineTo(4f)
                curveTo(3.4f, 18f, 3f, 17.6f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 6.4f, 3.4f, 6f, 4f, 6f)
                horizontalLineTo(16f)
                curveTo(16.6f, 6f, 17f, 6.4f, 17f, 7f)
                moveTo(14f, 16f)
                curveTo(14.8f, 16f, 15.5f, 15.3f, 15.5f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(15.5f, 8.7f, 14.8f, 8f, 14f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                moveTo(9f, 8f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 8f, 4f, 8.67f, 4f, 9.5f)
                verticalLineTo(11f)
                curveTo(4f, 11.83f, 4.67f, 12.5f, 5.5f, 12.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(7.5f)
                curveTo(8.33f, 16f, 9f, 15.33f, 9f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(9f, 11.67f, 8.33f, 11f, 7.5f, 11f)
                horizontalLineTo(5.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _VideoStandardDefinition!!
    }

@Suppress("ObjectPropertyName")
private var _VideoStandardDefinition: ImageVector? = null
