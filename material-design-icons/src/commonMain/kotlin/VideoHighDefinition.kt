package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoHighDefinition: ImageVector
    get() {
        if (_VideoHighDefinition != null) {
            return _VideoHighDefinition!!
        }
        _VideoHighDefinition = ImageVector.Builder(
            name = "VideoHighDefinition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                verticalLineTo(14f)
                curveTo(14f, 14.3f, 13.8f, 14.5f, 13.5f, 14.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                curveTo(13.8f, 9.5f, 14f, 9.7f, 14f, 10f)
                moveTo(17f, 10.5f)
                verticalLineTo(7f)
                curveTo(17f, 6.4f, 16.6f, 6f, 16f, 6f)
                horizontalLineTo(4f)
                curveTo(3.4f, 6f, 3f, 6.4f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 17.6f, 3.4f, 18f, 4f, 18f)
                horizontalLineTo(16f)
                curveTo(16.6f, 18f, 17f, 17.6f, 17f, 17f)
                verticalLineTo(13.5f)
                lineTo(21f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17f, 10.5f)
                moveTo(9.5f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(12.8f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(4.5f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(11.2f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(9.5f)
                verticalLineTo(16f)
                moveTo(15.5f, 14.5f)
                curveTo(15.5f, 15.3f, 14.8f, 16f, 14f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                curveTo(14.8f, 8f, 15.5f, 8.7f, 15.5f, 9.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _VideoHighDefinition!!
    }

@Suppress("ObjectPropertyName")
private var _VideoHighDefinition: ImageVector? = null
