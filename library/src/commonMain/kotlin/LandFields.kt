package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandFields: ImageVector
    get() {
        if (_LandFields != null) {
            return _LandFields!!
        }
        _LandFields = ImageVector.Builder(
            name = "LandFields",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(15.3f, 4f)
                curveTo(14.5f, 5.1f, 14f, 6.5f, 14f, 8f)
                horizontalLineTo(10f)
                curveTo(10f, 6.4f, 10.8f, 4.9f, 12f, 4f)
                horizontalLineTo(15.3f)
                moveTo(14f, 14f)
                horizontalLineTo(10f)
                curveTo(10f, 12.5f, 9.5f, 11.1f, 8.7f, 10f)
                horizontalLineTo(12f)
                curveTo(13.2f, 10.9f, 14f, 12.4f, 14f, 14f)
                moveTo(4f, 4f)
                horizontalLineTo(9.3f)
                curveTo(8.5f, 5.1f, 8f, 6.5f, 8f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(4f, 10f)
                horizontalLineTo(6f)
                curveTo(7.2f, 10.9f, 8f, 12.3f, 8f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                moveTo(4f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(9.3f)
                curveTo(8.5f, 17.1f, 8f, 18.5f, 8f, 20f)
                horizontalLineTo(4f)
                moveTo(10f, 20f)
                curveTo(10f, 18.4f, 10.8f, 16.9f, 12f, 16f)
                horizontalLineTo(15.3f)
                curveTo(14.5f, 17.1f, 14f, 18.5f, 14f, 20f)
                horizontalLineTo(10f)
                moveTo(20f, 20f)
                horizontalLineTo(16f)
                curveTo(16f, 18.4f, 16.8f, 16.9f, 18f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(20f, 14f)
                horizontalLineTo(16f)
                curveTo(16f, 12.5f, 15.5f, 11.1f, 14.7f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                moveTo(20f, 8f)
                horizontalLineTo(16f)
                curveTo(16f, 6.4f, 16.8f, 4.9f, 18f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _LandFields!!
    }

@Suppress("ObjectPropertyName")
private var _LandFields: ImageVector? = null
