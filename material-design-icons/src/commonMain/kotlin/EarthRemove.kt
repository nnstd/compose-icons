package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarthRemove: ImageVector
    get() {
        if (_EarthRemove != null) {
            return _EarthRemove!!
        }
        _EarthRemove = ImageVector.Builder(
            name = "EarthRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.47f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 15.88f)
                moveTo(20f, 12f)
                curveTo(20f, 8.64f, 17.93f, 5.77f, 15f, 4.59f)
                verticalLineTo(5f)
                curveTo(15f, 6.1f, 14.1f, 7f, 13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                curveTo(11f, 9.55f, 10.55f, 10f, 10f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                curveTo(14.5f, 12f, 14.9f, 12.35f, 15f, 12.81f)
                curveTo(13.2f, 13.85f, 12f, 15.79f, 12f, 18f)
                curveTo(12f, 19.5f, 12.54f, 20.85f, 13.44f, 21.9f)
                lineTo(12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                lineTo(21.9f, 13.44f)
                curveTo(21.34f, 12.96f, 20.7f, 12.59f, 20f, 12.34f)
                lineTo(20f, 12f)
                moveTo(11f, 19.93f)
                verticalLineTo(18f)
                curveTo(9.9f, 18f, 9f, 17.1f, 9f, 16f)
                verticalLineTo(15f)
                lineTo(4.21f, 10.21f)
                curveTo(4.08f, 10.78f, 4f, 11.38f, 4f, 12f)
                curveTo(4f, 16.08f, 7.06f, 19.44f, 11f, 19.93f)
                close()
            }
        }.build()

        return _EarthRemove!!
    }

@Suppress("ObjectPropertyName")
private var _EarthRemove: ImageVector? = null
