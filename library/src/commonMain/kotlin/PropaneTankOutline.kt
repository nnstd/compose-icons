package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PropaneTankOutline: ImageVector
    get() {
        if (_PropaneTankOutline != null) {
            return _PropaneTankOutline!!
        }
        _PropaneTankOutline = ImageVector.Builder(
            name = "PropaneTankOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 6.14f)
                verticalLineTo(4f)
                curveTo(17f, 2.9f, 16.1f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.9f, 2f, 7f, 2.9f, 7f, 4f)
                verticalLineTo(6.14f)
                curveTo(5.28f, 6.59f, 4f, 8.14f, 4f, 10f)
                verticalLineTo(18f)
                curveTo(4f, 20.21f, 5.79f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(18.21f, 22f, 20f, 20.21f, 20f, 18f)
                verticalLineTo(10f)
                curveTo(20f, 8.14f, 18.72f, 6.59f, 17f, 6.14f)
                moveTo(9f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                curveTo(13f, 5.45f, 12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 5.45f, 11f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                curveTo(17.1f, 8f, 18f, 8.9f, 18f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                curveTo(6f, 8.9f, 6.9f, 8f, 8f, 8f)
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                curveTo(6.9f, 20f, 6f, 19.1f, 6f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                curveTo(18f, 19.1f, 17.1f, 20f, 16f, 20f)
                close()
            }
        }.build()

        return _PropaneTankOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PropaneTankOutline: ImageVector? = null
