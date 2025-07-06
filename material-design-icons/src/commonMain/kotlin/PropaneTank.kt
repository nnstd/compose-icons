package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PropaneTank: ImageVector
    get() {
        if (_PropaneTank != null) {
            return _PropaneTank!!
        }
        _PropaneTank = ImageVector.Builder(
            name = "PropaneTank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 15f)
                verticalLineTo(18f)
                curveTo(4f, 20.21f, 5.79f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(18.21f, 22f, 20f, 20.21f, 20f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                moveTo(20f, 13f)
                verticalLineTo(10f)
                curveTo(20f, 8.14f, 18.72f, 6.59f, 17f, 6.14f)
                verticalLineTo(4f)
                curveTo(17f, 2.9f, 16.1f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.9f, 2f, 7f, 2.9f, 7f, 4f)
                verticalLineTo(6.14f)
                curveTo(5.28f, 6.59f, 4f, 8.14f, 4f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(9f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                curveTo(13f, 5.45f, 12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 5.45f, 11f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _PropaneTank!!
    }

@Suppress("ObjectPropertyName")
private var _PropaneTank: ImageVector? = null
